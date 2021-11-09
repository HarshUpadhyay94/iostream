package com.raystech.iostream;

import java.io.File;

public class IoStream {

	public static void main(String[] args) {
	

		File f= new File("D:/Harsh");
		System.out.println(f.getPath());
		System.out.println(f.getName());
		
		
		
		
		File directory=new File ("D:/");
		String[] list= directory.list();
		for (String string : list) {
		System.out.println(string);
			
		}
		
}
}