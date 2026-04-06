package com.Dhruv.BillingSystem.utils;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class CommonUtils {
    public String getCurrentDateAndTime(){
        return LocalDate.now() + " " + LocalTime.now();
    }
}
