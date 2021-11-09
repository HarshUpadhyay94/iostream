package com.raystech.iostream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class Srcconstructor {



	public static void main(String[] args) throws Exception {
		
		Serilization s= new Serilization();
		s.setFname("ram");
		s.setLname("kapoor");
		s.setPwd(1234);
		FileOutputStream f = new FileOutputStream ("D:/object.ser");
		ObjectOutputStream in = new ObjectOutputStream(f);
		
		
		in.writeObject(s);
		in.close();
		f.close();
		
		System.out.println("done");
	}
	
}
