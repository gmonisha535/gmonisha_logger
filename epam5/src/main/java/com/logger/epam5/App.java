package com.logger.epam5;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
	private static final Logger Logger = LogManager.getLogger(App.class);
	private static Scanner input;
    public static void main( String[] args )
    {
    	 input = new Scanner(System.in);
         Logger.debug("Enter option");
         Logger.debug("1. Simpele Intrest"+"\n"+"2. Construction of house");
         int op = input.nextInt();
         switch(op) {
         case 1:
        	 Logger.debug("Enter principal ammount");
             int p = input.nextInt();
             Logger.debug("Enter rate of intrest");
        	 float rate = input.nextFloat();
        	 Logger.debug("Enter time");
        	 float time = input.nextFloat();
        	 Logger.debug("Enter your option");
        	 Logger.debug("a. Simple Intrest"+"\n"+"b. Compound Intrest");
        	 char ca = input.next().charAt(0);
        	 switch(ca){
        		 case 'a':
        			 SimpleInterest s = new SimpleInterest(p,time,rate);
                	 float simple = s.simpleIntrest();
                	 Logger.debug(simple);
                	 break;
        		 case 'b':
        			 Logger.debug("Enter of number of times to calcuate compound Intrest");
        			 int noof = input.nextInt();
                	 CompounInterest c = new CompounInterest(p,time,rate,noof);
                	 float ci = c.compoundIntrest();
                	 Logger.debug(ci);
                	 break;	 
        	   }
        	 break;
         case 2:
        	 Logger.debug("Cost to construst a house based on the materials per 1 Square feet");
        	 Logger.debug("1. 1200 INR if we use standard materials");
        	 Logger.debug("2. 1500 INR if we use above standard materials");
        	 Logger.debug("3. 1800 INR if we use high standard material");
        	 Logger.debug("4. 2500 INR if w use high standard material and fully automated home");
        	 Logger.debug("Enter number of square feets of house you required");
        	 float feets = input.nextFloat();
        	 Logger.debug("Enter the option to select the material");
        	 int option = input.nextInt();
        	 switch(option) {
        	 case 1:
        		 Logger.debug("Cost to construct your house as your request "+feets*1200);
        		 break;
        	 case 2:
        		 Logger.debug("Cost to construct your house as your request "+feets*1500);
        		 break;
        	 case 3:
        		 Logger.debug("Cost to construct your house as your request "+feets*1800);
        		 break;
        	 case 4:
        		 Logger.debug("Cost to construct your house as your request "+feets*2500);
        		 break;
        		 }
        	 break;
         }
    }
}
