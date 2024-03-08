/*
- Inside the class Inky, Create an object called Ponkey.
- Create a local variable inside the main method Pinkey and its value is "donkey".
- Print variable Pinky inside the constructor.
- Create an Other variable Inside the main method as blinky. It's value is "Pinkey".
- There is another variable inside the main method rinkey. It's value is "monkey".
- Pass all 3 variables to another constructor and Create below statements.

1) Pinky donkey
2) donkey, monkey Monkey
3) pinky, donkey, Monkey*/

public class Inky {

    public Inky (String Pinkey){
        System.out.println(Pinkey);
    }

    public Inky (String A, String B, String C){
        System.out.println(B+" "+A);
        System.out.println(A+" "+C);
        System.out.println(B+" "+A+" "+C);
    }

public static void main(String args[]){

    String Pinkey = "Donkey";
    String Blinky = "Pinkey";
    String Rinkey = "Monkey";

    Inky Ponkey = new Inky(Pinkey);
    Inky Ponkey1 = new Inky(Pinkey,Blinky,Rinkey);
}   
}
