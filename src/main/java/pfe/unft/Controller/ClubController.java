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

import pfe.unft.Service.ClubService;

import pfe.unft.entity.Club;




@RestController
@RequestMapping("/api")
public class ClubController {

	@Autowired
	private ClubService clubService;
	
	@PostMapping("/clubs")
	public String createClub(@Validated @RequestBody Club cl) {
		clubService.saveClub(cl);
		return "Ajouté avec succes";
	}
	
	 @PutMapping("/clubs/{id}")
	    public String updateClub(@PathVariable(value = "id") Long medid, @Validated @RequestBody Club cl) {
		 Club club = clubService.UpdateClub(cl);
	        if(club==null) {
	            return "Impossible de faire la mise à jour";
	        }
	        else {
	            club.setNom_club(cl.getNom_club());
	            club.setAct_club(cl.getAct_club());
	            club.setNbr_membr(cl.getNbr_membr());
	            club.setLieu_act(cl.getLieu_act());
	           
	            
	         
	            

	            clubService.UpdateClub(cl);
	            return "la mise à jour a été éffectué avec succès";
	        }
	 }
	 
	 

	 @GetMapping(value ="/clubs/{id}")
     public Optional<Club> findclub(@PathVariable(value ="id") String id) {

         return clubService.FindClub(Long.parseLong(id) );
     }

     @GetMapping("/clubs")
     public List<Club> getallclub() {

         return clubService.listClubs();
     }

     @DeleteMapping(value = "/clubs/{id}")
     public String deleteclub(@PathVariable(value = "id")String id)
     {
    	 clubService.removeClub(Long.parseLong(id));
         return "cours supprimé avec succes";
     }


}
