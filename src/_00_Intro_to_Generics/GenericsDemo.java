package _00_Intro_to_Generics;

/*
 * Generics in Java are a way to define one variable that can act as different 
 * types. 
 * 
 * Generics can be used in methods and classes. 
 * 
 * The syntax for Generics are the angle brackets <>.
 * 
 * Think about it... you've used Generics without knowing.
 * 
 * Below the Generic type for an ArrayList defined to be String:
 * 
 * ArrayList<String> aList = new ArrayList<String>()
 * 
 */

public class GenericsDemo<T> {
    // This variable can be any object type because it is type T(our Generic)
   private T thing;

    public void setThing(T thing) {
        this.thing = thing;
    }

    public T getThing() {
        return this.thing;
    }
}
