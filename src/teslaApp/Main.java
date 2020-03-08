package teslaApp;

import java.util.ArrayList;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Main extends PApplet {

//variable librerias 
private ControlP5 cp5;
ArrayList<Usuario> usu;
String [] ensayo;
String textValue = "";
String registro;

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
		PApplet.main(Main.class.getName());
	}
public void settings() {
	size(414,896);
}

public void setup() {
	pantalla = 0;
	ensayo = new String [10];
	
	//fuentes
	PFont font = createFont("Roboto-Regular.tff", 20);
	
	//arreglos de informacion
	usu = new ArrayList <Usuario>();
	
	//espacio para cargar todas las imagenes de la app
	pantalla1=loadImage("images/pantallaPrimera.png");
	pantallaReg=loadImage("images/pantallaRegister.png");
	pantallaLog=loadImage("images/pantallaLogIn.png");
	
	//inicializacion librerias
	cp5 = new ControlP5(this);
	cp5.addTextfield("input")
	.setPosition(50,280)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorActive(color(38,38,38));
	
	cp5.addBang("submit")
	.setPosition(0,817)
	.setColorBackground(color(255,255,255,1))
	.setColorActive(color(255,255,255,1))
	.setColorValue(color(255,255,255,1))
	.setColorForeground(color(0,0,0,30))
	.setSize(414,79);
	
	
	//.setStringValue(String)
	//.keepFocus(true)
	
	/*ensayo [0]= cp5.get(Textfield.class,"input").getText();
			System.out.println(ensayo[0]);
	*/
	/*ensayo[0]= cp5.get(Textfield.class,"input").getText();
	System.out.println("ayy papi" + ensayo[0]);*/
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
			pantalla=1;//para pasar al login
		}else if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=2;//para pasar al register
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

public void input (String Thetext) {
	ensayo[0] = Thetext;
	//System.out.println("entro : "+Thetext);
	System.out.println(ensayo[0]+"ay papi");
}

public void submit() {
	registro=cp5.get(Textfield.class,"input").getText();
	ensayo[1]=registro;
	System.out.println(ensayo[1]);
			}
}


