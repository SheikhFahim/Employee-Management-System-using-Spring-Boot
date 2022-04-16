package com.example.MyEmpCRUD.MyCRUDEmplyee.Controller;


import com.example.MyEmpCRUD.MyCRUDEmplyee.Entity.Emp;
import com.example.MyEmpCRUD.MyCRUDEmplyee.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmpControl {

    @Autowired
    EmpService empService;

    @GetMapping("/")
    public String show(Model m){

        List<Emp> s = empService.getAll();
        m.addAttribute("s",s);
        return "indez";
    }

    @GetMapping("/addemp")
    public String add_emp(){
        return "add_emp";
    }

    @PostMapping("/add")
    public String empAdd(@ModelAttribute Emp employee){
        empService.addEmp(employee);

        System.out.println(employee);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String Edit(@PathVariable int id, Model m){

        Emp i = empService.servedit(id);
        m.addAttribute("em",i);

        return "/edit";
    }

    @PostMapping ("/update")
        public String updateEm (@ModelAttribute Emp e){
        empService.addEmp(e);
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        empService.delet(id);
        return "redirect:/";
    }

}
