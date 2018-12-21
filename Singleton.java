package pooja.assignment.singleton;

public class Singleton {
    String s;

    /*static Singleton method(String str)
    {
        s=str;	//error because static variables cannot be accessed inside a static method
        return new Singleton();
    }
    */
    void printString()
    {
        System.out.print(s); // prints null.
    }
}