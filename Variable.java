package javaBasics;

public class Variable {
	
    int p=50; //instance variable
	
    static int m=100; //static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable obj=new Variable();
		System.out.println(obj.p);
		 
       int n=90; //local variable
       System.out.println(m);
       System.out.println(n);
	}
	
}