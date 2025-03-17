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

		//RecommenderImplementation is a bean created by the spring container
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		//call the recommendMovies method
		String[] result = recommender.recommendMovies("Finding Dory");
		
		//display the recommended movies
		System.out.println(Arrays.toString(result));
	}

}
