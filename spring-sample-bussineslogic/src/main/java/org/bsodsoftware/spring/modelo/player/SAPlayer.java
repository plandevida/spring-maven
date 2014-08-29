package org.bsodsoftware.spring.modelo.player;

import java.util.List;

import org.bsodsoftware.spring.modelo.SA;
import org.bsodsoftware.spring.modelo.entidades.Player;

public interface SAPlayer extends SA {

	public Player addPlayer(Player playerToAdd) throws Exception;
	public Player updatePlayer(Player playerToUpdate) throws Exception;
	public Boolean removePlayer(Integer idPlayer) throws Exception;
	public List<Player> findAllPlayers() throws Exception;
	public Player findPlayerById(Integer idPlayer) throws Exception;
}
