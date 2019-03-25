package com.capgemini.file.model;

import java.io.BufferedReader;
import java.io.IOException;

public class LineCount {

	public int countNumberOfLineInFile(BufferedReader bufferedReader) throws IOException {
		int countLine = 0;
		String content;

		while ((content = bufferedReader.readLine()) != null) {

			countLine++;
		}

		return countLine;
	}
}
