class Speaker1Tester{

public static void main (String test[]){

System.out.println("Main started");
// click on the button
//Speaker.name="";
 boolean connected = Speaker1.onOrOff();
 System.out.println("Is speaker connected"+ connected);
 Speaker1.increaseVolume();
 Speaker1.increaseVolume();
 Speaker1.increaseVolume();
 Speaker1.increaseVolume();
 
 Speaker1.decreaseVolume();
 Speaker1.decreaseVolume();
 Speaker1.decreaseVolume();
 Speaker1.decreaseVolume();
 
 boolean connected1 = Speaker1.onOrOff();
  System.out.println("Is speaker connected1"+ connected1);
  Speaker1.increaseVolume();
  Speaker1.increaseVolume();
  Speaker1.increaseVolume();
  Speaker1.increaseVolume();

  Speaker1.decreaseVolume();
 Speaker1.decreaseVolume();
 Speaker1.decreaseVolume();
 Speaker1.decreaseVolume();
 
  
System.out.println("Main ended");
}
}