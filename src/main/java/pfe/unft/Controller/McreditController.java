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

import pfe.unft.Service.McreditService;
import pfe.unft.entity.Mcredit;



@RestController
@RequestMapping("/api")
public class McreditController {
	@Autowired
	private McreditService mcreditService;
	
	@PostMapping("/credits")
	public String createMcredit(@Validated @RequestBody Mcredit m) {
		mcreditService.saveMcredit(m);
		return "Ajouté avec succès";
	}
	
	 @PutMapping("/credits/{id}")
	    public String updateMcredit(@PathVariable(value = "id") Long medid, @Validated @RequestBody Mcredit m) {
		 Mcredit mc = mcreditService.UpdateMcredit(m);
	        if(mc==null) {
	            return "Impossible de faire la mise à jour";
	        }
	        else {
	            mc.setMontant_cr(m.getMontant_cr());
	            mc.setDuree_cr(m.getDuree_cr());
	            mc.setDuree_ech(m.getDuree_ech());
	            mc.setSource_fin(m.getSource_fin());
	            mc.setMontant_tr(m.getMontant_tr());
	            mc.setDate_decaissement(m.getDate_decaissement());
	            mc.setInterest(m.getInterest());
	            mc.setMethode_paiement(m.getMethode_paiement());
	       

	            mcreditService.UpdateMcredit(m);
	            return "la mise à jour a été éffectué avec succès";
	        }
	 }
	 
	 

	 @GetMapping(value ="/credits/{id}")
     public Optional<Mcredit> findmcredit(@PathVariable(value ="id") String id) {

         return mcreditService.FindMcredit(Long.parseLong(id) );
     }

     @GetMapping("/credits")
     public List<Mcredit> getallmcredit() {

         return mcreditService.listMcredits();
     }

     @DeleteMapping(value = "/credits/{id}")
     public String deletemcredit(@PathVariable(value = "id")String id)
     {
    	 mcreditService.removeMcredit(Long.parseLong(id));
         return "Micro-Crédit supprimé avec succès";
     }


}
