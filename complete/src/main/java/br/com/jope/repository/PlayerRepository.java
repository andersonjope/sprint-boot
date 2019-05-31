package br.com.jope.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.jope.entity.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

	Optional<Player> findByTeamId(Long teamId);
	
}
