package com.app.service;

import com.app.repository.CalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    @Autowired
    private CalculatorRepository calculatorRepository;
    public double add(double num1, double num2)
    {
        return num1+num2;
    }
    public double subtract(double num1, double num2)
    {
        return num1-num2;
    }
    public double multiply(double num1, double num2)
    {
        return num1*num2;
    }
    public double divide(double num1, double num2)
    {
        return num1/num2;
    }

}
