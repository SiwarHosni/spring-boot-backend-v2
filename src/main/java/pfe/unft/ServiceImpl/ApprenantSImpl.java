package pfe.unft.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pfe.unft.Service.ApprenantService;
import pfe.unft.entity.Apprenant;
import pfe.unft.repository.ApprenantRepo;

@Service("ApprenantSImpl")
public class ApprenantSImpl implements ApprenantService{
	
	@Autowired
	ApprenantRepo apprenantRepo;

	@Override
	public void saveApprenant(Apprenant apprenant) {
		apprenantRepo.save(apprenant);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Apprenant UpdateApprenant(Apprenant apprenant) {
		apprenantRepo.save(apprenant);
		// TODO Auto-generated method stub
		return apprenant;
	}

	@Override
	public List<Apprenant> listApprenants() {
		// TODO Auto-generated method stub
		return apprenantRepo.findAll();
	}

	@Override
	public void removeApprenant(Long cin) {
		apprenantRepo.deleteById(cin);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Apprenant> FindApprenant(Long cin) {
		// TODO Auto-generated method stub
		return apprenantRepo.findById(cin);
	}
	

}
