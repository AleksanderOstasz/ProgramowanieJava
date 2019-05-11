/*
Wykonawcy:  Wojciech Lilla
            Aleksander Ostasz

Tytul: ArrayList
 */
import java.util.ArrayList;
import java.util.List;

public class Arraylist{
    public static void main(String[] args){
        List<String> name = new ArrayList<String>();
        name.add("Asia");
        name.add("Basia");
        name.add("Krzysiek");
        name.add("Wojtek");
        name.add("Klaudia");
        name.add("Martyna");
        name.add("Weronika");
        name.add("Michal");

        List<String> salary = new ArrayList<String>();
        salary.add("2000");
        salary.add("2600");
        salary.add("6000");
        salary.add("6500");
        salary.add("3000");
        salary.add("5930");
        salary.add("7850");
        salary.add("6500");

        List<String> date = new ArrayList<String>();
        date.add("20/6/2003");
        date.add("25/6/2015");
        date.add("9/5/2016");
        date.add("7/1/1997");
        date.add("13/2/2018");
        date.add("31/12/2009");
        date.add("4/6/2003");
        date.add("16/11/1999");

        for(int i=0;i<name.size();i++){
            System.out.print(name.get(i)+" "+salary.get(i)+" ");
            System.out.println(date.get(i));
        }
    }
}