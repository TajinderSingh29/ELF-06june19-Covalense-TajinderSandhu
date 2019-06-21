package com.covalense.corejavaapp.array;

public class MyArrayClass {

	private Object[] myArray;
	private int index;

	public MyArrayClass() {
		this(10);
	}

	public MyArrayClass(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("Size should be greater than zero !!!");
		}
		myArray = new Object[size];
		index = 0;
	}// End of Constructor

	public void add(Object val) {
		if (index >= myArray.length) {
			Object[] myArrayNew = new Object[myArray.length * 2];
			System.arraycopy(myArray, 0, myArrayNew, 0, myArray.length);
			myArray = myArrayNew;
		}
		myArray[index] = val;
		index++;
	}

	public Object get(int position) {
		return myArray[position];

	}

	public void remove(int position) {
		/*
		 * for (int i =position; i <myArray.length; i++) { if(myArray[position]!=null) {
		 * myArray[position++]=myArray[position]; } else { myArray[position]=null; } }
		 */
		if (position > myArray.length) {
			throw new ArrayIndexOutOfBoundsException("position is not present in the array !!!");
		}
		System.arraycopy(myArray, position + 1, myArray, position, myArray.length - 1 - position);
	}

	public int getSize() {
		return index - 1;
	}
}// End of Class
