package project01.movierecommendersystem;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    //for keeping track of instances created
    private static int instances = 0;

    private String id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        instances++;
        System.out.println("Movie Constructor called");
    }

    public static int getInstances() {
        return Movie.instances;
    }

    public double movieSimilarity(int movie1, int movie2) {

        double similarity = 0.0;

        return similarity;
    }
}
