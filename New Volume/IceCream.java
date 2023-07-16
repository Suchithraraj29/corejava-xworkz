class IceCream{
	 static String flovorsNames[]={null, null,null,null};
	static int index ;  
	 public static boolean addFlovors(String flovors){
		boolean isAdded = false ;
		
		if(flovors != null){
		
		  flovorsNames[index]  =flovors; 
		  index++;
		  isAdded = true; 
			}else{
	 System.out.println (" cannot add flovors, as it is a null value");			
	}
		return isAdded;
	}
	
	public static void getAllFlovorsNames(){
 System.out.println (" Invoking getAllFlovorsNames ");
 
 for (int flovors=0 ; flovors< flovorsNames.length; flovors++){
 String reference = flovorsNames[flovors];
 System.out.println("access flovors" + reference+ "at" + flovors);
 
 }
 System.out.println (" end of getAllFlovorsNames "); 
 }
public static boolean updatedFlovorsNames(String existingFlovorsNames, String updatedFlovorsNames){
	boolean isUpdated = false;
	for(int flovorsIndex=0 ; flovorsIndex < flovorsNames.length; flovorsIndex++){
		if(flovorsNames[flovorsindex].equals(existingFlovorsNames)){
		flovorsNames[flovorsindex]= updatedflovorsNames;
		isUpdated = true;
		
	}
}
return isUpdated;
}
public static boolean deleteFlovorsNames(String deleteFlovorsNames){
	for(int flovorsIndex=0 ; flovorsIndex < flovorsNames.length; flovorsIndex++){
		if(flovorsNames[flovorsindex].equals(deletedFlovorsNames)){
		flovorsNames[flovorsindex]= deletedflovorsNames;
		isUpdated = true;
	
}
}
return isDeleted
}
}