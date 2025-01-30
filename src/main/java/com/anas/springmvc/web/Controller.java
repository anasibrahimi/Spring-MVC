package com.anas.springmvc.web;

import java.util.List;
import com.anas.springmvc.dao.PatientDao;
import com.anas.springmvc.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;

@org.springframework.stereotype.Controller

public class Controller {

    @Autowired
    PatientDao patientDao;

    @GetMapping("/index")
    public String index(Model model ,
                        @RequestParam(name = "page" ,defaultValue = "0") int p,
                        @RequestParam(name = "size" , defaultValue = "7") int s) {

        Page<Patient> pagePatients = patientDao.findAll(PageRequest.of(p,s));
        model.addAttribute("patients", pagePatients);
        return "patients";
    }

}
