package pfe.unft.Service;

import java.util.List;
import java.util.Optional;

import pfe.unft.entity.Apprenant;

public interface ApprenantService {
	
	void saveApprenant(Apprenant apprenant);
	Apprenant UpdateApprenant(Apprenant apprenant);
	List<Apprenant>listApprenants();
	void removeApprenant(Long cin );
	public Optional<Apprenant> FindApprenant(Long cin);

}
