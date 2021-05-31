package pfe.unft.Service;

import java.util.List;
import java.util.Optional;

import pfe.unft.entity.Mcredit;


public interface McreditService {
	
	void saveMcredit(Mcredit mcredit);
	Mcredit UpdateMcredit(Mcredit mcredit);
	List<Mcredit>listMcredits();
	void removeMcredit(Long num_dossier );
	public Optional<Mcredit> FindMcredit(Long num_dossier);

}
