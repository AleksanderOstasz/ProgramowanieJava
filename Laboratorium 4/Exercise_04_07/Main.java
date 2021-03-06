package Exercise_04_07;

/*Zadanie_04_07

    Autorzy: Dorota Matkowska
             Aleksander Ostasz
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String args[]) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("E:\\Java\\src\\tekst.txt"), "UTF-8");
        String s = scanner.useDelimiter("\\A").next();
        scanner.close();


        String[] splitted = s.split(" ");
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (int i = 0; i < splitted.length; i++) {
            if (hm.containsKey(splitted[i])) {
                int cont = hm.get(splitted[i]);
                hm.put(splitted[i], cont + 1);
            } else {
                hm.put(splitted[i], 1);
            }
        }
        System.out.println(hm);
    }
}
