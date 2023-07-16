class MedicalStore{
	 static String medicineNames[]={null, null,null,null,null,null,null,null,null};
	static int index ;  
	 public static boolean addMedicine(String medicine){
		boolean isAdded = false ;
		
		if(medicine != null){
		
		  medicineNames[index]  =medicine; 
		  index++;
		  isAdded = true; 
			}else{
	 System.out.println (" cannot add medicine, as it is a null value");			
	}
		return isAdded;
	}
	
	public static void getAllMedicineNames(){
 System.out.println (" Invoking getAllMedicineNames");
 
 for (int medicine=0 ; medicine< medicineNames.length; medicine++){
 String reference = medicineNames[medicine];
 System.out.println("access medicine" + reference+ "at" + medicine);
 
 }
 System.out.println (" end of getAllMedicineNames"); 
 }
}