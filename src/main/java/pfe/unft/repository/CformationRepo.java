package pfe.unft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pfe.unft.entity.Cformation;

@Repository
public interface CformationRepo extends JpaRepository<Cformation, Long>{

}
