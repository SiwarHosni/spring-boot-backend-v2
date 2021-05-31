package pfe.unft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pfe.unft.entity.Beneficiaire;

@Repository
public interface BeneficiaireRepo extends JpaRepository<Beneficiaire, Long> {

}
