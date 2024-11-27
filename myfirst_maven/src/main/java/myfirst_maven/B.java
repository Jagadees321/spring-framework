package myfirst_maven;

public class B extends A {
//	 public void m1() {
//		  System.out.println("i am m1 class B"); 
//	   }
	 public void m2() {
		  System.out.println("i am m2 class B"); 
	   }
	 
	 public static void main(String[] args) {
//		B b=new B();
//		b.m1();
		//upcasting 
		// def: creating object child class and assigning it to super class reference
		
		A a=new B();
	//	a.m2(); // with upcasting we cant access child class properties
	//	a.m1();
		
		
		//downcasting
		
		B b=(B)a;
		b.m2();
		b.m1();
	}
}
