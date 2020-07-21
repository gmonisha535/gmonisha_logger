package com.logger.epam5;

public class SimpleInterest {
	int principal;
    float rateOfIntrest,time;
    SimpleInterest(int principal,float time,float rateOfIntrest){
   	 this.principal = principal;
   	 this.time = time;
   	 this.rateOfIntrest = rateOfIntrest;
    }
    public float simpleIntrest() {
   	 float s = (this.principal*this.time*this.rateOfIntrest)/100;
   	 return s;
    }
}
