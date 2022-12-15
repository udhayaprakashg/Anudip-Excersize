package com.example.demo.Calculator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Calculator.Service.CalcService;


@RestController
public class CalcController {
@Autowired
CalcService calcService;
//http://localhost/2022/calc/10/5
@GetMapping("/calc/{a}/{b}")
public int calcDiv(@PathVariable int a, @PathVariable int b) {
return calcService.testDiv(a, b);}}