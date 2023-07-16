class Factorial{
//5 = 120
//0!=1
public static int getFact(int factorialNumber){
int fact =1;
// for loop helps to increase the value
for(int f=1 ; f<= factorialNumber;f++){
fact = f*fact;
System.out.println(fact);
}
return fact;

}
}