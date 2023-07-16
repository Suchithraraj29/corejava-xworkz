class SupermarcketMethod{
   // show 5 vegetables
     static String vegatables[]={"patato" , "carrot" , "beans" , "brinijal" ,"onion" } ;
		 // show biscuits
		 static String biscuits[]={"oreo" , "marigold" ,"fifty-fifty" , "chaskmask" , "parlegy" , "unibic" , "crack jack", "jimjam" };
       
		 // show perfumes
		  static String perfumes[] ={"fog" , "spinge" , "evva" , "sandal","laayer shot", "pocket perfume" ,"axe" , "water girl", "yadely","engage" }; 
		 // show 10 groceries
		 
		  static String groceries[]={"powder","cream","bodyloation","lipstic","nilpolish","dal","oil","coffepowde","bulb","sunfloweroil" };
      
		 
      public static void main(String market[]){
	  
	  System.out.println("Main started");
	  System.out.println("list of vegetables");
	  System.out.println("list of perfumes are:");
	  getperfumes();  
	   System.out.println("Main ended");
	  }
	 
	 // for
	       public static void getperfumes(){
		   System.out.println("Inside getperfumes");
		   for(String perfume:perfumes){
		   System.out.println(perfume);
		   }
	  }
	  }
	 