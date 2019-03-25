package com.capgemini.file.tests;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.file.model.WordCount;

public class WordCountTest {

	private static WordCount countWord;

	@BeforeClass
	public static void setUp() {
		countWord = new WordCount();
	}

	@Test(expected = FileNotFoundException.class)
	public void testFileNotFoundException() throws IOException {
		FileReader fileReader = new FileReader("C:\\Abbas\\abbas1.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		assertEquals(7, countWord.countNumberOfWordInFile(bufferedReader));
	}

	@Test
	public void testNumberOfWordInFile() throws IOException {
		FileReader fileReader = new FileReader("C:\\Abbas\\abbas.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		assertEquals(7, countWord.countNumberOfWordInFile(bufferedReader));
	}
	
	@Test
	public void testNumberOfWordInFileAreZero() throws IOException {
		FileReader fileReader = new FileReader("C:\\Abbas\\abbas2.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		assertEquals(0, countWord.countNumberOfWordInFile(bufferedReader));
	}

}
