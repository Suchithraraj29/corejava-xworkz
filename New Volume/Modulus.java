class Modulus{

public static void main(String modulus[]){

mod(332 , 75);
mod(252 , 22);
mod(961 , 24);
mod(722 , 32);
mod(108 , 32);
mod(719 , 46);
mod(112 , 12);
mod(964 , 28);
mod(135 , 65);
mod(162 , 38);

mod(3321 ,852, 32 );
mod(1432 ,110, 41);
mod(2140 ,205, 73);
mod(1644 ,218, 82);
mod(1085 ,123, 62);
mod(1935 ,165, 83);
mod(1124 ,136, 52);
mod(9643 ,129, 67);
mod(5171 ,196, 42);
mod(1525 ,843, 92);


}

public static void mod(int s , int x){
System.out.println(s%x);
}

public static void mod(int s , int x, int a){
System.out.println(s%x%a);
}


}