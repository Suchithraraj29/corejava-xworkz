class Speakers{
static String name= "JBI";
static int minVolume=12;
static int currentVolume=5;
static int maxVolume=30;
static boolean isConnected;

// method
public static boolean onOrOff(){	
System.out.println("Invoking onoroff");
System.out.println("Parameter" +0);
// false==false
if(isConnected == false){
	isConnected = true;
	System.out.println(" Speaker is turned onn.. Enjoyy");
 }else if(isConnected == true){
 isConnected = false;
 System.out.println(" Speaker is turned off.. ");
 }
 // return is optional
 return isConnected;
}
}
