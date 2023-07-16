class Garden{
	 static String flowerNames[]={null, null,null,null};
	static int index ;  
	 public static boolean addFlower(String flower){
		boolean isAdded = false ;
		
		if(flower != null){
		
		  flowerNames[index]  =flower; 
		  index++;
		  isAdded = true; 
			}else{
	 System.out.println (" cannot add flower, as it is a null value");			
	}
		return isAdded;
	}
	
	public static void getAllFlowerNames(){
 System.out.println(" Invoking getAllFlowerNames");
 
 for (int flower=0 ; flower< flowerNames.length; flower++){
 String reference = flowerNames[flower];
 System.out.println("access flower" + reference+ "at" + flower);
 
 }
 System.out.println (" end of getAllFlowerNames"); 
 }
public static boolean updatedFlowerNames(String existingFlowerNames, String updatedFlowerNames){
	boolean isUpdated = false;
	for(int flowerIndex=0 ; flowerIndex < flowerNames.length; flowerIndex++){
		if(flowerNames[flowerIndex].equals(existingFlowerNames)){
		flowerNames[flowerIndex]= updatedFlowerNames;
		isUpdated = true;
		
	}
}
return isUpdated;
}
public static int deleteGardenFlowerNames(String deletedFlowerName){
 System.out.println ("Invoking editGardenFlowerNames"); 
 System.out.println("No of parameters :2, type of parameters: String, String");
 boolean isDeleted = false;
 int flowerIndex ;
 int noOfElements = flowerNames.length;
 for (flowerIndex = 0 ; flowerIndex<flowerNames.length; flowerIndex++){
	 if (flowerNames[flowerIndex].equals(deletedFlowerName)){
		 System.out.println("flowerNames to be deleted is matched");
		 //(deletedFlowerNames)){
			 break;
		 }
	 }
	 if (flowerIndex<noOfElements){
		 noOfElements = noOfElements-1;
		 for(int newFlowerIndex = flowerIndex ;newFlowerIndex< noOfElements;newFlowerIndex++){
			 flowerNames[newFlowerIndex]=flowerNames[newFlowerIndex+1];
		 }
	 }
	 return noOfElements;
	 
 }
 public static void getAllFlowerNamespostDeletion(int newLength){
	 for(int flowerIndex = 0; flowerIndex<newLength; flowerIndex++){
		System.out.println(flowerNames[flowerIndex]); 
	 }
 }
public static String searchGardenFlowerByNames(String flowerName){
	System.out.println("Invoking getGardenFlowerByNames");
	System.out.println("No of parameter : 1, type String");
	String gName = null;
	for(String name : flowerNames){
		if(name.equals(flowerName)){
			gName = name;
			System.out.println("Flower name found");
		}
		
		}
		return gName;
	}
}


 
	
	

