/*
Wykonawcy:  Wojciech Lilla
            Aleksander Ostasz

Tytul: Date UML
 */
public class Date {

    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year)
    {

            this.day = day;
            this.month = month;
            this.year = year;

    }

    public boolean checkDay(){
        if((day>=1)&&(day<=31))
        {
            return true;
        }
        else {

            return false;

        }
    }
    public boolean checkMonth(){
        if((month>=1)&&(month<=12))
        {
            return true;
        }
        else {

            return false;
        }
    }
    public boolean checkYear(){
        if((year>=1900)&&(year<=9999))
        {
            return true;
        }
        else {

            return false;
        }
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }


    public String toString()
    {
        if (checkDay()&&checkMonth()&&checkYear()) return day+"/"+month+"/"+year;
             else return "Podales zla date";
        }
}
