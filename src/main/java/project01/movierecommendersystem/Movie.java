package project01.movierecommendersystem;

public class Movie {
    //for keeping track of instances created
    private static int instances = 0;

    private String id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        instances++;
        System.out.println("Instances created: " + instances);
    }

    public static int getInstances() {
        return Movie.instances;
    }
}
