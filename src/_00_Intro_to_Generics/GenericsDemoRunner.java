package _00_Intro_to_Generics;

public class GenericsDemoRunner {
    public static void main(String[] args) {
        
        /*
         * In order to create an object with a generic variable we have to
         * define the type of Object we want the Generic to be
         */
        
        // Defined to be String
        GenericsDemo<String> g1 = new GenericsDemo<String>();
        g1.setThing("Hello");
        System.out.println(g1.getThing());

        // Defined to be Integer
        GenericsDemo<Integer> g2 = new GenericsDemo<Integer>();
        g2.setThing(123);
        System.out.println(g2.getThing());

        // Defined to be Double
        GenericsDemo<Double> g3 = new GenericsDemo<Double>();
        g3.setThing(456.789);
        System.out.println(g3.getThing());

    }
}
