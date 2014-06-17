
package one;

import java.io.*;

public class intern implements Serializable {

	private String name;
	private String surname;
	private int age;
	
	public intern(String name, String surname, int age){
		
		this.name = name;
		this.surname = surname;
		this.age = age;
		
	}
	
	public String getName(){
			return this.name;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public int getAge(){
		return this.age;
	}
}
