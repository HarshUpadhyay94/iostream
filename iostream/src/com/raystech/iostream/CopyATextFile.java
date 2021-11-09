package com.raystech.iostream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyATextFile {

	public static void main(String[] args) throws IOException {
		String source= "c:/desktop.txt";
		String target="c:/token.txt";
		
		
		FileReader reader=new FileReader(source);
		FileWriter writer= new FileWriter(target);
		
		int ch=reader.read();
		while(ch!=-1) {
			writer.write(ch);
			ch=reader.read();
			
		}
		writer.close();
		reader.close();
	}

}
