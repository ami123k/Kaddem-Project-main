package tn.esprit.kaddemproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class KaddemProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaddemProjectApplication.class, args);
    }

}
