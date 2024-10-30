abstract class MyClass{
public void disp1(){
System.out.println("Concrete method of parent class");
}
abstract public void disp2();
}
class Demo extends MyClass {
public void disp2(){
System.out.println("Overriding abstract method");
}
}
class Test2{
public static void main(String args[]){
//MyClass obj=new Demo();
MyClass obj;
obj=new Demo();
obj.disp1();
obj.disp2();
}
}