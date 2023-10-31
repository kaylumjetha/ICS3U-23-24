package lesson2;

public class compoundBooleanExpressions {
    public static void main(String[] args) {
       boolean isHappy=true;
       boolean hasRedShoes=false;
       
       System.out.println(isHappy && hasRedShoes);
       // && is true only when both are true
       // false otherwise 

    //    System.out.println(true && true); // prints true
    //    System.out.println(true && false); // prints false
    //    System.out.println(false && true); // prints false
    //    System.out.println(false && false); // prints false  // shows yellow error because java already knows it is false with the first flae

        System.out.println(true||true); 
       System.out.println(true||false); 
       System.out.println(false||true); 
       System.out.println(false||false);

       // ONLY ONE NEEDS TO BE TRUE FOR OR  ||
       // BOTH MUST BE TRUE FOR AND &&
    }
}
