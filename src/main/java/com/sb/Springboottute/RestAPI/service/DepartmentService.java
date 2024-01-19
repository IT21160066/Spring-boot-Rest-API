package com.sb.Springboottute.RestAPI.service;

import com.sb.Springboottute.RestAPI.entity.Department;
import com.sb.Springboottute.RestAPI.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
   public  Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
