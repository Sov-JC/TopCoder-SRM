import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import java.util.Date;

public class NextOlympics {
	
	public int countDays(String today) {
		String[] todaySplit = today.split("[.]");
		int year = Integer.parseInt(todaySplit[0]);
		int month = Integer.parseInt(todaySplit[1]);
		int day = Integer.parseInt(todaySplit[2]);

		LocalDateTime todayLocalDateTime = LocalDateTime.of(year,month,day, 0,0,0);
		LocalDateTime thenLocalDateTime = LocalDateTime.of(2021, 7, 23, 0, 0, 0);

		Duration d1 = Duration.between(todayLocalDateTime, thenLocalDateTime);

		int days = ((Long)d1.toDays()).intValue();

		return days;
	}

//	public static void main(String[] args){
//		countDays();
//	}
}
