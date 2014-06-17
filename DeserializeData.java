package one;

import java.io.*;

public class DeserializeData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intern i = null;
		
		try
	      {
	         FileInputStream fileIn = new FileInputStream("intern.out");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         i = (intern) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException e)
	      {
	         e.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("Employee class not found");
	         c.printStackTrace();
	         return;
	      }
		System.out.println("Intern name " + i.getName());
		System.out.println("Intern surname " + i.getSurname());
		System.out.println("Intern age " + i.getAge());
		
	}

}
