class TravelAgency{
	 static String touristPlaces[]={null, null,null,null,null,null,null,null};
	static int index ;  
	 public static boolean addTourist(String tourist){
		boolean isAdded = false ;
		
		if(tourist != null){
		
		  touristPlaces[index]  =tourist; 
		  index++;
		  isAdded = true; 
			}else{
	 System.out.println (" cannot add tourist, as it is a null value");			
	}
		return isAdded;
	}
	
	public static void getAllTouristPlaces(){
 System.out.println (" Invoking getAllTouristPlaces ");
 
 for (int tourist=0 ; tourist< touristPlaces.length; tourist++){
 String reference = touristPlaces[tourist];
 System.out.println("access tourist" + reference+ "at" + tourist);
 
 }
 System.out.println (" end of getAllTouristPlaces"); 
 }
}