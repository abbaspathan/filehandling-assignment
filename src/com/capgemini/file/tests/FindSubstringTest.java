package com.capgemini.file.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import com.capgemini.file.model.FindSubstring;

public class FindSubstringTest {

	@Test
	public void testSubstringContainInFileTrue() throws IOException {
		FindSubstring findSubstring = new FindSubstring();
		FileReader fileReader = new FileReader("C:\\Abbas\\abbas.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		assertTrue(findSubstring.checkSubstringPresentOrNot(bufferedReader,
				"Have a nice"));
		assertEquals(3, findSubstring.getCountLine());
		bufferedReader.close();
		fileReader.close();
	}

	@Test
	public void testSubstringContainInFileFalse() throws IOException {
		FindSubstring findSubstring = new FindSubstring();
		FileReader fileReader = new FileReader("C:\\Abbas\\abbas.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		assertFalse(findSubstring.checkSubstringPresentOrNot(bufferedReader,
				"Good night"));
		assertEquals(3, findSubstring.getCountLine());
		bufferedReader.close();
		fileReader.close();
	}

}
