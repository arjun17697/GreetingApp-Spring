package com.firstapp.service;

import com.firstapp.model.Greeting;
import com.firstapp.model.User;
import com.firstapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public Greeting addGreeting(User user) {
        String message= String.format(template,(user.toString().isEmpty())?"Hello World":user.toString());

        return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));

    }

    @Override
    public Greeting getGreetingById(long id) {
        return null;
    }
}
