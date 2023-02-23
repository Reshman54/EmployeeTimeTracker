package com.services.employee.EmployeeTimeTracker.services;

public class SalariedEmployee extends Employee {
    @Override
    protected double getVacationDaysPerYear() {
        return 15;
    }
}
