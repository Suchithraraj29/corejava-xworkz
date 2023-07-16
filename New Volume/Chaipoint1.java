class Chaipoint1{
	 static String chaiAvailable[]={null, null,null,null};
	static int index ; 
	// adds tea into chaiAvailable
	// data always stored in index value 
	 public static boolean addChai(String chai){
		boolean isAdded = false ;
		// masala tea != null
		// create operation 
		if(chai != null){
		//    chaiAvailable[0] =" masala tea" ;
		// chaiAvailable[1] = "gingger tea";
		// chaiAvailable[2]= "lemon tea";
		
		  chaiAvailable[index]  =chai; 
		  // index++;
		  index++;
		  isAdded = true; 
			}else{
	 System.out.println (" cannot add chai, as it is a null value");	
			
	}
		return isAdded;
	}
	
	//method
	
	public static void getAllChaiAvailable(){
 System.out.println (" Invoking getAllChaiAvailable");
 
 // for (String individualChai : chaiAvailable){
	 //System.out.println (individualChai);
 
 for (int chai=0 ; chai< chaiAvailable.length; chai++){
 String reference = chaiAvailable[chai];
 System.out.println("access chai" + reference+ "at" + chai);
 
 }
 System.out.println (" end of getAllChaiAvailable");
 
 
 
 
 
 }
}