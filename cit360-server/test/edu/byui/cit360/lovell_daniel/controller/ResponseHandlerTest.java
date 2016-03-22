package edu.byui.cit360.lovell_daniel.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

public class ResponseHandlerTest {

	@Before
	public void setUp() throws Exception {
		ResponseHandler responseHandler = new ResponseHandler();
	}

	@Test
	public void testHandleIt() {
		
		//populate test cases
		ArrayList<String[]> tests = new ArrayList<>();
		tests.add(new String[] {"Bob", "!userExists"});
		tests.add(new String[] {"Daniel", "{sample}"});
		tests.add(new String[] {"", "!userExists"});
		
		//test
		for (String[] test : tests) {
			String expResult = "!userExists";
			String result = new ResponseHandler().handleIt(Collections.addAll(result, test));
			assertEquals(expResult, result);
			System.out.println("Test Case 1");
		}
		
		
		
		
	}

}