package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ConfigurationParam {

    @Value("${dollarOfficial}")
    double dollarOfficial;

    double getOfficialDollar() {
        return dollarOfficial;
    }
}
