package com.nestdigital.employe_backend.controller;

import com.nestdigital.employe_backend.dao.EmployeDao;
import com.nestdigital.employe_backend.model.EmployeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeDao dao;
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/EmployeEntry",consumes = "application/json",produces = "application/json")
    public String EmployeEntry(@RequestBody EmployeModel employeModel){
        System.out.println(employeModel.toString());
        dao.save(employeModel);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewEmploye")
    public List<EmployeModel> viewEmploye(){

        return (List<EmployeModel>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/deleteEmployee")
    public String deleteEmployee(@RequestBody EmployeModel employeModel){
        dao.deleteEmployeeById(employeModel.getId());
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path = "/searchEmployee",consumes = "application/json",produces = "application/json")
    public List<EmployeModel>searchEmployee(@RequestBody EmployeModel employeModel){
        return (List<EmployeModel>) dao.SearchEmployee(employeModel.getName());
    }
}
