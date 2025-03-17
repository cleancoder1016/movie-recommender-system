package project01.movierecommendersystem;

import org.springframework.stereotype.Component;

@Component
public interface Filter {
    public String[] getRecommendations(String movie);
}
