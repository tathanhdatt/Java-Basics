public class DateUtil {
  public static void main(String[] args) {
    System.out.println(isLeapYear(1900));
    System.out.println(isLeapYear(2000));
    System.out.println(isLeapYear(2011));
    System.out.println(isLeapYear(2012));

    System.out.println(isValidDate(2012, 2, 29));
    System.out.println(isValidDate(2011, 2, 29));
    System.out.println(isValidDate(2099, 12, 31));
    System.out.println(isValidDate(2099, 12, 32));

    System.out.println(getDayOfWeek(1982, 4, 24));
    System.out.println(getDayOfWeek(2000, 1, 1));
    System.out.println(getDayOfWeek(2054, 6, 19));
    System.out.println(getDayOfWeek(2022, 3, 21));

    System.out.println(toString(2022, 3, 21));
  }

  public static boolean isLeapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }

  public static boolean isValidDate(int year, int month, int day) {
    if (9999 < year || year < 0 || 12 < month || month < 1) {
      return false;
    }
    if (day <= 0) {
      return false;
    } else {
      switch (month) {
        case 1, 3, 5, 7, 8, 10, 12:
          return day <= 31;
        case 2:
          if (isLeapYear(year)) {
            return day <= 29;
          } else {
            return day <= 28;
          }
        default:
          return day <= 30;
      }
    }
  }

  public static int getDayOfWeek(int year, int month, int day) {
    int date = 0;

    int[] numFollowCentury = {6, 4, 2, 0};
    int first2DigitYear = year / 100;
    if ((first2DigitYear - 20) % 4 == 0) {
      date += numFollowCentury[0];
    } else if ((first2DigitYear - 21) % 4 == 0) {
      date += numFollowCentury[1];
    } else if ((first2DigitYear - 22) % 4 == 0) {
      date += numFollowCentury[2];
    } else if ((first2DigitYear - 23) % 4 == 0) {
      date += numFollowCentury[3];
    }

    int last2DigitYear = year % 100;
    date += last2DigitYear + last2DigitYear / 4;

    int[] numMonthNonLeapYear = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    int[] numMonthLeapYear = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    date += isLeapYear(year) ?
      numMonthLeapYear[month - 1] :
      numMonthNonLeapYear[month - 1];
    date += day;

    return date % 7;
  }

  public static String toString(int year, int month, int day) {
    String[] strDaysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    int dayOfWeek = getDayOfWeek(year, month, day);
    return strDaysOfWeek[dayOfWeek] + " " + day + " " +
            strMonths[month - 1] + " " + year;
  }
}
