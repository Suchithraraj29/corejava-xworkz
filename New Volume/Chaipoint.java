class Chaipoint{
	
 String location = "mandya";
 static String tea = "Masala tea";
 static String tea1 = "ginger tea";
 static String tea2 = "lemon tea";
 static String tea3 = "elaichi tea";
 static String  tea4 = " noon chai";
 static String tea5 = "iran chai";
 static String tea6= "assam tea";
 static String tea7 = "adrak chai";
 static String tea8 = "nilgiri tea";
 static String tea9 = "loose leaf chai";
 static String tea10 = "mint chai";
 static String chaiAvailable[] = { tea , tea1 , tea2 , tea3, tea4,tea5,tea6,tea7,tea8,tea9,tea10};
 // method
 public static void getAllChaiAvailable(){
 System.out.println (" Invoking getAllChaiAvailable");
 // for (String individualChai : chaiAvailable){
	 //System.out.println (individualChai);
 }
 
 for (int chai=0 ; chai< chaiAvailable.length; chai++){
 String reference = chaiAvailable[chai];
 System.out.println(reference);
 }
 System.out.println (" end of getAllChaiAvailable");
 
 
 
 
 }
}