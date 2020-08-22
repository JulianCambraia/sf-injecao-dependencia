package juliancambraia.springframework.guru.controller;

import juliancambraia.springframework.guru.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectController {

    GreetingService greetingService;

    public ConstructorInjectController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
