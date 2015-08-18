package di;

public class Car {
	Wheels wheels;
	public void setWheels(Wheels wheels)
	{
		this.wheels=wheels;
	}
	public Wheels getWheels() {
		return wheels;
	}
	public void moving()
	{
		wheels.rotate();
		System.out.println("car is moving");
	}
}
