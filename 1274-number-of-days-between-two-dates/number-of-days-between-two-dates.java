class Solution {

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(toDays(date1) - toDays(date2));
    }
    private int toDays(String date)
     {
        String[] parts = date.split("-");
        int y = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int d = Integer.parseInt(parts[2]);
        int days = 0;
        days += 365 * (y - 1);
        days += countLeapYears(y - 1);
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < m - 1; i++) {
            days += monthDays[i];
        }
        if (m > 2 && isLeap(y)) {
            days += 1;
        }
        days += d;

        return days;
    }

    private boolean isLeap(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }

    private int countLeapYears(int year) {
        return year / 4 - year / 100 + year / 400;
    }
}
