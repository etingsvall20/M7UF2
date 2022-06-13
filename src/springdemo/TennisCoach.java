package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

    @Value("${foo.email}");
    private String emailAddress;

    @Value("${foo.team}")
    private String team;


    private GameStatsService gameStatsService;

    @Autowired
    @Qualifier("tennisAudienceService");
    private AudienceService audienceService;

    @Autowired
    public TennisCoach(GameStatsService gameStatsService) {
        this.gameStatsService = gameStatsService;
    }


    @Override
    public String getDailyPractice() {
        return "Tennis coach: Practice your backhand volley";
    }

    @Override
    public String getLastGameStats() {
        return gameStatsService.getLastGameStats();
    }

    @Override
    public String getAudience() { return this.audienceService.getAudience();}

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
