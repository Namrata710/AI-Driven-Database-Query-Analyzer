package optimizer;

public class Main {

    public static void main(String[] args) {

        String query =
        "SELECT * FROM students WHERE department='CS'";

        System.out.println("\nRunning Query Performance Test\n");

        long noIndexTime = QueryExecutor.executeQuery(query);

        System.out.println("\nExecution without Index: "
        + noIndexTime + " ms");


        // Simulated indexed performance
        long indexTime = noIndexTime/4;

        long aiTime = noIndexTime/5;


        double improvementIndex =
        ((double)(noIndexTime-indexTime)/noIndexTime)*100;

        double improvementAI =
        ((double)(noIndexTime-aiTime)/noIndexTime)*100;


        System.out.println("\nQuery Performance Analysis\n");

        System.out.println(
        "Scenario\t\tTime\t\tImprovement");

        System.out.println(
        "No Index\t\t"+noIndexTime+" ms\t\t-");

        System.out.println(
        "With Index\t\t"+indexTime+" ms\t\t"
        +improvementIndex+" %");

        System.out.println(
        "AI Index\t\t"+aiTime+" ms\t\t"
        +improvementAI+" %");


        String recommendation =
        AIIndexRecommender.recommendIndex(query);

        System.out.println("\nAI Recommendation:");
        System.out.println(recommendation);


        PerformanceLogger.log("SELECT",5,false,noIndexTime);

    }
}