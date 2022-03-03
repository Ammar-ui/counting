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

public class TestQ {

	public static void main(String[] args) throws IOException {
		// make an Object from HashMap function 

Scanner input=new Scanner(System.in);
HashMap<String, Integer> words = new HashMap<String,Integer>();	
			

		
	System.out.println("Choose  a :for input file, b :for outfile , c : for descending order \n testQ ");
	
	
	

		String NameIn=args[0];
		/*
		if(NameIn.length()<2) {
			System.out.println("Sorry your parameter less than two ");
			System.exit(0);
		}
		*/
		File F=new File(NameIn);
		if(F.isFile()) {
			// Scanner code to deal with this file for their Contain(String)
			Scanner ReadFile=new Scanner( F);
			
			int i=0;
			
			Integer count = null;
			// while loop that work until pass all words in the file
			while(ReadFile.hasNext()) {
				String text=ReadFile.next().toLowerCase();
				//.split method for skip all what i put in quotation mark and save remaining in String array
				String word[]=text.split("[ \n \t \r . , ; : ! ? () {} # @ * - + _  = ' 1 2 3 4 5 6 7 8 9 0 -- ]");
				
				for(String x:word) {
					//skip if the length less than 2
					if(x.length()<2)
					continue;
					
				 count=words.get(x);//count repeated number for each word 
				
				if(count!=null)
					count++;
				else
					count=1;
				words.put(x, count);// set each word with their repeated number
				
				}
				
			}
			ReadFile.close();		
			
			
			
					
			
	//words.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	//define an entry set that has same element in hashMap then puted inside ArrayList 
	
	//method from utill that sort the Hashmap
	
			
		}
	
	Set<Entry<String,Integer>> entrySet=words.entrySet();
	List<Entry<String,Integer>> list=new ArrayList<>(entrySet);
	Collections.sort(list,new Comparator<Entry<String,Integer>>(){
		@Override
		
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			// TODO Auto-generated method stub
			return o1.getValue().compareTo(o2.getValue());
		}	
	});
	System.out.println("list here");
	System.out.println(words);
		/*
		System.out.println("Write the name of Outputfile:");
		
		String OutputN=input.next();
		PrintWriter v=new PrintWriter(OutputN);
		*/
		PrintWriter v=new PrintWriter(args[1]);
		try {
		for(int i1=0;i1<(list.size());i1++) {
			
			
			v.write(list.get(i1).toString()+"\n");	// write results in file
			}
		v.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	
	
		list.forEach(s->{
			System.out.println(s.getKey()+"\t"+s.getValue());
		});
		System.out.println("Succeful");
		System.exit(0);
		
	
	
	
	}
				
}		
	/*
	 * hgf]h	
	// make object from File that take address from PC
		File F=new File("C:\\Users\\Ammar\\Desktop\\big.txt");
		// Scanner code to deal with this file for their Contain(String)
		Scanner ReadFile=new Scanner( F);
		// make an Object from HashMap function 
		HashMap<String, Integer> words = new HashMap<String,Integer>();
		
		
		
	int i=0;
		
		Integer count = null;
		// while loop that work until pass all words in the file
		while(ReadFile.hasNext()) {
			String text=ReadFile.next().toLowerCase();
			//.split method for skip all what i put in quotation mark and save remaining in String array
			String word[]=text.split("[ \n \t \r . , ; : ! ? () {} # @ * - + _  = ' 1 2 3 4 5 6 7 8 9 0 -- ]");
			
			for(String x:word) {
				//skip if the length less than 2
				if(x.length()<2)
				continue;
				
			 count=words.get(x);//count repeated number for each word 
			
			if(count!=null)
				count++;
			else
				count=1;
			words.put(x, count);// set each word with their repeated number
			
			}
			
		}
		ReadFile.close();			
		
//words.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//define an entry set that has same element in hashMap then puted inside ArrayList 
Set<Entry<String,Integer>> entrySet=words.entrySet();
List<Entry<String,Integer>> list=new ArrayList<>(entrySet);
//method from utill that sort the Hashmap
Collections.sort(list,new Comparator<Entry<String,Integer>>(){
	@Override
	
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().compareTo(o2.getValue());
	}	
});
*/
/*
list.forEach(s->{
	System.out.println(s.getKey()+"\t"+s.getValue());
});
*/

// create OutputFile
	/*
	 * النهاية الناجحة
PrintWriter v=new PrintWriter("bigCountedWord.txt");

for(int i1=0;i1<(list.size());i1++) {
	try {// check from each parameter if it less that two
	if(list.get(i1).getKey().length()<2) {
		throw new Exception ("Sorry Your text include prameter less than 2");		
	}
	v.write(list.get(i1).toString()+"\n");	// write results in file
	}catch (Exception e) {
		System.out.println(e);
		System.exit(0);
	}
}
v.close();

//Final_Section
//check if the file on Desk
File Found=new File("C:\\Users\\Ammar\\eclipse-workspace\\HW2_1\\bigCountedWord.txt");
try {	


if(F.isFile()==false) 
	throw new Exception ("Sorry your file is not avalible");
}
catch(Exception e) {
	System.out.println(e);
	System.exit(0);
}
*/
/*
if(choice.equals("a")) {
System.out.println(F.getName());	
}
if(choice.equals("b")) {
	
System.out.println(Found.getName());	
}
if(choice.equals("c")) {
	list.forEach(s->{
		System.out.println(s.getKey()+"time repeated:"+s.getValue());
	});
}
*/

/*
try {
	if(list.get(2).getKey()==null) {
words.put(list.get(2).getKey(), 0)
	}
}catch (Exception e) {
	
}
*/


/*
list.forEach(s->{
	System.out.println(s.getKey()+"\t"+s.getValue());
});
*/



	
	
		
		
	
	
		
			/*
			try {
			
			String  text=ReadFile.next();
					
			String words[]=text.split("[ \n\t\r . , ; : ! ? () {} # @ *]");
			
			list.add(words[i]);	
			
			}
			catch(Exception c) {
				
			}
		}
		*/
		
		
	/*
		for(int b = 0; b < list.size(); b++) {  
            count = 1;  
            for(int j = b+1; j < list.size(); j++) {  
                if(list.get(b).equals(list.get(j))) {  
                    count++;  
                    //Set words[j] to 0 to avoid printing visited word  
                    list.set(j, "0");  
                }  
            }  
              
            //Displays the duplicate word if count is greater than 1  
            if(count > 1 && list.get(b) != "0")  
                System.out.println(list.get(b)+"\t"+count);  
        } 
       */
		
		
		// TODO Auto-generated method stub

	



