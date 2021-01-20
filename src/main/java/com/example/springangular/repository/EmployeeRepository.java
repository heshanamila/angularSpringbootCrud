package com.example.springangular.repository;

import com.example.springangular.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author heshan_c on 1/20/2021
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
