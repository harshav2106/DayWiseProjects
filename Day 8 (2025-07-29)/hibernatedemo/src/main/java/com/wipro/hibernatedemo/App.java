package com.wipro.hibernatedemo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.wipro.hibernatedemo.entity.Pan;

import hibernatedemo.repo.PanRepo;
import hibernatedemo.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	int choice=0;
    	do {
    	System.out.println("--Menu---");
    	System.out.println("1.--Create Pan---");
    	System.out.println("2.--Find by Id ---");
    	System.out.println("3.--Update Pan---");
    	System.out.println("4.--Delete by  id---");
    	System.out.println("5.--Find All Pan's---");
    	System.out.println("6.--Find All Pan Holder Names---");
    	System.out.println("7.--Find By pan number---");
    	System.out.println("9.--Exit---");
    	Scanner sc= new Scanner(System.in);    	
    	  choice= sc.nextInt();
    	  switch(choice)
	    	{
	    		case 1:
	    			PanRepo.createPan();
	    		break;
	    		case 2:
	    			System.out.println("Please enter Pan id:");
	    			int id= sc.nextInt();
	    			Pan m=PanRepo.findById(id);
	    			System.out.println(m);
	    			break;
	    		case 3:
	    			PanRepo.updatePan();
	    			break;
	    			
	    		case 4:
	    			 
	    			System.out.println("Please enter Pan id:");
	    			int id1= sc.nextInt();
	    			PanRepo.deleteById(id1);
	    			break;
	    		case 5:
	    			List<Pan> list=PanRepo.findAll();
	    			System.out.println(list);
	    			break;
	    		case 6:
	    			List<String> panNameList=PanRepo.findAllPanHolderNames();
	    			System.out.println(panNameList);
	    			break;
	    		case 7:
	    			System.out.println("Please enter panNumber");
	    			String panNumber=sc.next();
	    			List<Pan> listPans= PanRepo.findBypanNumber(panNumber);
	    			System.out.println(listPans);
	    			break;
	    		case 9:
	    			return;
	    		
	    		default:
	    			System.out.println("Invalid option please try again");
	    			break;
	    	
	    	 }
    	}while(choice!=9);
    	  
    }
}
