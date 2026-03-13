package optimizer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryExecutor {

    public static long executeQuery(String query) {

        long start;
        long end;

        try {

            Connection conn = DBConnection.connect();
            Statement stmt = conn.createStatement();

            start = System.nanoTime();

            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                System.out.println(rs.getString("name"));
            }

            end = System.nanoTime();

            return (end-start)/1000000;

        } catch(Exception e){
            e.printStackTrace();
        }

        return 0;
    }
}