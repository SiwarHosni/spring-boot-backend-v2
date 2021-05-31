package pfe.unft.Service;

import java.util.List;
import java.util.Optional;

import pfe.unft.entity.Projet;


public interface ProjetService {
	
	void saveProjet(Projet projet);
	Projet UpdateProjet(Projet projet);
	List<Projet>listProjets();
	void removeProjet(Long Id_projet );
	public Optional<Projet> FindProjet(Long Id_projet);

}
