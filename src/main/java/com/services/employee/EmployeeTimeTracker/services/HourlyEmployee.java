package com.services.employee.EmployeeTimeTracker.services;

public class HourlyEmployee extends Employee {
    @Override
    protected double getVacationDaysPerYear() {
        return 10;
    }
}
