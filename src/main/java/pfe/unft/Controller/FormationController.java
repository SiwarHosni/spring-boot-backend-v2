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

import pfe.unft.Service.FormationService;
import pfe.unft.entity.Formation;



@RestController
@RequestMapping("/api")
public class FormationController {
	
	@Autowired
	private FormationService formationService;
	
	@PostMapping("/formations")
	public String createFormation(@Validated @RequestBody Formation f) {
		formationService.saveFormation(f);
		return "Ajouté avec succès";
	}
	
	 @PutMapping("/formations/{id}")
	    public String updateFormation(@PathVariable(value = "id") Long medid, @Validated @RequestBody Formation f) {
		 Formation form = formationService.UpdateFormation(f);
	        if(form==null) {
	            return "Impossible de faire la mise à jour";
	        }
	        else {
	            form.setNom_formation(f.getNom_formation());
	            form.setSpecialite(f.getSpecialite());
	            form.setDuree_formation(f.getDuree_formation());
	            form.setNbr_apprenant(f.getNbr_apprenant());
	            form.setCollab(f.getCollab());
	            form.setAge(f.getAge());
	            form.setFormation_sexe(f.getFormation_sexe());
	            
	         
	            

	            formationService.UpdateFormation(f);
	            return "la mise à jour a été éffectué avec succès";
	        }
	 }
	 
	 

	 @GetMapping(value ="/formations/{id}")
     public Optional<Formation> findformation(@PathVariable(value ="id") String id) {

         return formationService.FindFormation(Long.parseLong(id) );
     }

     @GetMapping("/formations")
     public List<Formation> getallformation() {

         return formationService.listFormations();
     }

     @DeleteMapping(value = "/formations/{id}")
     public String deleteformation(@PathVariable(value = "id")String id)
     {
    	 formationService.removeFormation(Long.parseLong(id));
         return "Formation supprimée avec succès";
     }


}
