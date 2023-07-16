class Speaker{
static String name= "JBI";
static int minVolume=;
static int currentVolume5;
static int maxVolume=30;
static boolean isConnected;
//method
public static boolean onOrOff(){	
System.out.println("Invoking onoroff()");
System.out.println("Parameter" +0);
// true==false
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
// increaseVolume
public static void increaseVolume(){
if(currentVolume < maxVolume){
     currentVolume = currentVolume+1;
	  System.out.println("the currentVolume is" + currentVolume);
}else{
System.out.println("MaxVolume reached");
}
}else{
	System.out.println("speaker coonect madu firstu");
}
}
// decreaseVolume
public static void decreaseVolume(){
	

}






}