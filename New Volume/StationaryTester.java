class StationaryTester{
public static void main (String tester[]){
	// create , save , add 
// add operation is a method in avaliavle in string
   
Stationary.addStationaryItems("Books");
Stationary.addStationaryItems("pencil");
Stationary.addStationaryItems("pen");
Stationary.addStationaryItems("eraser");
Stationary.addStationaryItems("Sketchpens");
Stationary.addStationaryItems("Ink pen");
Stationary.addStationaryItems("safetypin");
Stationary.addStationaryItems("charts");


// read , get , fetch
Stationary.getAllStationaryItems();

//update , edit operation
Stationary.editStationaryItemName("CardBoard shhets" , "safetypin");

Stationary.getAllStationaryItems();

int newLength = Stationary.deleteStationaryItems("Ink pen");
System.out.println("calling getAllStationaryItemspostDeletion ");

  Stationary.getAllStationaryItemspostDeletion(newLength);
}
}
// dlt for loop and if is required	