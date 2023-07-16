class IceCreamTester{
	
public static void main(String test[]){
	
IceCream.addFlovors("vanilla");
IceCream.addFlovors("chocolate");
IceCream.addFlovors("butter pecan");
IceCream.addFlovors("strawbeery");
IceCream.getAllFlovorsNames();

boolean isUpdated = IceCream.updatedFlovorsNames("vanilla","blackcurrent");
System.out.println("Is flovors name is isUpdated" + isUpdated);
IceCream.getAllFlovorsNames();


boolean isDeleted = IceCream.deleteFlovorsNames("vanilla");
System.out.println("Is flovors name is is deleted" + isDeleted);
IceCream.getAllFlovorsNames();
}
}