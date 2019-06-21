
package com.covalense.corejavaapp.javabean;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Dinga");
		e.setId(2);

		DB3 i = new DB3();
		DB4 j = new DB4();
		i.receive(e);
		j.receive(e);

	}

}
