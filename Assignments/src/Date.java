public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int dd, int mm, int yy) {
        day = dd;
        month = mm;
        year = yy;
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

    public void setDay(int Day) {
        day = Day;
    }
    public void  setMonth(int Month) {
        month = Month;
    }
    public void  setYear(int Year) {
        year = Year;
    }

    public void displayDate1() {
        System.out.println("date: " + day + "/" + month + "/" + year);
    }
}
