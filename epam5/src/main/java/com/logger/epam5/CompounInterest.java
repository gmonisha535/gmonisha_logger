package com.logger.epam5;

public class CompounInterest {
	int principal,noOfTimes;
	   float rateOfIntrest,time;
	   CompounInterest(int principal,float time,float rateOfIntrest,int noOfTimes){
		   this.principal = principal;
		   this.time = time;
		   this.rateOfIntrest = rateOfIntrest;
		   this.noOfTimes = noOfTimes;
	   }
	   public float compoundIntrest() {
		   float c = this.principal*(float)(Math.pow((1+(this.rateOfIntrest/this.noOfTimes)),(this.noOfTimes*this.time)));
		   return c;
	   }
}
