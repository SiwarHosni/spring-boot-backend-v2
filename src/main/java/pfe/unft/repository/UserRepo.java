package pfe.unft.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pfe.unft.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}