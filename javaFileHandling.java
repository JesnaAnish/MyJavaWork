package com.simpli.java.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class javaFileHandling {

	public static void main(String[] args) {
		
		//program to create,write,read and append file
		
		String filename = "/home/jesnawork22gmai/MyWork/MY-JAVA-WORK/Sample.txt";
		File fname = new File (filename);
		
		//calling create,write,append and read file methods
		
		fileCreator(fname);
		fileWriter(fname);
		fileAppend(fname);
		fileReader(fname);
		
			

	}
	
	
	public static void fileCreator(File fname) {
		
		try {
			if (fname.createNewFile()) {
				System.out.println(" The file "+fname.getName()+ " is created");
			}
		} catch (IOException e) {
			
			System.out.println("The file doesnot created ....");
		}
		
		if (fname.exists()) {
			System.out.println("The name of the file is  : "+fname.getName());
		}
		else {
			System.out.println("The file doesnot exist.....");
		}
		
	}
	
	
	public static void fileWriter(File fname) {
		
		try {
			
			FileWriter fwriter = new FileWriter(fname);
					
			fwriter.write("The is the starting of the file ");
			
			fwriter.close();
			
			System.out.println("The content is successfully written inside the file " +fname.getName());
			
		} catch (IOException e) {
			
			System.out.println("Unexpected error occured......"+e.getMessage());
			
		}
		
	}
	
	
	
	public static void fileAppend(File fname) {
		
		try {
			
			BufferedWriter out = new BufferedWriter(new FileWriter(fname,true));
			
			out.write("\nThis is the next line of the file\n");
			
			System.out.println("The content is successfully append inside the file " +fname.getName());
			
			out.close();
			
		} catch (IOException e) {
			
			System.out.println("Unexpected error occured......"+e.getMessage());
			
		}
		
	}
	
	
	public static void fileReader(File fname) {
		
		System.out.println("The file "+fname.getName() +" starts reading its content......");
		
		try {
			
			Scanner freader = new Scanner(fname);
			
			while(freader.hasNextLine()) {
				
				System.out.println(freader.nextLine());
				
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Unexpected error occured......"+e.getMessage());
		}
		
	}
	
}
