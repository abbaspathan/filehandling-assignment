package com.capgemini.file.tests;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.file.model.LineCount;

public class LineCountTest {

	private static LineCount lineCount;

	@BeforeClass
	public static void setUp() {
		lineCount = new LineCount();
	}

	@Test
	public void testNumberOfLineInFile() throws FileNotFoundException {
		FileReader fileReader = new FileReader("C:\\Abbas\\abbas.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		assertEquals(3, lineCount.countNumberOfLineInFile(bufferedReader));
	}
}
