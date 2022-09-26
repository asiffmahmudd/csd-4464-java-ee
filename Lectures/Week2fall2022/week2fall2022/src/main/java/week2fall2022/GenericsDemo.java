package week2fall2022;

public class GenericsDemo {

	public static void main(String[] args) {
		log(calculateGrade(10.5, 12));
		log(calculateGrade(10.5f, 12));
		log(calculateGrade(10.5, 12L));
		log("this is logging a string");
	}

	
	public static <T extends Number, U extends Number> Double calculateGrade(
			T grade,
			U maxGrade) {
		
		return grade.doubleValue() / maxGrade.doubleValue();
	}

	public static <T> void log(T toLog) {
		System.out.println(toLog.toString());
	}
}
