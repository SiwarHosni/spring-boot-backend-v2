package pfe.unft.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pfe.unft.Service.EncaissementService;
import pfe.unft.entity.Encaissement;


@RestController
@RequestMapping("/api")
public class EncaissementController {
	
	
	@Autowired
	private EncaissementService encaissementService;
	
	@PostMapping("/encaissements")
	public String createEncaissement(@Validated @RequestBody Encaissement e) {
		encaissementService.saveEncaissement(e);
		return "Ajouté avec succès";
	}
	
	 @PutMapping("/encaissements/{id}")
	    public String updateEncaissement(@PathVariable(value = "id") Long medid, @Validated @RequestBody Encaissement e) {
		 Encaissement enc = encaissementService.UpdateEncaissement(e);
	        if(enc==null) {
	            return "Impossible de faire la mise à jour";
	        }
	        else {
	            enc.setNum_recu(e.getNum_recu());
	            enc.setMontant_enc(e.getMontant_enc());
	            enc.setDate_enc(e.getDate_enc());
	            enc.setMethode_penc(e.getMethode_penc());
	            
	           
	         

	            encaissementService.UpdateEncaissement(e);
	            return "la mise à jour a été éffectué avec succès";
	        }
	 }
	 
	 

	 @GetMapping(value ="/encaissements/{id}")
     public Optional<Encaissement> findencaissement(@PathVariable(value ="id") String id) {

         return encaissementService.FindEncaissement(Long.parseLong(id) );
     }

     @GetMapping("/encaissements")
     public List<Encaissement> getallencaissement() {

         return encaissementService.listEncaissements();
     }

     @DeleteMapping(value = "/encaissements/{id}")
     public String deleteencaissement(@PathVariable(value = "id")String id)
     {
    	 encaissementService.removeEnaissement(Long.parseLong(id));
         return "Enaissement supprimée avec succès";
     }


}
