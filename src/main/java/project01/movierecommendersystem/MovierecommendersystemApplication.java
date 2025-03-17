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

		//Retrieve singleton bean from appContext
		ContentBasedFilter filter = appContext.getBean(ContentBasedFilter.class);
		System.out.println("ContentBasedFilter bean with singleton scope " + filter);

		//Retrieve prototype bean from appContext
		Movie movie1 = filter.getMovie();
		Movie movie2 = filter.getMovie();
		Movie movie3 = filter.getMovie();
		
		System.out.println("\n Movie bean with prototype scope");
		System.out.println(movie1);
		System.out.println(movie2);
		System.out.println(movie3);

		//print number of instances of each bean
		System.out.println("\n ContentBasedFilter instances: " + ContentBasedFilter.getInstances());
		System.out.println("Movie instances: " + Movie.getInstances());

	}

}
