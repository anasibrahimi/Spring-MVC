package com.anas.springmvc.web;
import java.util.List;
import com.anas.springmvc.dao.PatientDao;
import com.anas.springmvc.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {

    @Autowired
    PatientDao patientDao;

    @RequestMapping(value = "/patients" , method = RequestMethod.GET)
    public List<Patient> getPatients() {

        List<Patient> patientList =  patientDao.findAll();
        return patientList;
    }
}
