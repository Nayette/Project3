package com.example.project3.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class CommandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCommande;

    private Date dateCommande;

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }
}
