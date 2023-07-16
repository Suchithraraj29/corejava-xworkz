class SupermarcketMethod3{
   // show 5 vegetables
     static String vegatable[]={"patato" , "carrot" , "beans" , "brinijal" ,"onion" } ;
		 // show biscuits
		 static String biscuits[]={"oreo" , "marigold" ,"fifty-fifty" , "chaskmask" , "parlegy" , "unibic" , "crack jack", "jimjam" };
       
		  //static String groceries1[]={"powder","cream","bodyloation","lipstic","nilpolish","dal","oil","coffepowde","bulb","sunfloweroil" };
      
		 
      public static void main(String market[]){
	  
	  System.out.println("Main started");
	  System.out.println("list of groceries");
	  System.out.println("list of groceriesare:");
	  getgroceriess();  
	   System.out.println("Main ended");
	  }
	 
	 // for
	       public static void getgroceriess(){
		   System.out.println("Inside getgroceriess");
		   for(String groceries:groceriess){
		   System.out.println(groceries);
		   }
	  }
	  }