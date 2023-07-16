class Speakers1{
static String name= "JBI";
static int minVolume;
static int currentVolume;
static int maxVolume=30;
static boolean isConnected;

// method
public static int (){	
System.out.println("Invoking minVolume");
System.out.println("Parameter" +0);
if(isConnected == false){
	isConnected = true;
	System.out.println(" Speaker is minVolume");
 }else if(isConnected == true){
 isConnected = false;
 System.out.println(" Speaker is maxVolume ");
 }
 return isConnected;
}
}


