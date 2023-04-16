package homework_tomorrow;

import lambdas.Calculate;

public class Main {
    public static void main(String[] args) {

        //  Написать следующие лямбды используя наши интерфейс
        //  1. сложить строки a и  b

        StringConcate stringConcate = (a, b) -> Integer.toString(a)+(b);

        System.out.println(stringConcate.concat (5, 5));  // 55



       // 2.  ------------------------------------------------------------------------
        // есть строка, если ее длина равна 3 вернуть true  иначе  false


        Checkable checkable = in-> in.length() ==3;

        System.out.println(checkable.check("Hel"));   // true
        System.out.println(checkable.check("Hello")); // false



        // 3.  -----------------------------------------------------------------------
        // Есть строка string распечатать ее в виде !string!

        Printable printable = s ->{
            System.out.println("!" +s+ "!");
        };
        printable.print("string");  // !string!

        // написать лямбда выражение такое что если длина строки =4, то вернуть четыре звездочки
        // иначе вернуть строку без изменений


        Transformable transformable = in-> in.length() ==4 ? in = "****" : in;

        System.out.println("Transformable"); //Transformable
        System.out.println(transformable.modify("ab")); // ab
        System.out.println(transformable.modify("abcd")); // ****

        // написать лямбда выражение такое что будет печататься
        // "Hello World"

        Producable producable = () ->"Hello World";

        System.out.println("Producable");
        System.out.println(producable.produce()); //Hello World









    }


}
