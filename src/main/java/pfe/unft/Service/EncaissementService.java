package pfe.unft.Service;

import java.util.List;
import java.util.Optional;

import pfe.unft.entity.Encaissement;


public interface EncaissementService {
	
	void saveEncaissement(Encaissement encaissement );
	Encaissement UpdateEncaissement(Encaissement encaissement);
	List<Encaissement>listEncaissements();
	void removeEnaissement(Long num_enc );
	public Optional<Encaissement> FindEncaissement(Long num_enc);

}
