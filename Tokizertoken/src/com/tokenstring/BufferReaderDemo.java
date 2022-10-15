package com.tokenstring;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class BufferReaderDemo {
public static void main(String[] args) {
	FileReader fr=null;
	BufferedReader br=null;
	
	try {
		fr = new FileReader("");
		br = new BufferedReader(fr);
		
		String line;
		while((line=br.readLine())!=null);
		
		StringTokenizer st=new StringTokenizer(line);
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}
}
