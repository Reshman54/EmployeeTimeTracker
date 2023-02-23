package com.services.employee.EmployeeTimeTracker.services;

public abstract class Employee {
    protected double vacationDays;

    public Employee() {
        vacationDays = 0;
    }

    public double getVacationDays() {
        return vacationDays;
    }

    public void work(int days) {
        if (days < 0 || days > 260) {
            throw new IllegalArgumentException("Invalid number of workdays: " + days);
        }
        double vacationDaysPerYear = getVacationDaysPerYear(); // Get the number of vacation days per year
        double dayWorkedOfWorkYear = days / 260.0; // Calculate the days worked of work year worked
        double vacationDaysToAdd = vacationDaysPerYear * dayWorkedOfWorkYear; // Calculate the vacation days to add
        vacationDays = vacationDays + vacationDaysToAdd;
    }

    public void takeVacation(double days) {
        if (days < 0 || days > vacationDays) {
            throw new IllegalArgumentException("Invalid number of vacation days: " + days);
        }
        vacationDays = vacationDays - days;
    }

    protected abstract double getVacationDaysPerYear();
}
