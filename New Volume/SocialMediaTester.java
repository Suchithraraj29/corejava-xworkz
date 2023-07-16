 class SocialMediaTester{
	public static void main(String args[]){
		String password = "@ewrw123";
		boolean isLogin = SocialMedia.login(password);
		System.out.println("The entered password is" + isLogin);
		
		long  phno = 98474 ;
		String name = "suchi";
		boolean isLogin1 = SocialMedia.login(phno, name);
		System.out.println("The entered phone number is" +isLogin1);
		System.out.println("The entered name is" +name); 
		 
	
	}



}