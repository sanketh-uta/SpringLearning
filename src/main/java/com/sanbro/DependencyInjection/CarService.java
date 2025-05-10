package com.sanbro.DependencyInjection;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final Speaker speaker;
    private final Tyres tyre;

    @Autowired
    public CarService(@Qualifier("sonySpeaker") Speaker speaker,@Qualifier("ceatTyre") Tyres tyre){
        this.speaker = speaker;
        this.tyre = tyre;
    }
    public String getMusicInfo(){
        return this.speaker.makeSound();
    }
    public String getTyreManufactureInfo(){
        return tyre.tyreManufacturer();
    }

    @Override
    public String toString() {
        return "CarService{" +
                "speaker=" + speaker.makeSound() +
                ", tyre=" + tyre.tyreManufacturer() +
                '}';
    }
}
