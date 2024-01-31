package Jan_4;

import java.io.*;
import java.lang.*;
import java.util.*;
 
class Parent {
    public void show()
    {
        System.out.println("parent");
    }
}
 
class Child1 extends Parent {
    public void show1() { 
    	//show();  //Calling parent Also
    	System.out.println("Child1"); }
}
 
class Child2 extends Parent {
    public void show2()
    {
    
        System.out.println("Child2");
    }
}
 
// Drived class
public class Inheritance {
    public static void main(String[] args)
    {
    	Parent p1 = new Parent();
    	p1.show();
    	Child1 ch1 = new Child1();
    	ch1.show1();
    	Child2 ch2 = new Child2();
    	ch2.show2();
    
    	
    
    }
}
