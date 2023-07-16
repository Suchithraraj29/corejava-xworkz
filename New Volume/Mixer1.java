class Mixer{
static String name= "Bluestar";
static int minSpeed;
static int currentSpeed;
static int maxSpeed=30;
static boolean isConnected;
//method
public static boolean onOrOff(){	
System.out.println("Invoking onoroff()");
System.out.println("Parameter" + 0);
// true==false
if(isConnected == false){
	isConnected = true;
	System.out.println("Mixer  is turned onn");
 }
 else if(isConnected == true){
 isConnected = false;
 System.out.println(" Mixer is turned off.. ");
 }
 // return is optional
 return isConnected;
}
// increaseVolume
public static void increaseSpeed(){
System.out.println("Invoking increaseSpeed");
System.out.println("List of parameter" + 2);
if(isConnected == true){
	if(currentVolume<maxVolume){
	currentSpeed = currentSpeed + 1;
	System.out.println(" The currentSpeed is " +currentSpeed );
	}else{
	System.out.println(" Increase speed is reached");
	}
	}else{
	System.out.println(" Mixer not connected");
	}
 System.out.println(" End of increaseSpeed");
 }
// decreaseVolume
public static void decreaseSpeed(){
System.out.println("Invoking decreaseSpeed");
System.out.println("List of parameter" + 0);
if(isConnected == true){
	if(currentSpeed<minSpeed){
	currentSpeed = currentSpeed - 1;
	System.out.println(" The currentSpeed is " + currentSpeed );
	}else{
	System.out.println(" Min volume reached");
	}
	}else{
	System.out.println(" Mi not connected");
	}
 System.out.println(" End of decreaseSpeed");
 }

}
