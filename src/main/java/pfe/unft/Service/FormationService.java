package pfe.unft.Service;

import java.util.List;
import java.util.Optional;

import pfe.unft.entity.Formation;


public interface FormationService {
	
	void saveFormation(Formation formation);
	Formation UpdateFormation(Formation formation);
	List<Formation>listFormations();
	void removeFormation(Long Id_formation );
	public Optional<Formation> FindFormation(Long id_formation);

}
