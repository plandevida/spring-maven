package org.bsodsoftware.spring.integracion.dao.imp;

import java.util.List;

import org.bsodsoftware.spring.integracion.BaseDaoHibernate;
import org.bsodsoftware.spring.integracion.dao.PlayerDao;
import org.bsodsoftware.spring.modelo.entidades.Player;

public class PlayerDaoImp extends BaseDaoHibernate<Player, String> implements PlayerDao {

	@Override
	public List<Player> findAll() throws Exception {
		
		return getHibernateTemplate().loadAll(Player.class);
	}

	@Override
	public Player findById(String id) throws Exception {
		
		return getHibernateTemplate().get(Player.class, id);
	}
}
