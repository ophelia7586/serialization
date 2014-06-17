package one;

import java.io.*;

public class SerializeData {
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		try{
		intern i = new intern("Ali","Demir", 22);
		
		FileOutputStream fOut=new FileOutputStream("intern.out");
		ObjectOutputStream out = new ObjectOutputStream(fOut);
		out.writeObject(i);
		out.close();
		fOut.close();
		System.out.println("It's OK!");
		}
		catch(IOException i)
	      {
	          i.printStackTrace();
	      }
		

	}

}
