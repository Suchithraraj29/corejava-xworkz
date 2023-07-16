class Supermarcketmethods{
   // show 5 vegetables
     static String vegetables[]={"patato" , "carrot" , "beans" , "brinijal" ,"onion" } ;
		 // show biscuits
		 static String biscuites[]={"oreo" , "marigold" ,"fifty-fifty" , "chaskmask" , "parlegy" , "unibic" , "crack jack", "jimjam" };
       
		 // show perfumes
		  static String perfumes[] ={"fog" , "spinge" , "evva" , "sandal","laayer shot", "pocket perfume" ,"axe" , "water girl", "yadely","engage" }; 
		 // show 10 groceries
		 
		  static String groceries[]={"powder","cream","bodyloation","lipstic","nilpolish","dal","oil","coffepowde","bulb","sunfloweroil" };
      
		public static void main (String marcket[]){
			 System.out.println("Main started");
			 // using array n for
			 System.out.println("list of vegetables are:");
			 getvegetables();
			 getbiscuites();
			 getperfumes();
			 getgroceries();
			 System.out.println("Main ended"); 
		}
         
				public static void getvegetables(){
		   System.out.println("Inside getvegetables");
		   for(String vegetable:vegetables){
		   System.out.println(vegetable);
	  }
}
	 
	 // 
	       public static void getperfumes(){   
		   System.out.println("Inside getperfumes");
		   for(String perfume:perfumes){
		   System.out.println(perfume);
		   }
	  }
	  	  
	 // groceries
	 // read- get , fetch , read
	       public static void getgroceries(){
		   System.out.println("Inside getgroceries");
		   for(String grocerie:groceries){
		   System.out.println(grocerie);
		   
		   }
	  }
	  
	  // biscuit
	 // read- get , fetch, read 
   
	       public static void getbiscuites(){
		   System.out.println("Inside getbiscuites");
		   for(String biscuite:biscuites){
		   System.out.println(biscuite);
		   
		   }
		   }
}
	  