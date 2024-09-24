package Objects;

public class TempConverter {

	public static void main(String[] args) {
		
		System.out.println(fToc(60));
	}
	
	public static int fToc(double tempInf) {
		
		return (int) (Math.round((tempInf - 32) * 5.0 / 9));
	}

}
