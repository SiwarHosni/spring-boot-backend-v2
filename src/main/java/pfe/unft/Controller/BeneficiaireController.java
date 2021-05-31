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

import pfe.unft.Service.BeneficiaireService;

import pfe.unft.entity.Beneficiaire;




@RestController
@RequestMapping("/api")
public class BeneficiaireController {
	
	@Autowired
	private BeneficiaireService beneficiaireService;
	
	@PostMapping("/beneficiaires")
	public String createBeneficiaire(@Validated @RequestBody Beneficiaire b) {
		beneficiaireService.saveBeneficiaire(b);
		return "Ajouté avec succès";
	}
	
	 @PutMapping("/beneficiaires/{id}")
	    public String updateBeneficiaire(@PathVariable(value = "id") Long medid, @Validated @RequestBody Beneficiaire b) {
		 Beneficiaire bene = beneficiaireService.UpdateBeneficiaire(b);
	        if(bene==null) {
	            return "Impossible de faire la mise à jour";
	        }
	        else {
				bene.setLieu_cin(b.getLieu_cin());
				bene.setDate_emission(b.getDate_emission());
	        	bene.setNomb(b.getNomb());
	        	bene.setPrenomb(b.getPrenomb());
	        	bene.setDate_naissance(b.getDate_naissance());
				bene.setAdresse(b.getAdresse());
				bene.setGouv_b(b.getGouv_b());
				bene.setDelegation(b.getDelegation());
	        	bene.setSexe(b.getSexe());
	        	bene.setTel(b.getTel());
	        	bene.setNiveau_ed(b.getNiveau_ed());
	        	bene.setProfession(b.getProfession());
				bene.setDuree_experience(b.getDuree_experience());
	        	bene.setLogement(b.getLogement());
				bene.setSrc_rev_b(b.getSrc_rev_b());
				bene.setMM_rev_b(b.getMM_rev_b());
				bene.setSrc_rev_fam_b(b.getSrc_rev_fam_b());
				bene.setMM_rev_fam_b(b.getMM_rev_fam_b());
	        	bene.setNom_banque(b.getNom_banque());
	        	bene.setRib(b.getRib());
	        	
	            

	        	beneficiaireService.UpdateBeneficiaire(b);
	            return "la mise à jour a été éffectué avec succès";
	        }
	 }
	 
	 @GetMapping(value ="/beneficiaires/{id}")
     public Optional<Beneficiaire> findbeneficiaire(@PathVariable(value ="id") String id) {

         return beneficiaireService.FindBeneficiaire(Long.parseLong(id) );
     }

     @GetMapping("/beneficiaires")
     public List<Beneficiaire> getallbeneficiaire() {

         return beneficiaireService.listBeneficiaires();
     }

     @DeleteMapping(value = "/beneficiaires/{id}")
     public String deletbeneficiaire(@PathVariable(value = "id")String id)
     {
    	 beneficiaireService.removeBeneficiaire(Long.parseLong(id));
         return "Beneficiaire supprimé avec succes";
     } 

}
