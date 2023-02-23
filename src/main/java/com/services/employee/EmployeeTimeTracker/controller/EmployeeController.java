package com.services.employee.EmployeeTimeTracker.controller;

import com.services.employee.EmployeeTimeTracker.services.Employee;
import com.services.employee.EmployeeTimeTracker.services.HourlyEmployee;
import com.services.employee.EmployeeTimeTracker.services.ManagerEmployee;
import com.services.employee.EmployeeTimeTracker.services.SalariedEmployee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final List<Employee> employees;

    public EmployeeController() {
        employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employees.add(new HourlyEmployee());
            employees.add(new SalariedEmployee());
            employees.add(new ManagerEmployee());
        }
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return employees;
    }

    @PostMapping("/{id}/work")
    public Employee work(@PathVariable int id, @RequestParam int days) {
        Employee employee = employees.get(id);
        employee.work(days);
        return employee;
    }

    @PostMapping("/{id}/vacation")
    public Employee takeVacation(@PathVariable int id, @RequestParam double days) {
        Employee employee = employees.get(id);
        employee.takeVacation(days);
        return employee;
    }
}
