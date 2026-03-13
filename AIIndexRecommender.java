package optimizer;

public class AIIndexRecommender {

    public static String recommendIndex(String query){

        query = query.toLowerCase();

        if(query.contains("department"))
        {
            return "CREATE INDEX idx_department ON students(department)";
        }

        if(query.contains("age"))
        {
            return "CREATE INDEX idx_age ON students(age)";
        }

        return "No Index Recommendation";
    }
}