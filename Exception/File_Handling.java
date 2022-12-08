package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
	public static void main(String arg[]) throws IOException{
	
	//Create File
		File f=new File("D:/JavaProgram/Hi.txt");
		try{
		if(f.createNewFile()) {
		System.out.println("File " +f.getName()+" is File created.");
		}else {
		System.out.println("File is already exited");}
		} catch(IOException ioe){
		System.out.println("An unexpected error");
		ioe.printStackTrace();}
	
	//Read File
		FileInputStream fis=null;
		fis=new FileInputStream("D:/JavaProgram/Hi.txt");
		int i;
		while((i=fis.read()) != -1) {
		System.out.print((char)i+""); }
		fis.close();	
		
		
	//Write a file
	try{
		FileWriter fwrite=new FileWriter("D:/JavaProgram/Hi.txt");
			fwrite.write("Happy birthday");
			fwrite.close();
			System.out.println("wrote to the file done");
			}catch(IOException e) {
			e.printStackTrace();}	
	
	//Read file using Scanner
	try{
	File f=new File("D:/java/Hello.txt");
	Scanner s=new Scanner(f);
	while(s.hasNextLine()){
	String fileData=s.nextLine();
	System.out.println(fileData);}
	s.close();
	}catch(FileNotFoundException fnf) {
	fnf.printStackTrace();}
}}
