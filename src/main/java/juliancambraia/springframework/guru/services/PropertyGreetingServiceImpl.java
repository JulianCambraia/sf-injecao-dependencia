package juliancambraia.springframework.guru.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return " Olá Spring Framework - por Property";
    }
}
