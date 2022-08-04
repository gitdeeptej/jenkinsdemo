package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.WelcomeController;

@SpringBootTest
class SecondappApplicationTests {

	@Test
	void welcome() {
		WelcomeController wc=new WelcomeController();
		String resp=wc.getMessage();
		System.out.println(resp);
		assertEquals("  elcome", resp);
	}

}
