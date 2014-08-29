package org.bsodsoftware.spring;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.bsodsoftware.spring.integracion.dao.PlayerDao;
import org.bsodsoftware.spring.modelo.entidades.Player;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-test-dao-context.xml")
public class PlayerDaoTest {
	
	@Autowired
	private PlayerDao playerDao;
	
	private static final String PLAYERID = "player01@gmail.com";
	/**
	 * @param playerDao the playerDao to set
	 */
	public void setPlayerDao(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void testFindAll() throws Exception {
		List<Player> result = playerDao.findAll();
		assertNotNull(result);
		System.out.println(result.toString());
	}
	@Test
	public void testFindByIdString() throws Exception {
		Player result = playerDao.findById(PLAYERID);
		assertNotNull(result);
		System.out.println(result.toString());
	}
}
