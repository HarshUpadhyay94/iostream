package com.raystech.iostream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CopyconCommand {

	public static void main(String[] args) throws IOException {
		
		String target="D:/temp.txt";
		FileWriter writer= new FileWriter(target);
		PrintWriter pw=	new PrintWriter(writer);
		
		InputStreamReader isReader=new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);
		
		String line = in.readLine();
		while(!line.equals("quit")) {
			
			pw.println(line);
			line =in.readLine();
	
		}
		pw.close();
		isReader.close();
		
		}
}
