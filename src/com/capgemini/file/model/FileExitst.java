package com.capgemini.file.model;

import java.io.File;
import java.io.Serializable;

public class FileExitst implements Serializable {
	
	public boolean isFileExits(File file){
		return file.exists();
	}
	
}
