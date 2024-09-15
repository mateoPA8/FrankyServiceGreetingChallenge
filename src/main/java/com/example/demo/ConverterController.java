package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    @Autowired
    ConverterService converterService;
    /*ConverterController(ConverterService converterService){
        this.converterService = converterService;
    }
*/


    @GetMapping("/status")
    public String getStatus() {
        return "OK";
    }

    @PostMapping("/converter/celcius-to-fahrenheit")
    public ResponseEntity<ConverterResponseDto> celciusToFahrenheit(@RequestBody ConverterRequestDto converterRequestDto) {
        ConverterResponseDto response = new ConverterResponseDto(
                converterService.celsiusToFahrenheit(
                        converterRequestDto.value()
                ),
                "F");
        return ResponseEntity.ok(response);
    }
    @PostMapping("/converter/fahrenheit-to-celcius")
    public ResponseEntity<ConverterResponseDto> fahrenheitToCelcius(@RequestBody ConverterRequestDto converterRequestDto) {
        ConverterResponseDto response = new ConverterResponseDto(
                converterService.fahrenheitToCelsius(
                        converterRequestDto.value()
                ),
                "C");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/converter/dollar-to-bolivian")
    public ResponseEntity<ConverterResponseDto> dollarToBolivian(@RequestBody ConverterRequestDto converterRequestDto) {
        ConverterResponseDto response = new ConverterResponseDto(
                converterService.dollarToBolivian(
                        converterRequestDto.value()
                ),
                "B");
        return ResponseEntity.ok(response);
    }
    @PostMapping("/converter/bolivian-to-dollar")
    public ResponseEntity<ConverterResponseDto> bolivianToDollar(@RequestBody ConverterRequestDto converterRequestDto) {
        ConverterResponseDto response = new ConverterResponseDto(
                converterService.bolivianToDollar(
                        converterRequestDto.value()
                ),
                "D");
        return ResponseEntity.ok(response);
    }
}
