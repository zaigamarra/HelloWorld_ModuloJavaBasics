package moduloJavaBasicsBIG;

import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.spi.SoundbankReader;
import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*


        //HELLO WORLD
        System.out.println("Hello World");


        //VARIABLES
        int age = 30, temperature = 20; //Se pueden declarar en la misma línea, pero no es recomendable
        //int is the type
        //age is an ID
        //30 is an initial value
        System.out.println(age);
        age = 35;
        System.out.println(age);

        int temp = 22;

        int myAge = 27;
        int herAge = myAge;
        System.out.println(herAge);


        //PRIMITIVE TYPES
        byte age2 = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;


        //REFERENCE TYPES
        Date now = new Date();
        System.out.println(now);


        //PRIMITIVE TYPES VS REFERENCE TYPES
        byte x = 1;
        byte y = x;
        //x,y son independientes
        x = 2;
        System.out.println(x);
        System.out.println(y);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);


        //STRINGS
        String message = "  Hello World" + "!!";
        message.endsWith("!!");
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("l"));
        System.out.println(message.replace("!", "*"));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());


        //ESCAPE SEQUENCES
        String myName = "Zaira \"Gamarra\"";
        System.out.println(myName);

        //c:\Windows\...
        String rutaDeTrabajo = "c:\\Windows\\...";
        System.out.println(rutaDeTrabajo);

        //new line
        String herName = "Karen \n Calvo";
        System.out.println(herName);

        //using of \t for Tab
        String herName2 = "Magali \t Quintana";
        System.out.println(herName2);


        //ARRAYS
        int[] numbers = new int[5]; //list of items
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        //nueva forma de declarar arrays
        int[] numbers2 = {2,3,5,1,4};
        System.out.println(numbers.length);
        //no de puede cambiar su longitud

        //ordenamos los números
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));


        //MULTI-DIMENSIONAL ARRAYS
        int[][] numbers3 = new int[2][3]; // 2 dimensiones, también puede ser de 3
        numbers3[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers3));

        int[][] numbers4 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers4));

        //CONSTANTS
        final float PI = 3.14F;


        //ARITHMETIC EXPRESSIONS

        int result = 10 + 3;
        System.out.println(result);

        int result2 = 10 - 3;
        System.out.println(result2);

        int result3 = 10 * 3;
        System.out.println(result3);

        int result4 = 10 / 3;
        System.out.println(result4);
        // Es división entera. Puedo convertirlos a float o double.

        double result5 = (double)10 / (double)3;
        System.out.println(result5);

        int z = 1;
        z++;
        System.out.println(z);

        int w = z++;
        System.out.println(w);

        w = ++z;
        System.out.println(w);

        // x = x + 2 es igual a x += 2
        // Lo mismo con -=, /=, *=


        //ORDER OF OPERATIONS
        int a = 10 + 3 * 2;
        System.out.println(a);

        // Prioridad: (), * y /, + y -


        //CASTING
        short b = 1; //2 bytes
        int c = b + 2; //4 bytes
        // le sumo un shot a un int
        System.out.println(c);

        double d = 1.1;
        double e = d + 2; //implicit casting: 2.0
        System.out.println(e);

        int f = (int)d +2; //explicit casting
        System.out.println(f);

        String g = "1";
        int h = Integer.parseInt(g) + 2; //Toma un string y lo pasa a int
        System.out.println(h);

        String i = "2.2";
        double j = Double.parseDouble(i) + 2; //Toma una string y lo pasa a double
        System.out.println(j);


        //THE MATH CLASS
        int result_5 = Math.round(1.1F);
        System.out.println(result_5);

        int result_6 = Math.round(1.8F);
        System.out.println(result_6);
        //redondeo del número

        int result_7 = (int)Math.ceil(1.1F);
        System.out.println(result_7);

        int result_8 = (int)Math.floor(1.1F);
        System.out.println(result_8);

        int result_9 = Math.max(3,7);
        System.out.println(result_9);

        int result_10 = Math.min(3,7);
        System.out.println(result_10);

        double result_11 = Math.random(); //aleatorio ente 0 y 1
        System.out.println(result_11);

        double result_12 = Math.random() * 100; //aleatorio ente 0 y 99
        System.out.println(result_12);

        int result_13 = (int)Math.round(Math.random() * 100);
        System.out.println(result_13);


        //FORMATTING NUMBERS
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result_14 = currency.format(1234567.891);
        System.out.println(result_14);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result_15 = percent.format(0.1);
        System.out.println(result_15);

        String result_16 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result_16);


        //READING INPUT
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age3 = scanner.nextByte(); //Only byte
        System.out.println("You are " + age3);

        System.out.print("Name: ");
        String name = scanner.next(); // Solo la primer palabra
        System.out.println("Your name is " + name);
        String name2 = scanner.nextLine(); //
        System.out.println("Your surname is " + name2);


        //COMPARISON OPERATORS
        int k = 1;
        int l = 1;
        int m = 2;
        System.out.println(k == l); //T
        System.out.println(k != l); //F
        System.out.println(k == m); //F
        System.out.println(k != m); //T
        System.out.println(k >= l); //T
        System.out.println(k <= m); //T


        //LOGICAL OPERATORS
        int temp_1 = 22;
        boolean isWarm = temp_1 > 20 && temp_1 <30; //Ambas T
        System.out.println(isWarm);

        int temp_2 = 18;
        boolean isWarm_2 = temp_2 > 20 && temp_2 <30;
        System.out.println(isWarm_2);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);


        //IF STATEMENTS

        int temp_3 = 8;
        if (temp_3 > 30){
            System.out.println("Es un día caluroso");
            System.out.println("Toma agua");
        }
        else if (temp_3 > 20)
            System.out.println("Hermoso día");
        else
            System.out.println("Día helado");

        //SIMPLIFYING IF STATEMENTS
        int income = 120_000;
        boolean hasHighIncome = (income > 100_00);
        System.out.println(hasHighIncome);


        //THE TERNARY OPERATOR
        String className = "Economy";

        if (income > 100_00)
            className = "First";
        System.out.println(className);

        String className_2 = income > 100_000 ? "First" : "Economy"; //condition ? opcion1 : opcion2
        System.out.println(className_2);


        //SWITCH STATEMENTS
        String role = "moderator";

        switch (role){
            case "admin":
                System.out.println("Eres el administrador");
                break;

            case "moderator":
                System.out.println("Eres el moderador");
                break;

            default:
                System.out.println("Eres invitado");
        }



        //FOR LOOPS
        for (int ii = 0; ii < 5; ii++)
            System.out.println("Hola Mundo " + ii);

        //WHILE LOOPS
        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (!input.equals("salir")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        //DO ... WHILE LOOPS
        do {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("salir"));



        //BREAK AND CONTINUE
        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pasar"))
                continue;
            if (input.equals("salir"))
                break;
            System.out.println(input);
        }


        //FOR-EACH LOOP
        String[] fruits = {"Manzana", "Mango", "Naranja"};

        for (int kk = 0; kk < fruits.length; kk++)
            System.out.println(fruits[kk]);

        for (String fruit: fruits)
            System.out.println(fruit);

        */

    }
}
