class Modulus1
{
 public static void main(String modulus[]){
 
 mod(60,80);
 mod(12,8);
 mod(893,60);
 mod(90,70);
 mod(780,234);
 mod(789,70);
 mod(80,980);
 mod(10,1);
 mod(75,5);
 mod(756,863);
 
 mod(800,80,9);
 mod(11,8,7);
 mod(83,68,66);
 mod(900,90,8);
 mod(780,234,7);
 mod(78,70,88);
 mod(8000,980,75);
 mod(1000,11,14);
 mod(75,5,8);
 mod(756,86,99);
 }
 public static void mod(int c , int d) {
 System.out.println(c%d);
 }
 
 public static void mod(int c , int d , int e) {
 System.out.println(c%d%e);
 }
 
}