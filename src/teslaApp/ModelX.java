package teslaApp;

import processing.core.PApplet;
import processing.core.PFont;

public class ModelX extends Carro{
	
	PApplet appX;
	 PFont font4;
	
	public ModelX(String Battery, String Acceleration, String Range, String Seats, String VMax, String Display,
			String Wheels, String Price, PApplet appX, PFont font4) {
		super(Battery, Acceleration, Range, Seats, VMax, Display, Wheels, Price);
		
		this.appX = appX;
		this.font4 = font4;
	}


public void acomodarCaracteristicas() {
	
	appX.textFont(font4);
	//Columna izq
	appX.text(getBattery(),50,506);
	appX.text(getAcceleration(),50,592);
	appX.text(getRange(),50,678);
	appX.text(getSeats(),50,764);
	//Columna Der
	appX.text(getvMax(),261,506);
	appX.text(getDisplay(),261,592);
	appX.text(getWheels(),261,678);
	appX.text(getPrice(),261,764);
}

}
