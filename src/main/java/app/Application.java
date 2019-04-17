package app;

import app.workout.Results;
import app.workout.Workout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SSLFix.execute();
        SpringApplication.run(Application.class);
    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }


    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
            headers.add("User-Agent", "Spring's RestTemplate");
            headers.add("Authorization", "Token eb46599f63fd918acde2d70970cd161d35a9a059");
            ResponseEntity<Workout> workout = restTemplate.exchange("https://wger.de/api/v2/workout/?format=json",
                    HttpMethod.GET, new HttpEntity<>("parameters", headers), Workout.class);
            ResponseEntity<Results> result = restTemplate.exchange("https://wger.de/api/v2/workout/?format=json",
                    HttpMethod.GET, new HttpEntity<>("parameters", headers), Results.class);
;
            log.info(result.getBody().getComment().toString());

        };
    }


}