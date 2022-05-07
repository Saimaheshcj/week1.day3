package week1.day3;

public class Car {
public void applybreak() {
	System.out.println("applybreak");
}
public void applygear() {
	System.out.println("applygear");
}
public void applyacclerate() {
	System.out.println("applyacclerate");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car car=new Car();
car.applyacclerate();
car.applybreak();
car.applygear();
	}

}
