class SocialMedia{
	
	
	public static boolean login(String password){
		boolean isLogin = true;
		if(isLogin && password.equals("@ewrw") ){
			System.out.println("Logged in successfully!");
			return true;
			
		}else  {
			System.out.println("Invalid Password");
			return false;
		}
		
	
	} 
	public static boolean login(long phno,String name){
		boolean isLogin = true;
		if(isLogin && phno==98474 && name == "suchi"){
			System.out.println("Phone number registerd successfully!");
			return true;
			
		}else {
			System.out.println("Invalid Phone number");
			return false;
		}
		
	
	} 
	


}
