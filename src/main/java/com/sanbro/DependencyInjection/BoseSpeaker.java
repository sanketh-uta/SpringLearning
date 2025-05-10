package com.sanbro.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeaker implements Speaker{
    @Override
    public String makeSound(){
        return "music playing from the Bose Speaker";
    }
}
