package net.achraf.tpcassandra.web;

import net.achraf.tpcassandra.entities.Produit;
import net.achraf.tpcassandra.services.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produits")
public class ProduitController {
    private ProduitService produitService;
    public ProduitController(ProduitService userService){
        this.produitService = userService;
    }

    @GetMapping("/produits")
    public List<Produit> getUsers(){
        return produitService.getAllUsers();
    }
    @PostMapping("/produits")
    public String saveUsers(@RequestParam String name,@RequestParam int quantite,@RequestParam String paysOrigine){
        produitService.addUser(name, quantite, paysOrigine);
        return "Produit saved";

    }
}
