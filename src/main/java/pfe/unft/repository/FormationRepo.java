package pfe.unft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pfe.unft.entity.Formation;

@Repository
public interface FormationRepo extends JpaRepository<Formation, Long> {

}
