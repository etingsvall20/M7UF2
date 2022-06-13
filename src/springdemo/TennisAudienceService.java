package springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisAudienceService {

    @Override
    public String getAudience() { return "Tennis audience during last month: 68.000 people attended. "; }

}
