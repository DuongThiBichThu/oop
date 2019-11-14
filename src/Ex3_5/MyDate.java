
package Ex3_5;
public class MyDate{
	private int year;
	private int month;
	private int day;
	private String[] srtMonth= {"Jan","Feb","Mar","Apr","May","Jun","Jul","aug","Sep","Sep","Oct","Nov","Dec"};
	private String[] srtDays= {"Sunday","Monday","Tuesday","Thursday","Wednesday","Friday","Saturday"};
	private int[] srtInMonths= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	
	public MyDate() {
		
	}
	public MyDate(int year, int month, int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12 || day < 1 || day > 31)
            return false;
        if (MyDate.isLeapYear(year)) {
            if (month == 2 && (day < 1 && day > 29))
                return false;
        } else {
            if ((month == 2) && (day < 1 || day > 28)) return false;
            else if ((month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) && (day < 1 || day > 31))
                return false;
            else if ((month == 4 || month == 6 || month == 9 ||
                    month == 11) && (day < 1 || day > 30))
                return false;
        }
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int centuryZeller = year / 100;
        int yearZeller = year % 100;
        int monthZeller = 11;
        if (month - 2 > 0)
            monthZeller = month - 2;
        else {
            monthZeller = 10 + month;
        }
        return ((13 * monthZeller - 1) / 5 +
                (yearZeller / 4) + (centuryZeller / 4) + day + yearZeller - (2 * centuryZeller)) % 7;
    }

    public void setDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }



    @Override
    public String toString() {
       String day_ = " ";/*strDays[getDayOfWeek(year, month, day)]*/;
       String month_ = srtMonth[month - 1];
       return day_.concat(" ".concat(day_).concat(" ").concat(String.valueOf(day)).
                concat(" ".concat(month_).concat(" ")).concat(String.valueOf(year)));
    }
	
}