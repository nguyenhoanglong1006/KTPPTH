package com.example.SpringDataJDA.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringDataJDA.entity.ChuyenBay;

public interface EmployeeRepository extends CrudRepository<ChuyenBay, Long>{

	List<ChuyenBay> findEmployeeByLastNameContainning(String str);
}
