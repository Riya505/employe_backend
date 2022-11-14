package com.nestdigital.employe_backend.dao;

import com.nestdigital.employe_backend.model.EmployeModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeDao extends CrudRepository<EmployeModel,Integer> {

    @Modifying
    @Query(value = "DELETE FROM `employe` WHERE `id`= :id",nativeQuery = true)
    void deleteEmployeeById(Integer id);

    @Query(value = "SELECT * FROM `employe` WHERE `name` LIKE concat('%',:name,'%')",nativeQuery = true)
    List<EmployeModel> SearchEmployee(String name);
}
