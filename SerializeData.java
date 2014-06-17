package one;

import java.io.*;
import java.util.*;

public class SerializeData {
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		//------------------------------------
		
		DoubleLinkList internDB = new DoubleLinkList();
		
		DoubleLinkList internDB2 = new DoubleLinkList();
		
		
		intern interna = new intern("Ahmet", "Yýldýrým", 65);
		internDB.addIntern(interna);
		interna = new intern("Ali", "Demir", 41);
		internDB.addIntern(interna);
		
		FileOutputStream fOut=new FileOutputStream("interna.out");
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(fOut);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.writeObject(interna);
		out.close();
		fOut.close();
		System.out.println("It's OK!");

		//------------------------------------
		try{
		intern i = new intern("Ali","Demir", 22);
		
		FileOutputStream fOut2=new FileOutputStream("intern.out");
		ObjectOutputStream out2 = new ObjectOutputStream(fOut2);
		out2.writeObject(i);
		out2.close();
		fOut.close();
		System.out.println("It's OK!");
		}
		catch(IOException i)
	      {
	          i.printStackTrace();
	      }
		

	}

}
