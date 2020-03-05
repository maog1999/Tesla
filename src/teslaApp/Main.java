package teslaApp;

import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
int pantalla ;

//variables de imagenes
PImage pantalla1;
PImage pantallaReg;
PImage pantallaLog;

//variables botones
boolean boton1 = false;
/*boolean
boolean
boolean
boolean
boolean
boolean
boolean
boolean*/

	public static void main(String[] args) {
		PApplet.main("teslaApp.Main");
	}
public void settings() {
	size(414,896);
}

public void setup() {
	pantalla = 0;
	
	//espacio para cargar todas las imagenes de la app
	pantalla1=loadImage("images/pantallaPrimera.png");
	pantallaReg=loadImage("images/pantallaRegister.png");
	pantallaLog=loadImage("images/pantallaLogIn.png");
}
public void draw() {
	background(255,0,0);
	fill(255);
	textSize(50);
	
	switch(pantalla) {
	case 0: //pantalla principal
		image(pantalla1,0,0);
	break;
	case 1://pantalla de logearse
		image(pantallaLog,0,0);
	break;
	case 2://pantalla para registrarse
		image(pantallaReg,0,0);
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);
	}
}
public void mouseClicked() {
	switch(pantalla) {
	case 0:
		if(mouseX>82 && mouseX<145 && mouseY>575 && mouseY<612) {
			pantalla=1;
		}else if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=2;
		}
	case 1:
		if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=0;
		}
	case 2:
		if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=0;
		}
		
	
}
}
}
