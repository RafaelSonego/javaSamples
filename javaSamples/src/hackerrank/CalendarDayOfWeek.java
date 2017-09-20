package hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class CalendarDayOfWeek {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();
		in.close();
		System.out.println(getDay(day, month, year));
	}

	private static String getDay(String day, String month, String year) {
		String dayOfWeek = "";
		try {
			int y = Integer.parseInt(year);
			if (y > 2000 && y < 3000) {
				String inputDateStr = String.format("%s/%s/%s", day, month, year);
				Date inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputDateStr);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(inputDate);
				dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dayOfWeek;
	}
}
