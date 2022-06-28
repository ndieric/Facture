package com.example.Facture.ServiceFacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Facture.Facture.Facture;
import com.example.Facture.FactureRepository.FactureRepository;

import java.util.List;

@RestController
@Service
public class ServiceFacture {



    @Autowired
    private FactureRepository factureRepository;

    // Enregistrement des factures
    public Facture GenererLaFacture(Facture facture){
       return factureRepository.save(facture);
    }

    // Effacement des factures
    public void delete(Facture facture){
        factureRepository.deleteAll();
    }

    // Affichages des factures
    public List<Facture> afficher(){
      return  factureRepository.findfrom();
       
    }
    public Facture somme(Facture facture){
       return  factureRepository.save(facture);
        
    }
    // recuper la facture par id
    public Facture findById(Long id){
        return factureRepository.findById(id).get();

    }
    public void deleteById(@PathVariable Long id){
        Facture facture = factureRepository.findById(id).get();
        factureRepository.deleteById(id);
    }
    // modification de la facture
    public Facture modifierFacture(@PathVariable Long id,@PathVariable ("nom_client") String nom_client){
        Facture ind = factureRepository.findById(id).get();
        ind.setNom_client(nom_client);
        return factureRepository.save(ind);
    }
    public Facture modifierFactur(@PathVariable Long id,@PathVariable ("produit") String produit){
        Facture ind = factureRepository.findById(id).get();
        ind.setProduit(produit);
        return factureRepository.save(ind);
    }
    public Facture modifierquantite(@PathVariable Long id,@PathVariable ("quantite") int quantite){
        Facture ind = factureRepository.findById(id).get();
        ind.setQuantite(quantite);
        return factureRepository.save(ind);
}
}

    
