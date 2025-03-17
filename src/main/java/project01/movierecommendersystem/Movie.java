package project01.movierecommendersystem;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
}
