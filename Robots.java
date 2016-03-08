
public class Robots {
	String brand;
	String name;
	int speed;
	int power;
	
	public Robots(String Brand, String Name, int StartSpeed, int Power){
		brand = Brand;
		name = Name;
		speed = StartSpeed;
		power = Power;
		
	}
	public void slowDown(){
		speed -= 2;
	}
	public void speedUp(){
		speed += 2;
	}
	public void losePower(){
		power -= 6;
	}
	public void powerUp(){
		power += 3;
	}
	public void Greeting(){
		System.out.println("Hello there!");
	}

}
