package com.services.employee.EmployeeTimeTracker.services;

public class ManagerEmployee extends SalariedEmployee {
    @Override
    protected double getVacationDaysPerYear() {
        return 30;
    }
}
