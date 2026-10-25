package com.example.ems.Employee.service.impl;

import com.example.ems.Employee.dto.EmployeeDto;
import com.example.ems.Employee.entity.Department;
import com.example.ems.Employee.entity.Employee;
import com.example.ems.Employee.exception.ResourceNotFoundException;
import com.example.ems.Employee.mapper.EmployeeMapper;
import com.example.ems.Employee.repository.DepartmentRepository;
import com.example.ems.Employee.repository.EmployeeRepository;
import com.example.ems.Employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

        private EmployeeRepository employeeRepository;
        private DepartmentRepository departmentRepository;

        @Override
        public EmployeeDto createEmployee(EmployeeDto employeeDto) {

            Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
            Department department = departmentRepository.findById(employeeDto.getDepartmentId())
                    .orElseThrow(() ->
                            new ResourceNotFoundException("Department is not exists with id: " + employeeDto.getDepartmentId()));

            employee.setDepartment(department);
            Employee savedEmployee = employeeRepository.save(employee);
            return EmployeeMapper.mapToEmployeeDto(savedEmployee);
        }

        @Override
        public EmployeeDto getEmployeeById(Long employeeId) {
            Employee employee = employeeRepository.findById(employeeId)
                    .orElseThrow(() ->
                            new ResourceNotFoundException("Employee is not exists with given id : " + employeeId));

            return EmployeeMapper.mapToEmployeeDto(employee);
        }

        @Override
        public List<EmployeeDto> getAllEmployees() {
            List<Employee> employees = employeeRepository.findAll();
            return employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee))
                    .collect(Collectors.toList());
        }

        @Override
        public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {

            Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                    () -> new ResourceNotFoundException("Employee is not exists with given id: " + employeeId)
            );

            employee.setFirstName(updatedEmployee.getFirstName());
            employee.setLastName(updatedEmployee.getLastName());
            employee.setEmail(updatedEmployee.getEmail());

            Department department = departmentRepository.findById(updatedEmployee.getDepartmentId())
                    .orElseThrow(() ->
                            new ResourceNotFoundException("Department is not exists with id: " + updatedEmployee.getDepartmentId()));

            employee.setDepartment(department);

            Employee updatedEmployeeObj = employeeRepository.save(employee);

            return EmployeeMapper.mapToEmployeeDto(updatedEmployeeObj);
        }

        @Override
        public void deleteEmployee(Long employeeId) {

            Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                    () -> new ResourceNotFoundException("Employee is not exists with given id: " + employeeId)
            );

            employeeRepository.deleteById(employeeId);
        }
    }

