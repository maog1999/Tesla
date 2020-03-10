package teslaApp;

public abstract class Carro {
	private String battery; 
	private String acceleration;
	private String range;
	private String seats;
	private String vMax;
	private String display;
	private String wheels;
	private String price;

public Carro(String Battery,String Acceleration,String Range,String Seats,String VMax,String Display,String Wheels,String Price) {
	battery = Battery;
	acceleration = Acceleration;
	range = Range;
	seats = Seats;
	vMax = VMax;
	display = Display;
	wheels = Wheels;
	price = Price;
	
	
}

public String getBattery() {
	return battery;
}

public void setBattery(String battery) {
	this.battery = battery;
}

public String getAcceleration() {
	return acceleration;
}

public void setAcceleration(String acceleration) {
	this.acceleration = acceleration;
}

public String getRange() {
	return range;
}

public void setRange(String range) {
	this.range = range;
}

public String getSeats() {
	return seats;
}

public void setSeats(String seats) {
	this.seats = seats;
}

public String getvMax() {
	return vMax;
}

public void setvMax(String vMax) {
	this.vMax = vMax;
}

public String getDisplay() {
	return display;
}

public void setDisplay(String display) {
	this.display = display;
}

public String getWheels() {
	return wheels;
}

public void setWheels(String wheels) {
	this.wheels = wheels;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}
	
}
