package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ConverterServiceTest {
    @Mock
    ConfigurationParam configurationParam;
    @InjectMocks
    ConverterService converterService;

    @Test
    @DisplayName("Method to convert celcius to fahrenheit")
    void celsiusToFahrenheit() {
        assertEquals(212, converterService.celsiusToFahrenheit((100)));
    }

    @Test
    @DisplayName("Method to convert fahrenheit to celcius")
    void fahrenheitToCelsius() {
        assertEquals(100, converterService.fahrenheitToCelsius((212)));
    }

    @Test
    @DisplayName("Method to convert dollars to bolivian")
    void dollarToBolivian() {
        when(configurationParam.getOfficialDollar()).thenReturn(6.96);
        assertEquals(100, converterService.bolivianToDollar(696));
    }

    @Test
    @DisplayName("Method to convert fahrenheit to celcius")
    void bolivianToDollar() {
        when(configurationParam.getOfficialDollar()).thenReturn(6.96);
        assertEquals(696, converterService.dollarToBolivian((100)));
    }
}