package com.sanbro.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class SonySpeaker implements Speaker {
    @Override
    public String makeSound(){
        return "music playing from Sony Speakers";
    }
}
