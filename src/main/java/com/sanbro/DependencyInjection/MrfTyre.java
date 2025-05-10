package com.sanbro.DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MrfTyre implements Tyres{

    @Override
    public String tyreManufacturer() {
        return "Cotract given to Mrf Tyres";
    }
}
