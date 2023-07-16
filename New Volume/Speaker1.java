class Speaker1{
static String name= "JBL";
static int minVolume;
static int currentVolume;
static int maxVolume=30;
static boolean isConnected;
//method
public static boolean onOrOff(){	
System.out.println("Invoking onoroff()");
System.out.println("Parameter" + 0);
// true==false
if(isConnected == false){
	isConnected = true;
	System.out.println(" Speaker is turned onn.. Enjoyy");
 }
 else if(isConnected == true){
 isConnected = false;
 System.out.println(" Speaker is turned off.. ");
 }
 // return is optional
 return isConnected;
}
// increaseVolume
public static void increaseVolume(){
System.out.println("Invoking increaseVolume");
System.out.println("List of parameter" + 2);
if(isConnected == true){
	if(currentVolume<maxVolume){
	currentVolume = currentVolume + 1;
	System.out.println(" The currentvolume is " +currentVolume );
	}else{
	System.out.println(" Max volume reached");
	}
	}else{
	System.out.println(" Speaker not connected");
	}
 System.out.println(" End of increaseVolume");
 }
// decreaseVolume
public static void decreaseVolume(){
System.out.println("Invoking decreaseVolume");
System.out.println("List of parameter" + 0);
if(isConnected == true){
	if(currentVolume<minVolume){
	currentVolume = currentVolume - 1;
	System.out.println(" The currentVolume is " + currentVolume );
	}else{
	System.out.println(" Min volume reached");
	}
	}else{
	System.out.println(" Speaker not connected");
	}
 System.out.println(" End of decreaseVolume");
 }

}






