package juliancambraia.springframework.guru.services;

import org.springframework.stereotype.Service;

/**
 * @author juliancambraia
 */
@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "hello - I was inected via the constructor!!!";
    }
}
