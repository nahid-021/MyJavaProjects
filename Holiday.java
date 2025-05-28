public class Holiday {
	private String name;
	private int day;
	private String month;
	
	public Holiday(String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}
	
	public static boolean insameMonth(Holiday h1, Holiday h2) {
		return h1.month.equals(h2.month);
	}
	
	/* public avgDate(Holiday[]) {
		double day;
	} */
	
	public static void main(String[] args) {
		Holiday h = new Holiday("Independance Day", 4, "July");
		System.out.println("Created: " + h.name + " on " + h.month + " " + h.day);
	}
}