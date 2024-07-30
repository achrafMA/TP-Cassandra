package net.achraf.tpcassandra.services;

import net.achraf.tpcassandra.entities.Produit;
import net.achraf.tpcassandra.repositories.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProduitService {
    private ProduitRepository produitRepository;

    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }
    public void addUser(String name, int age,String paysOrigine){
        Produit user = new Produit();
        user.setId(UUID.randomUUID());
        user.setName(name);
        user.setQuantite(age);
        user.setPaysOrigine(paysOrigine);
        produitRepository.insert(user);
    }
    public List<Produit> getAllUsers(){
        return produitRepository.findAll();
    }
}
