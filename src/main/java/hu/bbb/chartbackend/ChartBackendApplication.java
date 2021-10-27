package hu.bbb.chartbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChartBackendApplication {

    public static void main(String[] args) {

        try {
            SpringApplication.run(ChartBackendApplication.class, args);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
