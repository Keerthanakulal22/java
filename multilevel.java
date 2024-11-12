class Animal{
    public void eat(){
        System.out.println("Animal is eating....");
    }
    public void sleep(){
        System.out.println("Animal is sleeping...");
    }}
 class Mammal extends Animal{
    public void walk(){
        System.out.println("Mammal is walking...");
    }
}
 class Dog extends Mammal{
     public void bark(){
         System.out.println("Dog is barking...");
     }
 }
public class multilevel {
  public static void main(String[] args){
      Dog dog=new Dog();
      dog.eat();
      dog.sleep();
      dog.walk();
      dog.bark();
  }  
}
