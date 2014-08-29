package org.bsodsoftware.spring.modelo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Player")
@Table(name = "Player")
public class Player implements java.io.Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6485105191418783803L;
	@Id
	@Column(name = "playerId", length = 50)
	private String playerId;
	@Column(name = "playerFirstName", length = 50, nullable = false)
	private String playerFirstName;
	@Column(name = "playerLastName", length = 50, nullable = false)
	private String playerLastName;
	
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerFirstName() {
		return playerFirstName;
	}
	public void setPlayerFirstName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
	}
	public String getPlayerLastName() {
		return playerLastName;
	}
	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerFirstName=" + playerFirstName + ", playerLastName=" + playerLastName + "]";
	}
}
