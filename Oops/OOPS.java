

public class OOPS{
 public static void main(String args[]){
//    Pen P1 = new Pen();
//    P1.setColor("green");
//    System.out.println(P1.color);
//    P1.setTip(4);
//    System.out.println(P1.tip);
//       Student S1 = new Student("guddi" , 54);
//       System.out.println(S1.name+ " " +S1.roll_no);

// CopyConstructors s1 = new CopyConstructors();
// s1.name = "guddi yadav";
// s1.password = "123ddfs";
// s1.rollno = 23;
// s1.marks[0]=100;
// s1.marks[1]=90;
// s1.marks[2]=80;
// CopyConstructors s2 = new CopyConstructors(s1);
// s2.password = "jfn637";
// s1.marks[0]=98;
// for(int i=0;i<3;i++){
//     System.out.println(s2.marks[i]);
// }

//Inheritance
// Fish Shark = new Fish();
// Shark.eats();
// Shark.swim();

//polymorphism
//method overloading
// Calculator clac = new Calculator();
// System.out.println(clac.sum(2,4));
// System.out.println(clac.sum((float)2.5, (float)4.6));
// System.out.println(clac.sum(2,4,5));

//Abstraction
// Yadavfamily Guddi = new Yadavfamily();
// Guddi.eats();
// Guddi.drink();


//Interfaces
// Queen Q1 = new Queen();
// Q1.moves();

//multiple Inheritance
Beer B1 = new Beer();
B1.eatsGrass();
B1.eatsMeat();
 }
}

//multiple Inheritance

interface Herbivorous{
    void eatsGrass();
}

interface Carnivorous{
    void eatsMeat();
}

class Beer implements Herbivorous,Carnivorous{

    public void eatsGrass(){
        System.out.println("Beer eats grass");
    }

    public void eatsMeat(){
        System.out.println("Beer eats Meats");
    }
}

//Interfaces

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("goes up down left right");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("goes up down left right one at a time");
    }
}

class Elephant implements ChessPlayer{
    public void moves(){
        System.out.println("goes in L direction");
    }
}


//Abstraction
 abstract class Human{
    Human() {
        System.out.println("Constructor Human was called");
    }
 void eats(){
    System.out.println("Humans eats");
 }
 abstract void drink();
}

class Yadavfamily extends Human{

     Yadavfamily() {
        System.out.println("Constructor Yadavfamily was called");
    }
    void drink(){
        System.out.println("Yadav family drink milk");
    }
}

class SawFamily extends Human{
      SawFamily() {
        System.out.println("Constructor SawFamily was called");
    }
    void drink(){
        System.out.println("Yadav family drink coke");
    }
}

//polymorphism
//method overloading
class Calculator{
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a , float b){
        return a+b;
    }
    int sum(int a , int b,int c){
        return a+b+c;
    }
}

//inheritance
class Animal {
    String color;
    void eats(){
        System.out.println("eats");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
//copy constructors

class CopyConstructors{
    String name;
    String password;
    int rollno;
    int marks[];
     CopyConstructors(){
        marks= new int[3] ;
        System.out.println("Constructor was called.....");
     }

     //Copy constructor
     CopyConstructors(CopyConstructors s1){
        marks= new int[3] ;
        this.name = s1.name;
         this.rollno = s1.rollno;
         this.marks = s1.marks;
     }
}

class Pen{
  String color;
  int tip;
  void setColor(String newColor){
     color = newColor;
  }
  void setTip(int newTip){
     tip = newTip;
  }  
}

class Student{
    String name;
    int roll_no;

    Student(String name , int roll_no){ //Constructor
        this.name = name; 
        this.roll_no = roll_no;
    }
}

