package br.com.alderjunio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alderjunio.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long > {

    

}
