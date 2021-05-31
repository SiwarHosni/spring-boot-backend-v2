package pfe.unft.Service;

import java.util.List;
import java.util.Optional;

import pfe.unft.entity.Cformation;

public interface CformationService {
	
	void saveCformation(Cformation cformation);
	Cformation UpdateCformation(Cformation cformation);
	List<Cformation>listCformations();
	void removeCformation(Long id_cf );
	public Optional<Cformation> FindCformation(Long id_cf);

}
