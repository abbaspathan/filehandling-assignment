package com.capgemini.file.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {

	public Employee deserialization() {

		Employee employee2 = null;
		try {
			FileInputStream fileInputStream = new FileInputStream("employee.ser");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

			employee2 = (Employee) inputStream.readObject();

			inputStream.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee2;
	}
}
