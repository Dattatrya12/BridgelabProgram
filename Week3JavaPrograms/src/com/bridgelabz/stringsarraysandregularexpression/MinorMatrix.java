package com.bridgelabz.stringsarraysandregularexpression;

import com.utility.Utility;

public class MinorMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]=new int[3][3];
		int minor[][]=new int[2][2];
		Utility.createMinor(matrix, minor, 3, 3);

	}

}
