package com.example.springbootdemo.listener;

import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class DemoSpringApplicationRunListener implements SpringApplicationRunListener {

    @Override
    public void started(ConfigurableApplicationContext context) {
        // do whatever you want to do
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        // do whatever you want to do
    }
    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        // do whatever you want to do
    }
    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        // do whatever you want to do
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        // do whatever you want to do
    }
}
