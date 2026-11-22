package kelvyn.dev.blue_lock_api.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kelvyn.dev.blue_lock_api.database.model.Player;

public interface PlayerRepository extends JpaRepository<Long, Player>{
    
}
