package com.epam.calculator;
public class Calculator {
	Operations op=new Operations();
	
	public double calculatorop(double a,double b,int c)
	{
		double result;
	 switch(c)
	 {
	 case 1:result=op.getaddition(a,b);break;
	 case 2:result=op.getsubtraction(a,b);break;
	 case 3:result=op.getmultiplication(a,b);break;
	 case 4:result=op.getdivision(a,b);break;
	 case 5:result=op.getmodulus(a,b);break;
	 default:result=Double.NaN;
		 System.out.println("Invalid Operation");break;
	 }
	 return result;
	}
}
