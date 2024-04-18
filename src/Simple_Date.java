public class Simple_Date {

    private int day;
    private int month;
    private int year;

    public Simple_Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    @Override
    public String toString(){
        return "Day: " + this.day + ", Month: " + this.month + " , Year: " + this.year;
    }
}
