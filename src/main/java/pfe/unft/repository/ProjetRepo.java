package pfe.unft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pfe.unft.entity.Projet;

@Repository
public interface ProjetRepo extends JpaRepository<Projet, Long> {

}
