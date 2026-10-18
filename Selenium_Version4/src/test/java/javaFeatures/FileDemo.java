package javaFeatures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDemo 
{
	public static void main(String[] args) throws Exception 
	{
		File inputFile=new File(System.getProperty("user.dir")+File.separator+"Data.txt");
		File outputFile=new File(System.getProperty("user.dir")+File.separator+"DataOutput.txt");
		FileReader fr=new FileReader(inputFile);
		BufferedReader bReader=new BufferedReader(fr);
		FileWriter fw=new FileWriter(outputFile, true);
		BufferedWriter bWriter=new BufferedWriter(fw);
		String line;
		while((line=bReader.readLine())!=null)
		{
			line=line.replaceAll("\\?", "#");
			bWriter.write(line);
			bWriter.newLine();
		}
		bReader.close();
		bWriter.close();
	}
}
