abstract class Bike{
Bike()
{
System.out.println("bike is created");
}
abstract void run();
void changeGear()
{
System.out.println("Gear changed");}
}
class Honda extends Bike{
void run(){
System.out.println("running safely....");
}
}
class Test4{
public static void main(String agrs[]){
Bike obj=new Honda();
obj.run();
obj.changeGear();
}
}		