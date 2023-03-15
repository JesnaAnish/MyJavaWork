package com.simpli.java.phase1.project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CompanyLocker {

	public static void main(String[] args) {
			
		   System.out.println("\n\t+++++++++++++++++++++++++++++++++++++++++\n");
	       System.out.println("\tWelcome to Company Lockers Pvt Ltd \n");
	       System.out.println("\t+++++++++++++++++++++++++++++++++++++++++");
	       System.out.println("\n\t\t\t\tDeveloper :: Jesna Anish \n\n");
	       
		
			//Creating a directory named filedirectory
		
		   String path = "/home/jesnawork22gmai/MyWork/filedirectory";
		
		   File file = new File(path);  
	       file.mkdir();
	       
	       //Creating files in the directory
	       
	       ArrayList<String> filelist = new ArrayList<String>();
	       filelist.add("order");
	       filelist.add("payment");
	       filelist.add("customerdetails");
	       filelist.add("inventory");
	       
	       
	       
	       if(file.exists()) {	 
	    	   
	    	   for (String filename : filelist) {
		      
				fileCreator(path,filename);}
				       
	       }else {
	    	   System.out.println("Sorry !!!!!Cannot create the filedirectory....");
	       }
	              
	       System.out.println("List of files in the directory are :\n");
	       
	       filePrinter(file); // function for printing the filenames
	       
	       optionsSelection(filelist,file); //function for selecting options 1.Retrieve 2.add 3.Delete 4.Search 5.close App
	      
	 	
	
	}
	
	
    //function to display the filenames present in the directory
	private static void filePrinter(File file) {
		
		
		File filesList[] = file.listFiles();
		
		ArrayList arrFilelist = new ArrayList();
	      
	       for(File filename : filesList) {
	         
	    	   arrFilelist.add(filename.getName());
	       }
	    
	       System.out.println(arrFilelist); 
	     
		
	       System.out.println("\n");
	}
	
	
	private static void optionsSelection(ArrayList<String > filelist ,File file ) {
		
		
        String[] arr = {"1. Retrieving files in ascending order",
                "2. Add a file",
                "3. Delete a file",
                "4. Search for a particlar file",
                "5. Close the application"
        };
        
        int[] arr1 = {1,2,3,4,5};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }

        System.out.println("\nEnter your choice:\t");
        
        boolean optionValid = false;
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
               
        int flag = 0;
        
        for(int j=1;j<=slen;j++){
        	
        	
            if(options==j){
            	 
            	flag =1;
            	
                switch (options){
                
                    case 1:
                        //Calling function to retrieve file names in ascending order
                    	
                        retrieveFile(file);
                        System.out.println("\n");
                       
                        optionsSelection(filelist,file);
                        break;
                        
                    case 2:
                    	
                        System.out.println("Enter the name of the file to add: \n");
                        
                        String value = sc.next();
                        String path = file.getPath();
                        
                        fileCreator(path,value);//calling function to create a newfile
                        
                        System.out.println("Your file has been created.... \n");
                        
                        filePrinter(file);
                      
                        optionsSelection(filelist,file);
                        
                        break;
                        
                    case 3:
                       //function to delete a user input file
                        optionValid = deleteFile(file,optionValid); 
                        
                        if (optionValid == true) {
                        	filePrinter(file);
                        	
                        }else {
                        	
                        	System.out.println("Cannot find the file...Please enter valid file name again \n");
                        	
                        	deleteFile(file,optionValid);
                                                	
                        }
                        
                        optionsSelection(filelist,file);
                        
                        break;
                        
                    case 4:
                    	
                    	System.out.println("Enter the name of the file to search: \n");
                    	
                        String choice = sc.next();
                       
                        String inputFile = choice+".txt";
                        
                        fileFinder(inputFile,file); //calling function to find a user input file name 
                        
                        filePrinter(file);
                        
                        optionsSelection(filelist,file);
                                                
                        break;
                    
                    case 5:
                    	
                    	System.out.println("Closing your application... \nThank you!");
                        break;
                        
                    default:
                        
                    	System.out.println("You have made an invalid choice!!!!! Select again......");
                    	
                    	optionsSelection(filelist,file);
                    	
                        break;
                }
                
            }
            
        }if (flag ==0) {
        	

        	System.out.println("You have made an invalid choice!!!!! Select again......\n");
        	
        	optionsSelection(filelist,file);
        	
           	
        }

    }
	
	
	//function to create files in directory	
	public static void fileCreator(String path, String filename)  {	
	
		try {
	    		   
			File fname = new File(path + "/" +filename + ".txt") ;
	    		   
			fname.createNewFile();
			
			} catch (IOException e) {
				
				System.out.println("Cannot create the file....");
			}
		
		
	}

	//function to retrieve files from directory in ascending order
	public static void retrieveFile(File file) {
			
		File filesList[] = file.listFiles();
		
		ArrayList ascendFile = new ArrayList();
		
		for(File filename : filesList) {
			
			ascendFile.add(filename.getName());
							
		}
		Collections.sort(ascendFile);
		
		System.out.println("The Files present in the directory are :: \n ");
		
		System.out.println(ascendFile);
		
			
	
	}
	
	//function to delete a user input filename from the directory
	public static boolean deleteFile(File file ,boolean optionValid) {
		
		File filesList[] = file.listFiles();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the file to delete ::");
    	String choice = sc.next();
    	String file_choice = choice+".txt";
    	
        
    	for(File filename : filesList) {        	
        	 
    		if (filename.getName().equals(file_choice)) {
        		 
        	    filename.delete();
        	  
    			optionValid =true;
        	 
        		System.out.println("The file " +filename.getName()+" has been deleted from the directory \n");
        	 
        	 }
        	 				
		}
        
    	return optionValid;
	}
	
	//function to find a user input filename in the directory
	private static void fileFinder(String inputFile,File file){
				
		File filesList[] = file.listFiles();
		
		int flag = 0;
		
        if (filesList == null) {
        	
            System.out.println("Empty directory.");
            
        } else {
        	        
        	for (File filename:filesList) {
        		
        		if (filename.getName().equals(inputFile)) {
        			
        			System.out.println("The file "+filename.getName() + " has been found \n");
        			
        			flag =1;
        		}
        		      		
        		
        	}if (flag == 0) {
        		
                System.out.println("\nFile Not Found......... \n");
            }
        	
        }
		
		
	}
	

}
