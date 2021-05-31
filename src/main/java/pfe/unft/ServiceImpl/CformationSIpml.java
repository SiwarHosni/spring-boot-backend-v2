package pfe.unft.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pfe.unft.Service.CformationService;
import pfe.unft.entity.Cformation;
import pfe.unft.repository.CformationRepo;

@Service("CformationSImpl")
public class CformationSIpml implements CformationService{
	
	
	@Autowired
	CformationRepo cformationRepo;

	@Override
	public void saveCformation(Cformation cformation) {
		cformationRepo.save(cformation);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cformation UpdateCformation(Cformation cformation) {
		cformationRepo.save(cformation);
		// TODO Auto-generated method stub
		return cformation;
	}

	@Override
	public List<Cformation> listCformations() {
		// TODO Auto-generated method stub
		return cformationRepo.findAll();
	}

	@Override
	public void removeCformation(Long id_cf) {
		cformationRepo.deleteById(id_cf);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Cformation> FindCformation(Long id_cf) {
		// TODO Auto-generated method stub
		return cformationRepo.findById(id_cf);
	}

}
