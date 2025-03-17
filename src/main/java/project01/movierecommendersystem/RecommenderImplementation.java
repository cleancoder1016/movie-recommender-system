package project01.movierecommendersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //Filter is a dependency of this class
    @Autowired
    private Filter filter;

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }
    
    public String[] recommendMovies (String movie) {
        //use content based filtering to recommend movies
        System.out.println("\n Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations(movie);
        //return the recommended movies
        return results;
    }
}
