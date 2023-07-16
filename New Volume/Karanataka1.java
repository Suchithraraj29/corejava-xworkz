class Karnataka1{
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
		//if(cityNames.length > index){
			
		if(city != null){
		//&& cityNames.length() > 0 )
		  cityNames[index]  =city; 
		  index++;
		  // never ever break the code
		  isAdded = true;
		  }else{
              System.out.println("can't add city name,as it is a null value");
		  }			  
			
		return isAdded;
	}
	
	public static void getAllCityNames(){
 System.out.println (" Invoking getAllCityNames");
 
 for (int city=0 ; city < cityNames.length; city++){
 String reference = cityNames[city];
 System.out.println("the list of city names in karnataka" + reference+ "at" + city);
 
 }
 System.out.println (" end of getAllCityNames "); 
 }
	 }
 // update method
 // adding 1 parameter need
 // update 2 parameter need
 // array the fetching data for loop is used
 // mandya is 0th index
 //1city name is update using IF condition
 // last itteration 
 // insude city name updateCityName
 // assing to cityNames
 // not go with the arraya data in update 
 
 public static boolean updateCityName(String existingCityName , String updatedCityName ){
	 boolean isUpdated = false;
	 // it will update the array data in outside 
	 for(int cityIndex = 0 ; cityIndex <cityNames.length; cityIndex++){
	// for(String cityNames : cityNames){
		 // udupi == "banglore"
		 // the reason is==
		 // compare the existingdata and new data
		// if (cityNames.equals( existingCityName){
			// the control of program is forwaed direction
		if( cityNames[cityIndex].equals(existingCityName)){
			 cityNames[cityIndex] = updatedCityName;
			 isUpdated = true;
			 
		 }
	 }
	 return isUpdated ;
 }
 