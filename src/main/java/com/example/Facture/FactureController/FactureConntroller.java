package com.example.Facture.FactureController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Facture.Facture.Facture;
import com.example.Facture.ServiceFacture.ServiceFacture;

@RestController
public class FactureConntroller {


    @Autowired
    private ServiceFacture serviceFacture;


    @PostMapping("/Ajouter")
    public Facture generer(@RequestBody Facture facture){
        return serviceFacture.GenererLaFacture(facture);
    }

    @DeleteMapping("/effacer")
    public void effacer(Facture facture){
        serviceFacture.delete(facture);
    }

    @GetMapping("/afficher")
    public List<Facture> afficher(){
        return serviceFacture.afficher();
        
    }
    @GetMapping("/byId/{id}")
    public Facture recuper(@PathVariable Long id){
       return  serviceFacture.findById(id);
        
        

    }
    @DeleteMapping("/byId/{id}/effacid")
    public void  findById(@PathVariable Long id){
        serviceFacture.deleteById(id);

    }

    @PutMapping("/byId/{id}/{nom_client}/modifier")
    public Facture modifieFacture(@PathVariable Long id,@PathVariable String nom_client){
        return serviceFacture.modifierFacture(id,nom_client);
    }
    @PutMapping("/byId/{id}/produit/{produit}/modifier")
    public Facture modifieFacturee(@PathVariable Long id,@PathVariable String produit){
        return serviceFacture.modifierFactur(id,produit);


    
}
@PutMapping("/byId/{id}/produit/produit/{quantite}/modifier")
    public Facture modifiequantite(@PathVariable Long id,@PathVariable int quantite){
        return serviceFacture.modifierquantite(id,quantite);
}
@GetMapping("/somme")
public Facture sommeFacture(Facture facture){
    return serviceFacture.somme(facture);
}
}
