import java.util.*;
public class product{
int pcode;
String pname;
int price;
public static void main(String[]args){
int smallest;
System.out.println("AFNA ASSIS\n 23MCA005\n 13-2-2024");
product obj1=new product();
product obj2=new product();
product obj3=new product();
obj1.pcode=301;
obj1.pname="RAM";
obj1.price=7000;
obj2.pcode=302;
obj2.pname="processor";
obj2.price=37000;
obj3.pcode=303;
obj3.pname="SSD";
obj3.price=16700;
if(obj1.price<obj2.price){
if(obj3.price<obj1.price){
smallest=obj3.price;

System.out.println(obj3.pname+"is the cheapest.");
}else{
smallest=obj1.price; 

System.out.println(obj1.pname+"is the cheapest.");
}
}else{
if(obj2.price<obj3.price){
smallest=obj2.price;

System.out.println(obj2.pname+"is the cheapest.");
}else{
smallest=obj3.price;

System.out.println(obj3.pname+"is the cheapest.");
}
}
}
}


