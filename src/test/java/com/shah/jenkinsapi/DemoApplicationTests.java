package com.shah.jenkinsapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	
	
	private static final Logger log = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("test case executing............");
		assertEquals(true, true);
	}

}
