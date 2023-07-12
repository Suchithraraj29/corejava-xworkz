class GardenTester{
	
public static void main(String test[]){
// create, save, add	
Garden.addFlower("lily");
Garden.addFlower("rose");
Garden.addFlower("daffodil");
Garden.addFlower("iris");

//read,get,fetch
Garden.getAllFlowerNames();

String flowerNames = Garden.searchGardenFlowerByNames("rose");
System.out.println(" the searched flower names " + flowerNames);

//update ,edit 
Garden.updatedFlowerNames("lily","sunflower");

Garden.getAllFlowerNames();

int newLength = Garden.deleteGardenFlowerNames("iris");
System.out.println("Callimg getAllFlowerNamespostDeletion");
Garden.getAllFlowerNamespostDeletion(newLength);

//boolean isUpdated = Garden.updatedFlowerNames("lily","sunflower");
//System.out.println("Is flower name is isUpdated" + isUpdated);
//Garden.getAllFlowerNames();
}
}
