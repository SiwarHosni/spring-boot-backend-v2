package pfe.unft.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pfe.unft.entity.Role;
import pfe.unft.entity.Roles;

public interface RoleRepo extends JpaRepository<Roles, Long> {
	Optional<Roles> findByName(Role name);
}
