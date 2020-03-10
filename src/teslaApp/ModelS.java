package teslaApp;

import processing.core.PApplet;
import processing.core.PFont;

public class ModelS extends Carro {
	
	PApplet appS;
	PFont font5;

	public ModelS(String Battery, String Acceleration, String Range, String Seats, String VMax, String Display,
			String Wheels, String Price,PApplet appS, PFont font5) {
		super(Battery, Acceleration, Range, Seats, VMax, Display, Wheels, Price);
		
		this.appS = appS;
		this.font5 = font5;

	}
	public void acomodarCaracteristicas() {
		
		appS.textFont(font5);
		//Columna izq
		appS.text(getBattery(),50,506);
		appS.text(getAcceleration(),50,592);
		appS.text(getRange(),50,678);
		appS.text(getSeats(),50,764);
		//Columba Der
		appS.text(getvMax(),261,506);
		appS.text(getDisplay(),261,592);
		appS.text(getWheels(),261,678);
		appS.text(getPrice(),261,764);
	}

}
