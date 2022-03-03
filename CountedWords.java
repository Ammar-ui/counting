/*@author AmmarnYaser
 * @param  count repeated words
 * @version 20/9/2021
 * this file will take name of file input and the name of output file then program one of these operation 
 * counting repeated words then writed in out file and sorted from decreasing to increasing or if the user choose 
 * asc will sorted from increasing to decreasing , by default will sorted from decreasing to increasing 
 */
package HW_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Stream;

public class CountedWords {

	public static void main(String[] args) throws IOException {
		

Scanner input=new Scanner(System.in);
// make an Object from HashMap function 
HashMap<String, Integer> CountedWords = new HashMap<String,Integer>();	
	
//args[0] mean first name for input file;
		
	
              if(args[0].length()<2){
                  System.out.println("sorry your parameter less than ");
                  System.exit(0);
              }
               // create an object from input file
               
		File F=new File(args[0]); 
                
               
          
		if(F.isFile()) {
			// Scanner code to deal with this file for their Contain(String)
			Scanner ReadFile=new Scanner( F);
			
			int i=0;
			
			Integer repeted = null;
			// while loop that work until pass all words in the file
			while(ReadFile.hasNext()) {
				String text=ReadFile.next().toLowerCase();
				//.split method for skip all what i put in quotation mark and save remaining in String array
				String word[]=text.split("[ \n \t \r . , ; : ! ? () {} # @ * - + _  = ' 1 2 3 4 5 6 7 8 9 0 -- ]");
				
				for(String x:word) {
					//skip if the length less than 2
					if(x.length()<2)
					continue;
					
				 repeted= CountedWords .get(x);//count repeated number for each word 
				
				if(repeted!=null)
					repeted++;
				else
					repeted=1;
				 CountedWords .put(x, repeted);// set each word with their repeated number
				
				}
				
			}
			ReadFile.close();											
		}
               
                else{
                    System.out.println(F.isFile()); // check if the file on the desk 
                    System.out.println("sorry your file is not avalieble ");
                     System.exit(0);
                }
		Set<Entry<String,Integer>> EntrySet= CountedWords .entrySet(); //create set that has same elements in hashmap 
		List<Entry<String,Integer>> list=new ArrayList<>(EntrySet); // define an arrayList that include entry set
        //return o1.getValue().compareTo(o2.getValue());
        
		try {
	if(args[2].equals("des")){
		Collections.sort(list,new Comparator<Entry<String,Integer>>(){
			@Override
			
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return (o1.getValue().compareTo(o2.getValue())*-1);
			}	
		});
		
			PrintWriter v=new PrintWriter(args[1]); // create ouputfile 
			try {
			for(int i1=0;i1<(list.size());i1++) {
				
				
				v.write(list.get(i1).toString()+"\n");	// write results in Outputfile
				}
			v.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		list.forEach(s->{
			System.out.println(s.getKey()+"  time repeted  "+s.getValue());
		});
		System.out.println("Succeful procces");
		
        }
       			
	if(args[2].equals("asc")) {
		
		Collections.sort(list,new Comparator<Entry<String,Integer>>(){
			@Override
			
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				
				return o1.getValue().compareTo(o2.getValue());
			}	
		});
		
			PrintWriter v=new PrintWriter(args[1]); // create ouputfile 
			try {
			for(int i1=0;i1<(list.size());i1++) {
				
				
				v.write(list.get(i1).toString()+"\n");	// write results in Outputfile
				}
			v.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		list.forEach(s->{
			System.out.println(s.getKey()+"  time repeted  "+s.getValue());// print the HashMap
		});
		System.out.println("Succeful procces");

	}
		}catch(Exception e) {
			Collections.sort(list,new Comparator<Entry<String,Integer>>(){
				@Override
				
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					// TODO Auto-generated method stub
					return (o1.getValue().compareTo(o2.getValue())*-1);
				}	
			});
			
				PrintWriter v=new PrintWriter(args[1]); // create ouputfile 
				try {
				for(int i1=0;i1<(list.size());i1++) {
					
					
					v.write(list.get(i1).toString()+"\n");	// write results in Outputfile
					}
				v.close();
				}catch(Exception c) {
					System.out.println(c);
				}
			list.forEach(s->{
				System.out.println(s.getKey()+"  time repeted  "+s.getValue());
			});
			System.out.println("Succeful procces");
		}
	}
				
}		
	
	



