class Karanataka{
	// array has limitation - size is fixed
	 static String cityNames[]={null, null,null,null,null,null,null,null,null,null};
	static int index ;  
	
	// after intializing cannot modify the data size in arry
	// it's not dyanmic
	// it's fixed in size// the data gone be add is fixed
	// curd operation
// once the intializing cannot modify the data	
	 public static boolean addCityNames(String city){
		boolean isAdded = false ;
		// validage cityNames
		if(cityNames.length > index){
		if(cityNames != null && cityNames.length() > 0 ){
		
		  cityNames[index]  =cityNames; 
		  index++;
		  // never ever break the code
		  isAdded = true;	
System.out.println("city Added" + isAdded);		  
			}else{
	 System.out.println (" city can not be null");			
	}
	{else}
	System.out.println (" Size is full , cannot add city anymore");		
	}
		return isAdded;
	}
	
	public static void getAllCityNames(){
 System.out.println (" Invoking getAllCityNames");
 
 for (int city=0 ; city < cityNames.length; city++){
 String reference = cityNames[city];
 System.out.println("access city" + reference+ "at" + city);
 
 }
 System.out.println (" end of getAllCityNames "); 
 }
}