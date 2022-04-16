package com.example.MyEmpCRUD.MyCRUDEmplyee.Repository;

import com.example.MyEmpCRUD.MyCRUDEmplyee.Entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Emp,Integer> {
}
