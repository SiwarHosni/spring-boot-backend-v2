package pfe.unft.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pfe.unft.Service.EncaissementService;
import pfe.unft.entity.Encaissement;
import pfe.unft.repository.EncaissementRepo;

@Service("EncaissementSImpl")
public class EncaissementSImpl implements EncaissementService {
	
	@Autowired
	EncaissementRepo encaissementRepo;

	@Override
	public void saveEncaissement(Encaissement encaissement) {
		encaissementRepo.save(encaissement);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Encaissement UpdateEncaissement(Encaissement encaissement) {
		encaissementRepo.save(encaissement);
		// TODO Auto-generated method stub
		return encaissement;
	}

	@Override
	public List<Encaissement> listEncaissements() {
		// TODO Auto-generated method stub
		return encaissementRepo.findAll();
	}

	@Override
	public void removeEnaissement(Long num_enc) {
		encaissementRepo.deleteById(num_enc);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Encaissement> FindEncaissement(Long num_enc) {
		// TODO Auto-generated method stub
		return encaissementRepo.findById(num_enc);
	}

}
