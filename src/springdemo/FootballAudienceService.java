package springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballAudienceService implements AudienceService {
    @Override
    public String getAudience() {
        return "Football service audience last month: 250.000";
    }
}
