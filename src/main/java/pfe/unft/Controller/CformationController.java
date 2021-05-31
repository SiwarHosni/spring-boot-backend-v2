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

import pfe.unft.Service.CformationService;

import pfe.unft.entity.Cformation;




@RestController
@RequestMapping("/api")
public class CformationController {
	
	@Autowired
	private CformationService cformationService;
	
	@PostMapping("/cformations")
	public String createCformation(@Validated @RequestBody Cformation c) {
		cformationService.saveCformation(c);
		return "Ajouté avec succès";
	}
	
	 @PutMapping("/cformations/{id}")
	    public String updateCformation(@PathVariable(value = "id") Long medid, @Validated @RequestBody Cformation c) {
		 Cformation cf = cformationService.UpdateCformation(c);
	        if(cf==null) {
	            return "Impossible de faire la mise à jour";
	        }
	        else {
	            cf.setNom_cf(c.getNom_cf());
	            cf.setGouv_cf(c.getGouv_cf());
	            cf.setNbrappr_cf(c.getNbrappr_cf());
	            cf.setMetier(c.getMetier());
	            

	            cformationService.UpdateCformation(c);
	            return "la mise à jour a été éffectué avec succès";
	        }
	 }
	 
	 

	 @GetMapping(value ="/cformations/{id}")
     public Optional<Cformation> findcformation(@PathVariable(value ="id") String id) {

         return cformationService.FindCformation(Long.parseLong(id) );
     }

     @GetMapping("/cformations")
     public List<Cformation> getallcformation() {

         return cformationService.listCformations();
     }

     @DeleteMapping(value = "/cformations/{id}")
     public String deletecformation(@PathVariable(value = "id")String id)
     {
    	 cformationService.removeCformation(Long.parseLong(id));
         return "Centre de formation supprimé avec succès";
     }


}
