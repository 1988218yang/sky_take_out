package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.dto.PasswordEditDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    void editPassword(PasswordEditDTO passwordEditDTO);

    void add(EmployeeDTO employeeDTO);

    PageResult checkByPage(EmployeePageQueryDTO employeePageQueryDTO);

    EmployeeDTO checkById(Long id);

    void changeStatus(Integer status, Long id);

    void update(EmployeeDTO employeeDTO);
}
