/**
 * 
    Author: Joshua Cogburn
    URL: http://www.joshcogburn.com
    
    Description: 
    This application reads a text file with race times 
    and checkpoints and determines if a racer has cheated.
    
 */

/**
 * @author Josh

 *
 */

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
 * 
 *	String nextIntString = keyboard.nextLine(); //get the number as a single line
 *	int nextInt = Integer.parseInt(nextIntString); //convert the string to an int
 *
 *
 *					racer 	= Integer.parseInt(strArray[1]);
 */



class CheaterDetector {
	public static void main(String[] args) {
		String fileName = "race-log.txt";
		//String text = readString(fileName);
		//System.out.println(text);
		//String[] words = readArray(fileName);
		
		Scanner scanner = null;

		
		try {

			scanner = new Scanner(new File(fileName));
			String line = scanner.nextLine();
			
			// Skip the header line by reading and ignoring it
			scanner.nextLine();
			System.out.println("Gun Time");
			System.out.println(line);
			

			scanner.useDelimiter(",");
			
			System.out.println(line);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error opening the file " + fileName);
			System.exit(0);
		}	
		/**
		while(inputStream.hasNextLine()){
		    String nextIntString = inputStream.nextLine(); //get the number as a single line
		    //System.out.println(nextIntString);

		    for(int i=0; i<=nextIntString.length(); i++){
		    	
		    	//tempStr = nextIntString
		    }
		    
		}
		**/

	}//main
}//class





/*
package  cheater_detector
	import java.util.Scanner;
	import java.io.File;

	import java.io.FileNotFoundException;

	public class CheaterDetector {
		public static void main(String[] args) {
			String fileName = "race-log.txt";
			Scanner inputStream = null;
			int sensor 	= 0;
			int racer  	= 0;
			int timeH	= 0;
			int timeM	= 0;
			int timeS	= 0;
			
			System.out.println("The file " + fileName
					+ "\ncontains the following lines:\n");
			try {
				inputStream = new Scanner(new File(fileName));
				// Skip the header line by reading and ignoring it
				
				String line = inputStream.nextLine();
				System.out.println("Gun Time");
				System.out.println(line);
				System.out.println("Race Sensors, Racer's, and Times");
			} catch (FileNotFoundException e) {
				System.out.println("Error opening the file " + fileName);
				System.exit(0);
			}
			while (inputStream.hasNextLine()) {
				//contains sensor, racer, & time
				String line = inputStream.nextLine();
				
				System.out.println(line);
				String[] strArray = line.split(",");
				sensor 	= Integer.parseInt(strArray[0]);
				racer 	= Integer.parseInt(strArray[1]);
				timeH 	= Integer.parseInt(strArray[2]);
				timeM 	= Integer.parseInt(strArray[3]);
				timeS 	= Integer.parseInt(strArray[4]);
				
				System.out.println(sensor+" "+racer+" "+timeH+" "+timeM+" "+timeS);
			}
			inputStream.close();
			

		}
}


try{
			fileInput = new Scanner(new File(fileName));
			String line = fileInput.nextLine();
			System.out.println("Gun Time");
			System.out.println(line);
		}
		catch (FileNotFoundException e){
			System.out.println("File not found!");
		}
		//if connected, read file
	     if(fileInput != null){         

	        //loop through file for integers and store in array    
	        try{
		        while (fileInput.hasNext()) {
		        	if(fileInput.hasNext()){
				           array[index] = fileInput.nextInt();
				           index++;
		        	}else{
		        		fileInput.next();
		        	}

		        }
		    }finally{
	        	fileInput.close();
	        }
	        
	        
		
		for(int i=0; i<words.length; i=i+1){
			System.out.println(words[i]);
		}
		
	}//main
	
	public static String readString(String file){
		String text = "";
		
		try{
			Scanner s = new Scanner(new File(file));
			while (s.hasNextLine()){
				text = text +s.next() + " ";
			}
		}catch(FileNotFoundException e){
			System.out.println("file not found");
		}
		
		return text;
	}//readString()
	
	public static String[] readArray(String file){
		int ctr = 0;
		try{
			Scanner s1 = new Scanner(new File(file));
			while(s1.hasNextLine()){
				ctr = ctr+1;
				s1.next();
				
			}
			
			String[] words = new String[ctr];
			
			Scanner s2 = new Scanner(new File(file));
			for (int i=0; i<ctr; i=i+1){
				words[i]=s2.next();
			}
			return words;
			
		}catch(FileNotFoundException e){
			
		}
		return null;
		
	}//readArray()
*/
