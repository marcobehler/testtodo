package com.marcobehler.testtodo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TesttodoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void bla() {
		assertEquals(1,2);
	}

}
