class Karnataka3Tester{
     public static void main(String karnataka[]){
	 
     	 
	 Karnataka3.addCity("Bangalore");
	 Karnataka3.addCity("Mysore");
	 Karnataka3.addCity("Hassan");
	 Karnataka3.addCity("Kolar");
	 Karnataka3.addCity("Ramnagar");
	 Karnataka3.addCity("Mandya");
	 Karnataka3.getAllCityNames();
	 boolean isUpdated = Karnataka3.updateCityName("Bangalore","Bengaluru");  
     System.out.println("Is city name updated "+isUpdated);	 
     Karnataka3.getAllCityNames();
	 }
}