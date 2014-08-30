package org.bsodsoftware.spring.modelo.player.imp;

import java.util.List;

import org.bsodsoftware.spring.integracion.dao.PlayerDao;
import org.bsodsoftware.spring.modelo.entidades.Player;
import org.bsodsoftware.spring.modelo.player.SAPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public class SAPlayerImp implements SAPlayer {
	
	@Autowired
	private PlayerDao playerDaoB;
	
	public void setPlayerDaoB(PlayerDao playerDao) {
		this.playerDaoB = playerDao;
	}

	public Player addPlayer(Player playerToAdd) throws Exception {
		
		Player player = new Player();
		
		String nombre = "";
		
		if ( playerDaoB == null) System.out.println("PLAYER DAO NULO");
			
		playerDaoB.save(playerToAdd);
		
		player.setPlayerFirstName(nombre);
		
		return player;
	}

	public Player updatePlayer(Player playerToUpdate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean removePlayer(Integer idPlayer) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Player> findAllPlayers() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Player findPlayerById(Integer idPlayer) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
