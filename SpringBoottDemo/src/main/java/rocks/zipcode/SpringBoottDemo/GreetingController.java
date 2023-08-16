package rocks.zipcode.SpringBoottDemo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController // Tell website what you want to happen, "I want to see...."
public class GreetingController {

    private static final String template = "Hello, %s!"; // %s is a placeholder for a string
    private final AtomicLong counter = new AtomicLong();
    // counter that keeps track how many greetings have been created

    @GetMapping("/greeting") // This method will handle HTTP GET requests to the "/greeting" URL.
    // http://localhost:8080/greeting?name=World
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "LIZ") String name)
    //@RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method
    // The method takes a parameter "name" from the request. If not provided, it uses "World" as a default value.
    {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
        // Create a new Greeting object with an incremented counter and a personalized message using the template.

    }

    @GetMapping("/greetings")
    public Greeting greetings(@RequestParam(value = "name", defaultValue = "Mate") String name)

    {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));

    }
}