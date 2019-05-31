package br.com.jope.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.jope.entity.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

	Optional<Team> findById(Long teamId);
	
}
