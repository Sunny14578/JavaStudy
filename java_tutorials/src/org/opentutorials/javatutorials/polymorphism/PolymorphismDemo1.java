package org.opentutorials.javatutorials.polymorphism;
class A{
    public String x(){return "x";}
}
class B extends A{
    public String y(){return "y";}
    public String x() {return "B.x";}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		System.out.println(obj.x());
	}

}
