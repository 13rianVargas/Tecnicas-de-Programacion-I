//13rian Vargas

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner ent = new Scanner(System.in);

        int input = 0;

        ArrayList<Integer> list = new ArrayList<>();

        input = ent.nextInt();
        while (input != -1){
            list.add(input);
            input = ent.nextInt();
        }
        
        int aFavor = 0;
        int enContra = 0;
        for (int i=0; i < list.size();i++){
            if (list.get(i) == 1) {
                aFavor++;
            } else if (list.get(i) == 0){
                    enContra++;
                }
        }

        if (aFavor > enContra){
            System.out.println("A FAVOR");
        } else if (enContra > aFavor) {
            System.out.println("EN CONTRA");
        } else if (aFavor == enContra){
            System.out.println("EMPATE");
        }
        ent.close();
    }
}