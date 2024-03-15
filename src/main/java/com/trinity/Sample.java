package com.trinity;

public class Sample {
public void drawStarPattern(int rows) {
	for (int lines = 0; lines < rows; lines++) {
	for (int space = rows; space>= lines; space--) {
		System.out.print(" ");
	}	
	for (int ast = 0; ast <=lines; ast++) {
		System.out.print("* ");
	}
	System.out.println();
	}

}
public static void main(String[] args) {
	Sample s= new Sample();
	s.drawStarPattern(4);
}
}
