package org.bsodsoftware.spring;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.bsodsoftware.spring.integracion.dao.PlayerDao;
import org.bsodsoftware.spring.modelo.entidades.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * Hello world!
 *
 */
@ContextConfiguration("/spring-dao-context.xml")
public class App {
	
	@Autowired
	private static PlayerDao playerDao;
	
	public static void setPlayerDao(PlayerDao plDao) {
		playerDao = plDao;
	}
	public static void main(String[] args) {
		
		List<Player> result = new ArrayList<Player>();
		try {
			result = playerDao.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNotNull(result);
		System.out.println(result.toString());
	}
}
