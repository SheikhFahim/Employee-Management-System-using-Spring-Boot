package com.example.MyEmpCRUD.MyCRUDEmplyee.Service;


import com.example.MyEmpCRUD.MyCRUDEmplyee.Entity.Emp;
import com.example.MyEmpCRUD.MyCRUDEmplyee.Repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    EmpRepo empRepo;

    public void addEmp(Emp e){
        empRepo.save(e);
    }

    public List<Emp> getAll(){
        return empRepo.findAll();
    }

    public Emp servedit(int id){
        Optional<Emp> o = empRepo.findById(id);
        if(o.isPresent()){
            return o.get();
        }
        else{
            return null;
        }
    }

    public void delet(int id){
        empRepo.deleteById(id);
    }
}
