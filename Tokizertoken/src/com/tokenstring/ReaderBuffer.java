package com.tokenstring;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class ReaderBuffer {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		int count=0;
		try {
			fr = new FileReader("D:\\java_program\\B.java");
			br = new BufferedReader(fr);
			
			String line;
			while((line=br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(line);
				while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());	
				count++;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("done"+count);
			System.out.println("File copied");
		} catch (IOException e) {
			System.out.println("done"+count);
			System.out.println("File copied");
			e.printStackTrace();
		}
		
	}

}
