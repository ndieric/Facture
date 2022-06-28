package com.example.Facture.FactureRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Facture.Facture.Facture;

import java.util.List;

public interface FactureRepository  extends JpaRepository<Facture,Long>{
    @Query("Select new com.example.Facture.Facture.Facture(id_facture,nom_client,produit,quantite,montant,date) from Facture")
    public List<Facture> findfrom();
    @Query("select new com.example.Facture.Facture.Facture(sum(montant)) from Facture")
    public Facture somme();
     
    
}
