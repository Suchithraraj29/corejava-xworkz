class Dominos1{
public static double search(String foodName){
if("farmhouse" == foodName){
System.out.println("Search food name is "+foodName);
return 450;
}
if("peppy panner" == foodName){
System.out.println("search food name is "+foodName);
return 400;
}
if("margharita" == foodName){
System.out.println("search food name is "+foodName);
return 230;
}
if("tandoori paneer" == foodName){
System.out.println("search food name is "+foodName);
return 550.00;
}
if("gourmet pizza" == foodName){
System.out.println("search food name is "+foodName);
return 700;}
if("veg pizza" == foodName){
System.out.println("search food name is "+foodName);
return 250;
}
if("paratha pizza" == foodName){
System.out.println("search food name is "+foodName);
return 250.00;}
if("pasta pizza" == foodName){
System.out.println("search food name is "+foodName);
return 330;
}
if("cheese & corn" ==foodName){
System.out.println("search food name is "+foodName);
return 259;
}
if("paneer paratha pizza" == foodName){
System.out.println("search food name is "+foodName);
return 300;}
if("mushroom pizza" == foodName){
System.out.println("search food name is "+foodName);
return 180;}
if("mexican pizza" == foodName){
System.out.println("search food name is "+foodName);
return 400;}
if("delux pizza" == foodName){
System.out.println("search food name is "+foodName);
return 650;}
if("tomato pizza" == foodName){
System.out.println("search food name is "+foodName);
return 200;}
if(" sausage pizza"== foodName){
System.out.println("search food name is "+foodName);
return 300;}
if("chicken pepperoni" == foodName){
System.out.println("search food name is "+foodName);
return 450;}
if("indi chicken" == foodName){
System.out.println("search food name is "+foodName);
return 600;}
if("loaded non veg" == foodName){
System.out.println("search food name is "+foodName);
return 150;}
if("double chicken" == foodName){
System.out.println("search food name is "+foodName);
return 800;}
if("feast pizza" == foodName){
System.out.println("search food name is "+foodName);
return 600;
}
return 0.0;
}

public static double search(String foodName,int quantity){
if("farmhouse" == foodName){
System.out.println("Search food name is "+foodName);
return 450*quantity;
}
if("peppy panner" == foodName){
System.out.println("search food name is "+foodName);
return 400*quantity;
}
if("margharita" == foodName){
System.out.println("search food name is "+foodName);
return 230*quantity;
}
if("tandoori paneer" == foodName){
System.out.println("search food name is "+foodName);
return 550.00*quantity;
}
if("gourmet pizza" == foodName){
System.out.println("search food name is "+foodName);
return 700*quantity;}
if("veg pizza" == foodName){
System.out.println("search food name is "+foodName);
return 250*quantity;
}
if("paratha pizza" == foodName){
System.out.println("search food name is "+foodName);
return 250.00*quantity;}
if("pasta pizza" == foodName){
System.out.println("search food name is "+foodName);
return 330*quantity;
}
if("cheese & corn" ==foodName){
System.out.println("search food name is "+foodName);
return 259*quantity;
}
if("paneer paratha pizza" == foodName){
System.out.println("search food name is "+foodName);
return 300*quantity;}
if("mushroom pizza" == foodName){
System.out.println("search food name is "+foodName);
return 180*quantity;}
if("mexican pizza" == foodName){
System.out.println("search food name is "+foodName);
return 400*quantity;}
if("delux pizza" == foodName){
System.out.println("search food name is "+foodName);
return 650*quantity;}
if("tomato pizza" == foodName){
System.out.println("search food name is "+foodName);
return 200*quantity;}
if(" sausage pizza"== foodName){
System.out.println("search food name is "+foodName);
return 300*quantity;}
if("chicken pepperoni" == foodName){
System.out.println("search food name is "+foodName);
return 450*quantity;}
if("indi chicken" == foodName){
System.out.println("search food name is "+foodName);
return 650*quantity;}
if("loaded non veg" == foodName){
System.out.println("search food name is "+foodName);
return 150*quantity;}
if("double chicken" == foodName){
System.out.println("search food name is "+foodName);
return 800*quantity;}
if("feast pizza" == foodName){
System.out.println("search food name is "+foodName);
return 600*quantity;
}
return 0.0;
}
}