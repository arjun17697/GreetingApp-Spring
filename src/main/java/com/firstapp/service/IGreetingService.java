package com.firstapp.service;

import com.firstapp.model.Greeting;
import com.firstapp.model.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
