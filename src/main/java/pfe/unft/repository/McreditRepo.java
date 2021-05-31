package pfe.unft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pfe.unft.entity.Mcredit;

@Repository
public interface McreditRepo extends JpaRepository<Mcredit, Long> {

}
