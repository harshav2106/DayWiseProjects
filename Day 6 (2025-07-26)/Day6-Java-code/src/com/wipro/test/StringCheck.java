package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCheck {

	private String s;

	@Test
	void checkNullToUpperCaseThrowsException() {
		s = null;
		assertThrows(NullPointerException.class,()->{
			s.toUpperCase();
		});
	}

}
