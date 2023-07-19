class Girias1{
 
public static void main(String girias[]){
System.out.println("Main started");
String electronicDevices[]={"referigirator","washingmachine","dishwasher","led","ironbox",
 "ac","microwave","telivisin"};
 
 // variable ED
 double priceofElectronicDevices[] ={50000.00,40000.00,75000.00,15000.89,8000.60,45000.70,0.0,6000.45};
 System.out.println(electronicDevice[0] +" "+ electronicDevices[1]);
 System.out.println ("list of electronicDevices are: ");
 
 // 0<8
 // every array own have own loop
for(int index=0; index<electronicDevices.length; ){
System.out.println ( electronicDevices[index]);
       index++;

}
//  ed is the String arry type 
// ed is the array variable 
// intialization is happing interanally
// sop is used bcz to get the data
// colon is take care of everything in the program
//so that's why there is no nescetity to in everystep increement or decremment or intialization
// 
System.out.println("list ofelectronicDevice are:");
// foreach
for(String electronicDevice : electronicDevices){
System.out.println(electronicDevice);
}
  for (double priceOfElectronicDevice : priceofElectronicDevices){
  System.out.println(electronicDevice);
  }
  
System.out.println("Main ended");
}
} 