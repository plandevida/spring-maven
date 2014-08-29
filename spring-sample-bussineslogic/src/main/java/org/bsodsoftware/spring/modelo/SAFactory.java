package org.bsodsoftware.spring.modelo;

import java.util.concurrent.ConcurrentHashMap;

import org.bsodsoftware.spring.modelo.player.SAPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class SAFactory {

	private static SAFactory selfInstance;
	
	@Autowired
	protected static ConcurrentHashMap<String, SA> saMap;
	
	public void setSaMap(SAPlayer saPlayer) {
		
		if ( !saMap.containsKey(saPlayer) ) {
			saMap.put(SAPLAYER, saPlayer);
		}
	}
	
	public static final String SAPLAYER = "saplayer";
	
	public synchronized static SAFactory getInstance() {
		if (saMap == null) {
			saMap = new ConcurrentHashMap<String, SA>();
		}
		
		if ( selfInstance == null ) {
			selfInstance = new SAFactoryImp();
		}
		
		return selfInstance;
	}
	
	public abstract SAPlayer getSAPlayer();
}
