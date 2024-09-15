package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConverterService {

    ConfigurationParam configurationParam ;
    public ConverterService(ConfigurationParam configurationParam){
        this.configurationParam = configurationParam;
    }


    public double bolivianToDollar(double bolivian) {
        return bolivian / configurationParam.getOfficialDollar();
    }

    public double dollarToBolivian(double dollar) {
        return dollar * configurationParam.getOfficialDollar();
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
