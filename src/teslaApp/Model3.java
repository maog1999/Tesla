package teslaApp;

import processing.core.PApplet;
import processing.core.PFont;

public class Model3 extends Carro {
	
	PApplet app3;
	PFont font6;
	
	public Model3(String Battery, String Acceleration, String Range, String Seats, String VMax, String Display,
			String Wheels, String Price,PApplet app3,PFont font6) {
		super(Battery, Acceleration, Range, Seats, VMax, Display, Wheels, Price);

		this.app3 = app3;
		this.font6 = font6;
	}
	public void acomodarCaracteristicas() {
		
		app3.textFont(font6);
		//Columna izq
		app3.text(getBattery(),50,506);
		app3.text(getAcceleration(),50,592);
		app3.text(getRange(),50,678);
		app3.text(getSeats(),50,764);
		//Columba Der
		app3.text(getvMax(),261,506);
		app3.text(getDisplay(),261,592);
		app3.text(getWheels(),261,678);
		app3.text(getPrice(),261,764);
	}


}
