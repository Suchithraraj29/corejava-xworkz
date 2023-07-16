class Addition1 
{

 public static void main(String addition[]){

 add(56,78);
 add(112,456);
 add(89,67);
 add(678,890);
 add(780,234);
 add(690,90);
 add(800,80);
 add(10,90);
 add(908,809);
 add(756,863);
 //method overloading
 
 add(56,78,34);
 add(112,456,67);
 add(89,67,78);
 add(678,890,90);
 add(780,234,800);
 add(690,900,89);
 add(800,980,901);
 add(1000,90,78);
 add(908,809,863);
 add(756,863,72);
 }
 
 public static void add(int z , int u) {     
 System.out.println(z+u);
 }
 public static void add(int z , int u , int y) {     
 System.out.println(z+u+y);
 }
}