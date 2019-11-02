package com.BridgeLabz.Functional;

public class Distance {
	public static void main(String[] args)
	{
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	double distance=Math.pow(x*x,y*y);
	//double d=Math.pow(4,16);
	System.out.println("the distance from the point of "+x+" "+y+ "from(0,0)"+"is"+distance);
	//System.out.println("d value is"+d);
	}
	}
