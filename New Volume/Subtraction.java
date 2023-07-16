class Subtraction{
public static void main (String Subtraction[]){
 sub(56,78);
 sub(112,456);
 sub(89,67);
 sub(678,890);
 sub(780,234);
 sub(690,900);
 sub(800,980);
 sub(1000,90);java
 sub(908,809);
 sub(756,863);
 //method overloading
 
 sub(56,78,34);
 sub(112,456,67);
 sub(89,67,78);
 sub(678,890,90);
 sub(780,234,800);
 sub(690,900,89);
 sub(800,980,901);
 sub(1000,90,78);
 sub(908,809,863);
 sub(756,863,72);
 }
 public static void sub(int x , int y ){
 System.out.println(x-y);
 
  }
  public static void sub(int x , int y , int z) {     
 System.out.println(x-y-z);
 }


}