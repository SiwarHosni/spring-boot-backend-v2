package pfe.unft.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pfe.unft.Service.McreditService;
import pfe.unft.entity.Mcredit;
import pfe.unft.repository.McreditRepo;

@Service("McreditSImpl")
public class McreditSImpl implements McreditService{
	
	@Autowired
	McreditRepo mcreditRepo;

	@Override
	public void saveMcredit(Mcredit mcredit) {
		mcreditRepo.save(mcredit);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mcredit UpdateMcredit(Mcredit mcredit) {
		mcreditRepo.save(mcredit);
		// TODO Auto-generated method stub
		return mcredit;
	}

	@Override
	public List<Mcredit> listMcredits() {
		// TODO Auto-generated method stub
		return mcreditRepo.findAll();
	}

	@Override
	public void removeMcredit(Long num_dossier) {
		mcreditRepo.deleteById(num_dossier);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Mcredit> FindMcredit(Long num_dossier) {
		// TODO Auto-generated method stub
 		return mcreditRepo.findById(num_dossier);
	}

}
