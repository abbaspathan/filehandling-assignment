package com.capgemini.file.model;

import java.io.BufferedReader;
import java.io.IOException;

public class WordCount {

	public int countNumberOfWordInFile(BufferedReader bufferedReader) throws IOException {

		int countWord = 0;
		String content;

		while ((content = bufferedReader.readLine()) != null) {

			countWord = countWord + content.split("\\s+").length;
		}

		return countWord;
	}
}
