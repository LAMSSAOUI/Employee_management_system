package com.example.demo.services;


import com.example.demo.Ripository.EmployeeRepository;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service  
public class EmplyeeServiceImpl implements  EmployeeService {
    private EmployeeRepository employeeRepository ;

    public EmplyeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
      @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();

            BeanUtils.copyProperties(employee , employeeEntity) ;
            employeeRepository.save(employeeEntity) ;
            return employee ;
    }
}
