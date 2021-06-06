package io.ipl.repository;

import org.springframework.data.repository.CrudRepository;

import io.ipl.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {
	Team findByTeamName(String teamName);
}
