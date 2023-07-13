class Zomato{
public static double search(String foodName){
if("pizza" == foodName){
System.out.println("Search food name is "+foodName);
return 99;
}
if("biryani" == foodName){
System.out.println("search food name is "+foodName);
return 250.00;
}
if("burger" == foodName){
System.out.println("search food name is "+foodName);
return 150.00;
}
if("donut" == foodName){
System.out.println("search food name is "+foodName);
return 120.00;
}
if("noodles" == foodName){
System.out.println("search food name is "+foodName);
return 100;}
if("gobi chilly" == foodName){
System.out.println("search food name is "+foodName);
return 100.00;
}
if("tandoori" == foodName){
System.out.println("search food name is "+foodName);
return 250.00;}
if("dosa" == foodName){
System.out.println("search food name is "+foodName);
return 50;
}
if("chicken friedrice" ==foodName){
System.out.println("search food name is "+foodName);
return 200;
}
if("babycorn chilly" == foodName){
System.out.println("search food name is "+foodName);
return 150;}
if("pasteries" == foodName){
System.out.println("search food name is "+foodName);
return 120;}
if("roticurry" == foodName){
System.out.println("search food name is "+foodName);
return 70;}
if("coldcoffee" == foodName){
System.out.println("search food name is "+foodName);
return 100;}
if("roll" == foodName){
System.out.println("search food name is "+foodName);
return 110;}
if("chilly momos"== foodName){
System.out.println("search food name is "+foodName);
return 90;}
if("Momos" == foodName){
System.out.println("search food name is "+foodName);
return 50;}
return 0.0;
}

public static double search(String foodName,int quantity){
if("pizza" == foodName){
System.out.println("Search food name is "+foodName);
return 99*quantity;
}
if("biryani" == foodName){
System.out.println("search food name is "+foodName);
return 250.00*quantity;
}
if("burger" == foodName){
System.out.println("search food name is "+foodName);
return 150.00*quantity;
}
if("donut" == foodName){
System.out.println("search food name is "+foodName);
return 120.00*quantity;
}
if("noodles" == foodName){
System.out.println("search food name is "+foodName);
return 100.00*quantity;}
if("gobi chilly" == foodName){
System.out.println("search food name is "+foodName);
return 100.00*quantity;
}
if("tandoori" == foodName){
System.out.println("search food name is "+foodName);
return 250.00*quantity;}
if("dosa" == foodName){
System.out.println("search food name is "+foodName);
return 50*quantity;
}
if("chicken friedrice" ==foodName){
System.out.println("search food name is "+foodName);
return 200*quantity;
}
if("babycorn chilly" == foodName){
System.out.println("search food name is "+foodName);
return 150*quantity;}
if("pasteries" == foodName){
System.out.println("search food name is "+foodName);
return 120*quantity;}
if("roticurry" == foodName){
System.out.println("search food name is "+foodName);
return 70*quantity;}
if("coldcoffee" == foodName){
System.out.println("search food name is "+foodName);
return 100*quantity;}
if("roll" == foodName){
System.out.println("search food name is "+foodName);
return 110*quantity;}
if("chilly momos"== foodName){
System.out.println("search food name is "+foodName);
return 90*quantity;}
if("Momos" == foodName){
System.out.println("search food name is "+foodName);
return 50*quantity;}
return 0.0;
}
}