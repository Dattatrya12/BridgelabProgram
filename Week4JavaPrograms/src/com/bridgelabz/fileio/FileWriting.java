package com.bridgelabz.fileio;

import com.utility.Utility;

public class FileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateFile file=new CreateFile();
		file.openFile();
		Utility.getStats5(0, 1);
		//file.addRecords();
		file.closeFile();

	}

}
