//update  - get the data from array
//update - get and add (combination)
//inside method ,if,for
//read the data from array for will come into the concept
//more than one data will be added 
  class Stationary{
 static String stationaryItems [] = {null,null,null,null,null,null,null,null};
 //ARRYA size fixed can't changed
 int index =0;
 
 // create or add or get operation
 
 public static boolean addStationaryItems(Stringitemes){
 System.out.println("Invoking addStationaryItems");
 System.out.println(" NO of parameters : 1, type of parameter : String");
 boolean isAdded = false ;
 
 // validating the data
 
 if(itemName ! = null){
 if(index >stationaryItems.length ){
                  stationaryItems[index++] = itemName;
				  isAdded = true;
 
 }else{
 System.out.println("ohh elli jaga illa");
 }
}else{
 System.out.println("itemNmae can't be null");
 }
 retrun isAdded;
 // loacal variable must intialize 
 }
 public static void getAllStationaryItems(){
	System.out.println("list of can't be null"); 
	for (String )
	

System.out.println(itemName);
	
 }
 }
 //  update similar structure 
 // to dlt one parameter 
public static boolean editStationaryItemName(String updatedItems , String existingItems){
System.out.println("Invoking editStationaryItems");
	System.out.println("no of parameters : 2, type of parameter : String , String ");
	for (int itemIndex = 0 ; itemIndex < stationaryItems.lengtth);
	itemIndex++){
		
		// dlt the data
		// itterate the data
		// eqal method of string
		// equal return tyoe is boolean
		// write method name
		// stationaryItems[0]
		if (stationaryItems[itemIndex].equals(existingItemsName)){
			stationaryItems[itemIndex] = updatedItemName ;
			isUpdated = true;
		}
		// update intialize imp	
		}
		retrun isUpdated;
	}
	}
	
	
	public static int deleteStationaryItemName(String deleteItemName) {
		System.out.println("Invoking editStationaryItems");
	System.out.println("no of parameters : 2, type of parameter : String , String ");
	boolean isDeleted = false;
	int itemIndex;
	
	//if(itemIndex < noOfElements){
	int noOfElements = stationaryItems.length; 
	for(int itemIndex = 0 ; itemIndex <stationaryItems.length ; itemIndex++){
		// 1st for loop we used
		// "books".equals("books")
		// if (stationaryItems[itemIndex]).equals(deleteItemName)){
	if (stationaryItems[itemIndex]).equals(deleteItemName)){
		//System.out.println(" getting out of for as item name is matched ");
	// TO JUST THE flop the data
		break;		
	}		
	//System.out.println(" out of for ");
	}
	if (itemIndex < noOfElements){
	noOfElements= noOfElements-1;
	for ( int newItemInedx= itemIndex; newItemInedx< noOfElements ; newItemInedx++){
	// logic to remove deleted data from the array
	    stationaryItems[newItemInedx]=stationaryItems[newItemInedx+1];
	}
	System.out.println(" noOfElements ");
	return noOfElements ;
	}
	// dlt operation
	// dlt an array 2 for loop is used
	// 
	public static void getAllStationaryItemspostDeletion(int newLength){
		
		
		for (int itemIndex = 0 ; itemIndex < newlength ; itemIndex++){
			
			//int newLength = Stationary.deleteStationaryItemName("ink pen")
			System.out.println(stationaryItems[itemIndex]);
			
		}
	}
	}
	

