class TelecomTester{
	
public static void main(String test[]){
	
Telecom.addsim("bSNL");
Telecom.addsim("Airtel");
Telecom.addsim("Reliance");
Telecom.addsim("Vodafone Ides");

Telecom.getAllSimNames();

boolean isUpdated = Telecom.updateSimNames("bSNL","idea");
System.out.println("Is sim name is isUpdated" + isUpdated);
Telecom.getAllSimNames();
}
}
