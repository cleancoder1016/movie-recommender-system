package project01.movierecommendersystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class ContentBasedFilter implements Filter {
    //for keeping track of instances created
    private static int instances = 0;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Movie movie;

    public ContentBasedFilter() {
        super();
        logger.info("In ContentBasedFilter Constructor method");
    }

    @PostConstruct
    private void postConstruct() {
        //inititalization code
        logger.info("In ContentBasedFilter postConstruct method");
    }

    @PreDestroy
    private void preDestroy() {
        //cleanup code
        logger.info("In ContentBasedFilter preDestroy method");
    }
    
    public String[] getRecommendations(String movie) {
        //logic of content based filtering
        return new String[] {"Bahubali", "Dangal", "spyder"};
    }
}
