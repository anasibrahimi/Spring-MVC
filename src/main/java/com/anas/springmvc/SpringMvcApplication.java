package com.anas.springmvc;

import com.anas.springmvc.dao.PatientDao;
import com.anas.springmvc.entities.Patient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
        System.out.println("Done");
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientDao patientDao) {
        return args -> {
            Patient patient = new Patient();
            patient.setFullName("Anas Ibrahimi");
            patient.setDateNaissance(new Date());
            patient.setMalade(Math.random() > 0.5 ? true : false);
            patient.setScore(Math.random() > 0.5 ? 0 : 1);

            patientDao.save(patient);
            Patient patient1 = new Patient();
            patient1.setFullName("Islam Ibrahimi");
            patient1.setDateNaissance(new Date());
            patient1.setMalade(Math.random() > 0.5 ? true : false);
            patient1.setScore(Math.random() > 0.5 ? 0 : 1);

            patientDao.save(patient1);
            Patient patient2 = new Patient();
            patient2.setFullName("Mohamed Ibrahimi");
            patient2.setDateNaissance(new Date());
            patient2.setMalade(Math.random() > 0.5 ? true : false);
            patient2.setScore(Math.random() > 0.5 ? 0 : 1);

            patientDao.save(patient2);
            Patient patient3 = new Patient();
            patient3.setFullName("Fatima Ibrahimi");
            patient3.setDateNaissance(new Date());
            patient3.setMalade(Math.random() > 0.5 ? true : false);
            patient3.setScore(Math.random() > 0.5 ? 0 : 1);

            patientDao.save(patient3);

            for(int i = 0 ; i < 50 ; i++){
                Patient patient4 = new Patient();
                patient4.setFullName("name patient");
                patient4.setDateNaissance(new Date());
                patient4.setMalade(Math.random() > 0.5 ? true : false);
                patient4.setScore(Math.random() > 0.5 ? 0 : 1);
                patientDao.save(patient4);
            }

        };
    }

}
