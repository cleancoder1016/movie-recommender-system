package project01.movierecommendersystem;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovierecommendersystemApplication {

	public static void main(String[] args) {
		//ApplicationContext is a spring container that manages the beans
		//that are needed by the application
		ApplicationContext appContext = SpringApplication.run(MovierecommendersystemApplication.class, args);	

		//use ApplicationContext to get recommender object
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);	
		System.out.println(recommender);
		  
		//Retrieving prototype bean from application context twice
		Movie m1 = appContext.getBean(Movie.class);
		System.out.println(m1);

		Movie m2 = appContext.getBean(Movie.class);
		System.out.println(m2);

	}

}
