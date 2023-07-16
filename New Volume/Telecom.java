class Telecom{
	 static String simNames[]={null, null,null,null};
	static int index ;  
	 public static boolean addsim(String sim){
		boolean isAdded = false ;
		
		if(sim != null){
		
		  simNames[index]  =sim; 
		  index++;
		  isAdded = true; 
			}else{
	 System.out.println (" cannot add sim, as it is a null value");			
	}
		return isAdded;
	}
	
	public static void getAllSimNames(){
 System.out.println (" Invoking getAllsimNames");
 
 for (int sim=0 ; sim< simNames.length; sim++){
 String reference = simNames[sim];
 System.out.println("access sim" + reference+ "at" + sim);
 
 }
 System.out.println (" end of getAllsimNames"); 
 }
public static boolean updateSimNames(String existingSimName, String updatedSimNames){
	boolean isUpdated = false;
	for(int simIndex=0 ; simIndex < simNames.length; simIndex++){
		if(simNames[simIndex].equals(existingSimName)){
		simNames[simIndex]= updatedSimNames;
		isUpdated = true;
		
	}
}
return isUpdated;
}
public static deleteSimNames(String deletesimNames){
	System.out.println(" Invoking editsimNames");
	System.out.println(No of parameters : 2 , type of parameter : String,String");
	boolean isDeleted = false;
	int itemIndex ;
	int noOfElements = simNames.length;
	for (itemIndex=0 ; itemIndex < simNames.length ; itemIndex++)){
		if(simNames[itemIndex]).equals(deleteSimNames)){
			break;
		}	
	    }
		if (itemIndex<noOfElements){
			noOfElements =noOfElements-1;
			for(int  =newSimNames )
		}
}
