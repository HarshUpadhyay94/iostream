package com.raystech.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSrc {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream in=new FileInputStream("D:/object.ser");
		ObjectInputStream o=new ObjectInputStream(in);
		Serilization s=(Serilization) o.readObject();
		System.out.println(s.getFname());
	}
}
