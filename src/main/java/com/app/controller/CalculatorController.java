package com.app.controller;

import com.app.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestParam double num1, @RequestParam double num2) {
        double result = calculatorService.add(num1, num2);
        return ResponseEntity.ok(result);
    }
    @PostMapping("/subtract")
    public ResponseEntity<?> subtract(@RequestParam double num1, @RequestParam double num2){
        double result=calculatorService.subtract(num1, num2);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/multiply")
    public ResponseEntity<?> multiply(@RequestParam double num1, @RequestParam double num2){
        double result=calculatorService.multiply(num1, num2);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/divide")
    public ResponseEntity<?> divide(@RequestParam double num1, @RequestParam double num2) {
        if (num2 == 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cannot divide by zero");
        }
        double result = calculatorService.divide(num1, num2);
        return ResponseEntity.ok(result);
    }

}
