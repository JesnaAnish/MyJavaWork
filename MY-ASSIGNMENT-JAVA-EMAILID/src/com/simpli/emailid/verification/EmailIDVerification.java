package com.simpli.emailid.verification;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailIDVerification {

	public static void main(String[] args) {
		
		//Adding email to Arraylist
		
		List <String> emailList =new ArrayList<>();
		
		emailList.add("abc@yahoo.com");
		emailList.add("abc@gmail.com");
		emailList.add("123@yahoo.com");
		emailList.add("123@gmail.com");
		emailList.add("sam@yahoo.com");
		emailList.add("sam@gmail.com");
		emailList.add("tom@yahoo.com");
		emailList.add("tom@gmail.com");
		
		Scanner Input = new Scanner(System.in);
		
		EmailIDVerification emailVar = new EmailIDVerification();
		
		System.out.print("Please enter an emailid : ");
		
		String inMailId = Input.next();
		
		System.out.println("\nEntered email id : "+inMailId +"\n");
		
		boolean isExist = false;
		
		isExist = emailVar.checkValideEmail(inMailId, emailList, isExist);
		
        if(isExist) {
			
			System.out.println("The email id "+inMailId+ " is present in the array");
		}
		
		else {
			
			System.out.println("The email id "+inMailId+ " is not present in the array");

		}
		
	}
		
		

		
	
		private boolean checkValideEmail(String inMailId,List<String>emailList,boolean isExist)
		
		{
		
		for(String id :emailList) {
			
			if (inMailId.equals(id)) {
				
				isExist = true;
								
			}
			
		}
		
		
		return isExist;
		
		
	
	}
		
		
}
		

