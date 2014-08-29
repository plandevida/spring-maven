package org.bsodsoftware.spring.modelo;

import junit.framework.Assert;

import org.bsodsoftware.spring.modelo.entidades.Player;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-test-bussineslogic-context.xml")
public class SATest {
	
	private Player player;
	
	@Before
	public void configureMOC() {
		player = new Player();
		
		player.setPlayerFirstName("1");
		player.setPlayerLastName("11");
		player.setPlayerId("SN 1");
	}
	
	@Test
	public void addPlayer() {
		
		try {
			Player a = SAFactory.getInstance().getSAPlayer().addPlayer(player);
			Assert.assertNotNull(a);
			
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
}
