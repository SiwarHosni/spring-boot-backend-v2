package pfe.unft.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pfe.unft.Service.ClubService;
import pfe.unft.entity.Club;
import pfe.unft.repository.ClubRepo;

@Service("ClubSImpl")
public class ClubSImpl implements ClubService {
	
	@Autowired
	ClubRepo clubRepo;

	@Override
	public void saveClub(Club club) {
		clubRepo.save(club);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Club UpdateClub(Club club) {
		clubRepo.save(club);
		// TODO Auto-generated method stub
		return club;
	}

	@Override
	public List<Club> listClubs() {
		// TODO Auto-generated method stub
		return clubRepo.findAll();
	}

	@Override
	public void removeClub(Long id_club) {
		clubRepo.deleteById(id_club);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Club> FindClub(Long id_club) {
		// TODO Auto-generated method stub
		return clubRepo.findById(id_club);
	}

}
