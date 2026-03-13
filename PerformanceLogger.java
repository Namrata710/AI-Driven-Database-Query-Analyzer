package optimizer;

import java.io.FileWriter;

public class PerformanceLogger {

    public static void log(String type,int rows,boolean index,long time){

        try{

            FileWriter writer =
            new FileWriter("../ai-model/dataset.csv",true);

            writer.append(type+","+rows+","+index+","+time+"\n");

            writer.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}