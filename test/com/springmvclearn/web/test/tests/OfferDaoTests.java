package com.springmvclearn.web.test.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springmvclearn.web.dao.Offer;
import com.springmvclearn.web.dao.OffersDAO;

@ActiveProfiles("dev")
@ContextConfiguration(locations = {
		"classpath:com/springmvclearn/web/config/dao-context.xml",
		"classpath:com/springmvclearn/web/test/config/datasource.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class OfferDaoTests {
	
	
	@Autowired
	private OffersDAO offersDao;



	
	@Test
	public void getAllOffers(){
		Offer offer = new Offer("sanjay","email", "This is a test offer.");

		offersDao.createWithSession(offer);
		
		List<Offer> offers =	offersDao.getAllOffers();
		assertEquals("Should be one offer in database.", 3, offers.size());
	}
}
