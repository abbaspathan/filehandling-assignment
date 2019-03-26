package com.capgemini.file.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerializable {

	public boolean serialization(Employee employee) {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(employee);
			objectOutputStream.close();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
