package rocks.zipcode.SpringBootRESTfulDemo;


// In this lab, you are connecting you website to the api of another website,
// so it can pull quotes from other site and import them show them  randomly
// everytime you refresh the page
// http://localhost:8080/api/random = link


import org.slf4j.Logger;  // Import a tool for logging or recording messages in your program.
import org.slf4j.LoggerFactory;  // Import a way to create loggers in your code.
import org.springframework.boot.CommandLineRunner;  // Import a tool to run code when your program starts.
import org.springframework.boot.SpringApplication;  // Import a tool to start up your Spring Boot application.
import org.springframework.boot.autoconfigure.SpringBootApplication;  // Import a way to automatically configure your application.
import org.springframework.boot.web.client.RestTemplateBuilder;  // Import a tool to make HTTP requests.
import org.springframework.context.annotation.Bean;  // Import a way to define beans, which are objects Spring manages.
import org.springframework.web.client.RestTemplate;  // Import a tool to send HTTP requests and receive responses.

@SpringBootApplication  // Mark this class as the starting point of a Spring Boot application.
public class ConsumingRestApplication {

    private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);
    // Create a logger to record messages in your program.

    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestApplication.class, args);
        // Start your Spring Boot application.
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
        // Create and configure a RestTemplate, which is used to make HTTP requests.
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject(
                    "http://localhost:8080/api/random", Quote.class);
            // Use the RestTemplate to send a GET request to a URL and get a Quote object.

            log.info(quote.toString());
            // Log the Quote object to provide information.
        };
    }
}
//
// server.port=8081
// where you get all the quotes from, imports them
// copy and paste "server.port=8081" into "application.properties" under "resource" tab

// https://github.com/spring-guides/gs-consuming-rest.git - clone website into mac terminal
// cd into quotes
//run it using ./mvnw spring-boot:run