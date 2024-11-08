package com.zero.pf4j.app.service;

import com.zero.pf4j.api.service.Greeting;
import org.pf4j.Extension;

@Extension
public class WelcomeGreeting implements Greeting {

    public String getGreeting() {
        return "Welcome";
    }

}