package pfe.unft.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pfe.unft.Service.BeneficiaireService;
import pfe.unft.entity.Beneficiaire;
import pfe.unft.repository.BeneficiaireRepo;

@Service("BeneficiaireSImpl")
public class BeneficiaireSImpl implements BeneficiaireService{
	
	@Autowired
	BeneficiaireRepo beneficiaireRepo;

	@Override
	public void saveBeneficiaire(Beneficiaire beneficiaire) {
		beneficiaireRepo.save(beneficiaire);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Beneficiaire UpdateBeneficiaire(Beneficiaire beneficiaire) {
		beneficiaireRepo.save(beneficiaire);
		// TODO Auto-generated method stub
		return beneficiaire;
	}

	@Override
	public List<Beneficiaire> listBeneficiaires() {
		beneficiaireRepo.findAll();
		// TODO Auto-generated method stub
		return beneficiaireRepo.findAll();
	}

	@Override
	public void removeBeneficiaire(Long cin) {
		beneficiaireRepo.deleteById(cin);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Beneficiaire> FindBeneficiaire(Long cin) {
		// TODO Auto-generated method stub
		return beneficiaireRepo.findById(cin);
	}

}
