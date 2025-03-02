public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(6, 14, 1992);
        System.out.printf("Date 1 (MM/DD/YYYY): %s", date1.toString());
        
        Date date2 = new Date("June", 14, 1992);
        System.out.printf("Date 2 (Month Name, Day, Year): %s", date2.toString());
        
        Date date3 = new Date(165, 1992);
        System.out.printf("Date 3 (Day of Year, Year): %s", date3.toString());
    }
}