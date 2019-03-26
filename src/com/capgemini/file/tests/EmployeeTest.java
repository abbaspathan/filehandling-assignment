package com.capgemini.file.tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.file.model.Employee;
import com.capgemini.file.model.EmployeeDeserialization;
import com.capgemini.file.model.EmployeeSerializable;

public class EmployeeTest {
	private static Employee employee;

	@BeforeClass
	public static void setUp() {
		employee = new Employee(101, "John Deo", 34000);
	}

	@Test
	public void testObjectSerializeSuccessfully() throws IOException, ClassNotFoundException {

		EmployeeSerializable employeeser = new EmployeeSerializable();
		assertTrue(employeeser.serialization(employee));

	}

	@Test
	public void testObjectDeserializationSuccessfull() throws IOException, ClassNotFoundException {

		EmployeeDeserialization deserial=new EmployeeDeserialization();
		
		assertTrue(deserial.deserialization().equals(employee));
	}

}
