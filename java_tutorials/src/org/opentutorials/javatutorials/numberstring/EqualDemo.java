package org.opentutorials.javatutorials.numberstring;

public class EqualDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1==2);           //false
        System.out.println(1==1);           //true
        System.out.println("one"=="two");   //false
        System.out.println("one"=="one");   //true
        
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b));
	}

}
