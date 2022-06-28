package com.example.Facture.Facture;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facture {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_facture;
    private String nom_client;
    private String produit;
    private int quantite;
    private double montant;
    private Date date;

    public Facture(){

    }

    public Facture(String nom_client, String produit, int quantite, double montant, Date date) {
        this.nom_client = nom_client;
        this.produit = produit;
        this.quantite = quantite;
        this.montant = montant;
        this.date = date;
    }

    

    public Facture(Long id_facture, String nom_client, String produit, int quantite, double montant, Date date) {
        this.id_facture = id_facture;
        this.nom_client = nom_client;
        this.produit = produit;
        this.quantite = quantite;
        this.montant = montant;
        this.date = date;
    }

    public Long getId_facture() {
        return id_facture;
    }

    public void setId_facture(Long id_facture) {
        this.id_facture = id_facture;
    }

    public String getNom_client() {
        return nom_client;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Facture [date=" + date + ", id_facture=" + id_facture + ", montant=" + montant + ", nom_client="
                + nom_client + ", produit=" + produit + ", quantite=" + quantite + "]";
    }
    
    
    
    
}
