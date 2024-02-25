package com.example.producersex;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Producer {
        @Produces
        int i = 20 + 35;
        @Produces
        double d = 1.4 * 6 - 3;


        @Produces
        @StringNumber1
        String text = "Hello, i 'm from producer class";
        @Produces
        @StringNumber2
        String text2 = "This is string number 2";

        @Produces
        @EmployeeRusso
        Employee employee = new Employee("Russo", 12000);

        @Produces
        @EmployeeElena
        Employee employee_2 = new Employee("Elena", 17000);
}
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@interface StringNumber2{}

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@interface StringNumber1{}

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@interface EmployeeRusso{}

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@interface EmployeeElena{}