package com.sb.Springboottute.RestAPI.service;

import com.sb.Springboottute.RestAPI.entity.Department;

import java.util.List;

public interface DepartmentService {
   public  Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
