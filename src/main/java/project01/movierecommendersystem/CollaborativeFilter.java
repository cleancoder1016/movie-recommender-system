package project01.movierecommendersystem;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filtering
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
    
}
