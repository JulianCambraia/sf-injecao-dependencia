package juliancambraia.springframework.guru.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getGermanGreeting() {
        return " German";
    }

    @Override
    public String getSpanishGreeting() {
        return " Spanish";
    }

    @Override
    public String getGreeting() {
        return "Default - English";
    }
}
