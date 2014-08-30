package org.bsodsoftware.spring.modelo;

import org.bsodsoftware.spring.modelo.player.SAPlayer;
import org.bsodsoftware.spring.modelo.player.imp.SAPlayerImp;

public class SAFactoryImp extends SAFactory {

	@Override
	public SAPlayer getSAPlayer() {
		
//		if (saMap.contains(SAPLAYER)) {
//			return (SAPlayer) saMap.get(SAPLAYER);
//		}
//		else {
			return new SAPlayerImp();
//		}
	}

}
