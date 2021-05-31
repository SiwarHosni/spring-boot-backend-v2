package pfe.unft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pfe.unft.entity.Encaissement;

@Repository
public interface EncaissementRepo extends JpaRepository<Encaissement, Long>{

}
