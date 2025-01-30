package com.anas.springmvc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance ;
    private boolean malade;
    private int score ;

//    @OneToMany(mappedBy = "patient" , fetch = FetchType.LAZY)
//    List<RendezVous> rendezVous ;
}
