
public class GoRobots {

	public static void main(String[] args) {
		Sony sony1 = new Sony("Sony", "Yoshi", 5, 20);
		sony1.Greeting();
		System.out.println("My name is " + sony1.name);
		sony1.speedUp();
		System.out.println("Start speed: " + sony1.speed);
		sony1.losePower();
		System.out.println("Power level: " + sony1.power);

	}

}
