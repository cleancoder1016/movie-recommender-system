package project01.movierecommendersystem;



public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of collaborative filtering
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
    
}