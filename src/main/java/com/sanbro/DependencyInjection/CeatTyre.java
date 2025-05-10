package com.sanbro.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class CeatTyre implements Tyres{

    @Override
    public String tyreManufacturer() {
        return "contract given to Ceat Tyres";
    }
}
