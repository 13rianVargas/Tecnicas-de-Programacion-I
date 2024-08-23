//13rian Vargas

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner ent = new Scanner(System.in);

        HashMap<String, String> u = new HashMap<>();
        u.put("1", "one");
        u.put("2", "two");
        u.put("3", "three");
        u.put("4", "four");
        u.put("5", "five");
        u.put("6", "six");
        u.put("7", "seven");
        u.put("8", "eight");
        u.put("9", "nine");

        HashMap<String, String> d = new HashMap<>();
        d.put("2", "twenty");
        d.put("3", "thirty");
        d.put("4", "forty");
        d.put("5", "fifty");
        d.put("6", "sixty");
        d.put("7", "seventy");
        d.put("8", "eighty");
        d.put("9", "ninety");

        String num = ent.nextLine().trim();
        char n1 = num.charAt(0);
        char n2 = num.charAt(1);

        if (n2 == '0') {
            System.out.println(d.get(Character.toString(n1)));
        } else {
            System.out.print(d.get(Character.toString(n1)) + "-" + u.get(Character.toString(n2)));
        }
        ent.close();
    }
}