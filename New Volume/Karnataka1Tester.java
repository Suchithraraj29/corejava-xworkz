class Karnataka1Tester{
	
public static void main(String test[]){
	
Karnataka1.addCityNames("Mandya");
Karnataka1.addCityNames("mysore");
Karnataka1.addCityNames("banglore");
Karnataka1.addCityNames("bagalkote");
Karnataka1.addCityNames("udupi");
Karnataka1.addCityNames("shakelshpura");
Karnataka1.addCityNames("tumkur");
Karnataka1.addCityNames("chickmanglore");
Karnataka1.addCityNames("hubahalli");
Karnataka1.addCityNames("hassan");

Karnataka1.getAllCityNames();

// CRUD

//Karanataka.updateCityNmaes("Bangalore","Bengaluru)
boolean isUpdated = Karnataka1.updateCityName("banglore","bengaluru");
System.out.println("Is city name is isUpdated" + isUpdated);
Karnataka1.getAllCityNames();
}
}

  