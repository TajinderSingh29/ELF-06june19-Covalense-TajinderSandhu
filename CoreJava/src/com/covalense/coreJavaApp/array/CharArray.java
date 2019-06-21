package com.covalense.corejavaapp.array;

public class CharArray {
	public static void main(String[] args) {
		char[] c=new char[9];
		c[0]='T';
		c[1]='A';
		c[2]='J';
		c[3]='I';
		c[4]='N';
		c[5]='D';
		c[6]='E';
		c[7]='R';
		for (int i = 0; i <=c.length; i++) {
			System.out.print(c[i]);
			
		}
		System.out.print(c.length);
	}

}
