package pfe.unft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pfe.unft.entity.Club;

@Repository
public interface ClubRepo extends JpaRepository<Club, Long> {

}
