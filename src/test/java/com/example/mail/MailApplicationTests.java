package com.example.mail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MailApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void test01() {
		String a = "aaa";
		String b = a.intern();
		System.out.println(a==b);
	}

}
