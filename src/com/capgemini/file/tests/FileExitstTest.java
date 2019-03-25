package com.capgemini.file.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.file.model.FileExitst;

public class FileExitstTest {

	private static FileExitst fileExitst;

	@BeforeClass
	public static void setUp() {
		fileExitst = new FileExitst();
	}

	@Test
	public void testIsFileExitsTrue() {
		File file = new File("C:\\Abbas\\abbas.txt");
		assertTrue(fileExitst.isFileExits(file));
	}

	@Test
	public void testIsFileExitsFalse() {
		File file = new File("C:\\Abbas\\abbas1.txt");
		assertFalse(fileExitst.isFileExits(file));
	}
}
