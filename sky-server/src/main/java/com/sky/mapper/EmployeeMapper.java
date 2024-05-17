package com.sky.mapper;

import com.sky.anno.AutoFill;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.dto.PasswordEditDTO;
import com.sky.entity.Employee;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     */
    Employee getByUsername(String username);
    @AutoFill(value = OperationType.INSERT)
    void add(Employee employee);

    List<Employee> checkByPage(EmployeePageQueryDTO employeePageQueryDTO);

    Employee checkById(Long id);
    @AutoFill(value = OperationType.UPDATE)
    void update(Employee employee);
}
