package net.javaguides.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// // to make a Java class as a Spring MVC Controller
// @ResponseBody
// // tells a controller that the object returned is automatically serialized into JSON
// // and passed back into the HttpRequest object

@RestController
// combination of @Controller and @ResponseBody
public class HelloWorldController {

    // HTTP GET request
    // http://localhost:8080/hello-world
    @GetMapping("/hello-world") // to map HTTP GET request onto specific handler method
    public String helloWorld() {
        return "Hello World!";
    }
}
