package springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("springdemo")
@PropertySource("classpath:sports.properties")
public class SportsConfig {
}
