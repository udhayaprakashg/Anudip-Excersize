package com.example.demo.Calculator.Service;

import org.springframework.stereotype.Service;
import com.example.demo.Calculator.Dao.CalcDao;
import com.example.demo.Calculator.Dao.DaoImpl;

@Service
public class CalcService {
public int testDiv(int x, int y) {
CalcDao c = new DaoImpl();
return c.divNo(x, y); }}
