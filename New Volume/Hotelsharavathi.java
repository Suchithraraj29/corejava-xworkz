class Hotelsharavthi{
public static void main(String hotel[]){
System.out.println("Main started");
String foodMenus[]={"Biryani","Pizza","burger","chicken kabab","mutton beryani","veg palav"};

double priceoffoodmenus[] ={500.00,40.00,750.00,150.89,80.60,450.30};

 System.out.println(foodMenus[0] +" "+ foodMenus[1]);
 System.out.println ("list of foodMenus are: ");
for(int index=0; index<foodMenus.length; index++){
System.out.println(foodMenus[index]);       
}
System.out.println("list od foodMenus are:");
// foreach
for(String foodMenu : foodMenus){
System.out.println(foodMenus);
}
  for (double foodMenu : priceoffoodmenus){
  System.out.println(foodMenus);
  }
  
System.out.println("Main ended");
}
} 
	   
	   



