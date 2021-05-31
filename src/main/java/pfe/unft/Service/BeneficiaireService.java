package pfe.unft.Service;

import java.util.List;
import java.util.Optional;

import pfe.unft.entity.Beneficiaire;

public interface BeneficiaireService {
	
	void saveBeneficiaire(Beneficiaire beneficiaire);
	Beneficiaire UpdateBeneficiaire(Beneficiaire beneficiaire);
	List<Beneficiaire>listBeneficiaires();
	void removeBeneficiaire(Long cin );
	public Optional<Beneficiaire> FindBeneficiaire(Long cin);

}
