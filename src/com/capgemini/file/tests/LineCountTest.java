package com.capgemini.file.tests;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.file.model.LineCount;

public class LineCountTest {

	private static LineCount lineCount;

	@BeforeClass
	public static void setUp() {
		lineCount = new LineCount();
	}

	@Test(expected = FileNotFoundException.class)
	public void testFileNotFoundException() throws IOException {
		FileReader fileReader = new FileReader("C:\\Abbas\\abbas1.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		assertEquals(3, lineCount.countNumberOfLineInFile(bufferedReader));
	}

	@Test
	public void testNumberOfLineInFile() throws IOException {
		FileReader fileReader = new FileReader("C:\\Abbas\\abbas.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		assertEquals(3, lineCount.countNumberOfLineInFile(bufferedReader));
	}
	
	@Test
	public void testNumberOfLineInFileZero() throws IOException {
		FileReader fileReader = new FileReader("C:\\Abbas\\abbas2.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		assertEquals(0, lineCount.countNumberOfLineInFile(bufferedReader));
	}
}
