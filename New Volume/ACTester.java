class AC1Tester{

public static void main (String test[]){

System.out.println("Main started");
// click on the button
//Speaker.name="";
 boolean connected = AC.onOrOff();
 System.out.println("Is AC connected"+ connected);
 AC.increaseSpeed();
  AC.increaseSpeed();
 AC.increaseSpeed();
 AC.increaseSpeed();

  AC.decreaseSpeed();
AC.decreaseSpeed();
 AC.decreaseSpeed();
 AC.decreaseSpeed();
 
 boolean connected1 = AC.onOrOff();
  System.out.println("Is AC connected1"+ connected1);
   AC.increaseSpeed();
    AC.increaseSpeed();
	 AC.increaseSpeed();
	  AC.increaseSpeed();
  
  AC.decreaseSpeed();
AC.decreaseSpeed();
 AC.decreaseSpeed();
 AC.decreaseSpeed();
  
  
System.out.println("Main ended");
}
}