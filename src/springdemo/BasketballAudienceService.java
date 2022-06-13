package springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballAudienceService implements AudienceService {
    @Override
    public String getAudience() {
        return "Basket audience in last month: 102.000";
    }
}
