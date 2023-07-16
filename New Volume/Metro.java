class Metro{
	 static String stationNames[]={null, null,null,null,null,null,null};
	static int index ;  
	 public static boolean addStation(String station){
		boolean isAdded = false ;
		
		if(station != null){
		
		  stationNames[index]  =station; 
		  index++;
		  isAdded = true; 
			}else{
	 System.out.println (" cannot add station, as it is a null value");			
	}
		return isAdded;
	}
	
	public static void getAllStationNames(){
 System.out.println (" Invoking getAllStationNames");
 
 for (int station=0 ; station< stationNames.length; station++){
 String reference = stationNames[station];
 System.out.println("access station" + reference+ "at" + station);
 
 }
 System.out.println (" end of getAllStationNames"); 
 }
public static boolean updatedstationNames(String existingStationNames, String updatedStationNames){
	boolean isUpdated = false;
	for(int station Index=0 ; stationIndex < stationNames.length; stationIndex++){
		if(stationNames[station].equals(existingStationNames)){
		stationNames[station]= updated stationNames;
		isUpdated = true;
		
	}
}
return isUpdated;
}
}