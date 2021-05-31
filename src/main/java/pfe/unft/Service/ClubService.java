package pfe.unft.Service;

import java.util.List;
import java.util.Optional;

import pfe.unft.entity.Club;



public interface ClubService {
	
	void saveClub(Club club);
	Club UpdateClub(Club club);
	List<Club>listClubs();
	void removeClub(Long id_club );
	public Optional<Club> FindClub(Long id_club);

}

