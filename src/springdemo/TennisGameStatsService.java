package springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisGameStatsService implements GameStatsService {

    @Override
    public String getLastGameStats() {
        return "Last tennis game stats: 3 sets won. ";
    }

}
