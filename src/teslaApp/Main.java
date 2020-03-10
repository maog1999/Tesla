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
ArrayList<Carro> carritos;
String [] ensayo;
String [] tarjeta;
PImage [] intro;
PImage[] homeX;
PImage [] homeS;
PImage [] home3;
String textValue = "";
String registro;
String na;
String Use;
String ema;
String pass;
String copass;
String nC;
String nnC;
String cv;
String m;
String adre;

int pantalla ;
int contador=1;
int contador2=1;
int contador3=1;
int contador4=1;
int contadorCompra=0;

//variables de imagenes
PImage pantalla1;
PImage pantallaReg;
PImage pantallaLog;
PImage pantallaWel;
PImage pantallaMx;
PImage pantallaMs;
PImage pantallaM3;
PImage orderX;
PImage orderS;
PImage order3;
PImage compX;
PImage compS;
PImage comp3;
PImage paX;
PImage paS;
PImage pa3;
PImage thaX;
PImage thaS;
PImage tha3;
PImage passWr;
PImage wronLog;
PImage preX;
PImage preS;
PImage pre3;
PImage ordB;
PImage ordR;
PImage x;
PImage s;
PImage tres;

//variables botones
int registrarse;
int veriLog=1;
private PFont font;
private PFont font2;
private PFont font3;
private PFont font4;
private PFont font5;
private PFont font6;
boolean ani1 = false;
boolean ani2 = false;
boolean ani3 = false;
boolean compraX = false;
boolean compraS = false;
boolean compra3 = false;


	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
public void settings() {
	size(414,896);
}

public void setup() {
	
	//inicializacion de los arrelgos de imagenes
	intro= new PImage[73];
	homeX = new PImage[97];
	homeS = new PImage[98];
	home3 = new PImage[97];
	ensayo = new String [5];
	tarjeta = new String [5];
	
	pantalla = 0;
	
	//arreglo infoUsuario
	ensayo[0] = "name";
	ensayo[1] = "username";
	ensayo[2] = "email";
	ensayo[3] = "password";
	ensayo[4] = "confirmPassword";
	
	//arreglo infoTarjeta
	tarjeta[0] = "naCard";
	tarjeta[1] = "nuCard";
	tarjeta[2] = "cvv";
	tarjeta[3] = "mm";
	tarjeta[4] = "adress";
	
	
	//lugar para cargar las fuentes
	font = createFont("Roboto-Regular.tff", 20);
	font2 = createFont("Roboto-Medium.tff", 22);
	font3 = createFont("Roboto-Regular.tff", 14);
	font4 = createFont("Roboto-Light.tff", 18);	
	font5 = createFont("Roboto-Regular.tff", 12);	
	font6 = createFont("Roboto-Medium.tff", 16);
	
	//arreglos de informacion
	usu = new ArrayList <Usuario>();
	carritos = new ArrayList <Carro>();
	
	//metodo para cargar todas las imagenes de la app
	cargaImagenes();
	
	//metodo para cargar los botones y cuadros de texto
	cargaP5();
	
	
	//.setStringValue(String)
	//.keepFocus(true)
	
	/*ensayo [0]= cp5.get(Textfield.class,"input").getText();
			System.out.println(ensayo[0]);
	*/
	/*ensayo[0]= cp5.get(Textfield.class,"input").getText();
	System.out.println("ayy papi" + ensayo[0]);*/
}
public void draw() {
	background(38,38,38);
	fill(255);
	textSize(10);
	
	switch(pantalla) {
	case 0: //pantalla principal
		/*for(int i=1;intro.length;i++) {
		image(intro[i],0,0);
		}*/
		
		image(intro[contador], 0, 0);
		if(frameCount %2==0) {
			contador++;
			if(contador>70) {
				contador=70;
			}
		}
		ocultarInputs();
		
	break;
	case 1://pantalla de logearse
		image(pantallaLog,0,0);
		/*if(veriLog==2) {
			image(wronLog, 0, 0);
		}else {
			image(pantallaLog,0,0);
		}*/
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);
		ocultarInputs2();
		cp5.get(Textfield.class,"password2").setVisible(true);
		cp5.get(Textfield.class,"username2").setVisible(true);
		
		
	break;
	case 2://pantalla para registrarse
		image(pantallaReg,0,0);
		if(registrarse==2) {
			image(passWr, 0, 0);
		}else {
			image(pantallaReg,0,0);
		}
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);
	break;
	case 3://pantalla de bienvenida al Usuario
		image(pantallaWel,0,0);
		textFont(font2);
		text("Hi, " + cp5.get(Textfield.class, "name").getText(),157,469);
		ocultarInputs();
		break;
	case 4://pantalla Home -->modeloX
		if(ani1==true) {
			System.out.println("SII");
		image(homeX[contador2], 0, 0);
		if(frameCount %2==0) {
			contador2++;
			if(contador2>93) {
				contador2=93;
			}
		}
		}
		ocultarInputs();
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);
		break;
	case 5://pantalla modeloS
		if(ani2==true) {
		image(homeS[contador3], 0, 0);
		if(frameCount %2==0) {
			contador3++;
			if(contador3>94) {
				contador3=94;
			}
		}
		}
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);

		ocultarInputs();
		break;
	case 6://pantalla modelo3
		if(ani3==true) {
			image(home3[contador4], 0, 0);
			if(frameCount %2==0) {
				contador4++;
				if(contador4>93) {
					contador4=93;
				}
			}
			}
		ocultarInputs();
		break;
case 7://pantalla ordenar mX
		image(orderX, 0, 0);
		for(int i=0;i<carritos.size();i++) {
			if(carritos.get(i) instanceof ModelX ) {
				((ModelX) carritos.get(i)).acomodarCaracteristicas();
			}
		}
		
		ocultarInputs();
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);

		break;
		
	case 8://pantalla ordenar mS
		image(orderS, 0, 0);
		for(int i=0;i<carritos.size();i++) {
			if(carritos.get(i) instanceof ModelS ) {
				((ModelS) carritos.get(i)).acomodarCaracteristicas();
			}
		}
		ocultarInputs();
		break;
		
	case 9://pantalla ordenar m3
		image(order3, 0, 0);
		for(int i=0;i<carritos.size();i++) {
			if(carritos.get(i) instanceof Model3 ) {
				((Model3) carritos.get(i)).acomodarCaracteristicas();
			}
		}
		ocultarInputs();
		break;
		
	case 10://pantalla compararX
		image(compX, 0, 0);
		ocultarInputs();
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);
		break;
		
	case 11://pantalla compararS
		image(compS, 0, 0);
		ocultarInputs();
		break;
		
	case 12://pantalla comparar3
		image(comp3, 0, 0);
		ocultarInputs();
		break;
	case 13://pantalla pagoX
		image(paX, 0, 0);
		ocultarInputs3();
		cp5.get(Textfield.class,"nameCard").setVisible(true);
		cp5.get(Textfield.class,"numberCard").setVisible(true);
		cp5.get(Textfield.class,"cvv").setVisible(true);
		cp5.get(Textfield.class,"mm").setVisible(true);
		cp5.get(Textfield.class,"adress").setVisible(true);
		break;
	
	case 14://pantalla pagoS
		image(paS, 0, 0);
		ocultarInputs3();
		cp5.get(Textfield.class,"nameCard").setVisible(true);
		cp5.get(Textfield.class,"numberCard").setVisible(true);
		cp5.get(Textfield.class,"cvv").setVisible(true);
		cp5.get(Textfield.class,"mm").setVisible(true);
		cp5.get(Textfield.class,"adress").setVisible(true);
		break;
		
	case 15://pantalla pago3
		image(pa3, 0, 0);
		ocultarInputs3();
		cp5.get(Textfield.class,"nameCard").setVisible(true);
		cp5.get(Textfield.class,"numberCard").setVisible(true);
		cp5.get(Textfield.class,"cvv").setVisible(true);
		cp5.get(Textfield.class,"mm").setVisible(true);
		cp5.get(Textfield.class,"adress").setVisible(true);
		break;
	
	case 16://pantalla thxX
		image(thaX, 0, 0);
		textFont(font3);
		text(cp5.get(Textfield.class, "name").getText() + ", your order is confirmed",113,316 );
		ocultarInputs();
		break;
		
	case 17://pantalla thxS
		image(thaS, 0, 0);
		textFont(font3);
		text(cp5.get(Textfield.class, "name").getText() + ", your order is confirmed",113,316 );
		ocultarInputs();
		break;

	case 18://pantalla thx3
		image(tha3, 0, 0);
		textFont(font3);
		text(cp5.get(Textfield.class, "name").getText() + ", your order is confirmed",113,316 );
		ocultarInputs();
		break;
	
	case 19://pantalla grafica X
		
		break;
		
	case 20://pantalla grafica S
		
		break;
		
	case 21://pantalla grafica 3
		
		break;
		
	case 22://pantalla preX
		image(preX, 0, 0);
		textFont(font6);
		text(cp5.get(Textfield.class, "name").getText() ,207,830);
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);

		ocultarInputs();
		break;
		
	case 23://pantalla preS
		image(preS, 0, 0);
		textFont(font6);
		text(cp5.get(Textfield.class, "name").getText() ,205,830);
		ocultarInputs();
		break;
		
	case 24://pantalla pre3
		image(pre3, 0, 0);
		textFont(font6);
		text(cp5.get(Textfield.class, "name").getText() ,20,830);
		ocultarInputs();
		break;
		
	case 25://pantalla historialBlack
		image(ordB, 0, 0);
		if(compraX==true) {
			fill(28,28,28);
			noStroke();
			rect(50,108,314,126);
			//rect(50,78+(contadorCompra * 30),314,126);
			fill(255);
			image(x, 50, 140);
			textFont(font5);
			text("Modelo X",171,149);
			text(cp5.get(Textfield.class, "name").getText() ,173,161);
			text(cp5.get(Textfield.class, "email").getText() ,173,173);
			text(cp5.get(Textfield.class, "adress").getText() ,173,185);
			text("$84,990" ,316,227);	
		}if(compraS==true) {
			fill(28,28,28);
			noStroke();
			rect(50,108,314,126);
			fill(255);
			image(s, 49, 135);
			textFont(font5);
			text("Modelo S",171,149);
			text(cp5.get(Textfield.class, "name").getText() ,173,161);
			text(cp5.get(Textfield.class, "email").getText() ,173,173);
			text(cp5.get(Textfield.class, "adress").getText() ,173,185);
			text("$79,990" ,316,227);
		}if(compra3==true) {
			fill(28,28,28);
			noStroke();
			rect(50,108,314,126);
			fill(255);
			image(tres, 51, 140);
			textFont(font5);
			text("Modelo 3",171,149);
			text(cp5.get(Textfield.class, "name").getText() ,173,161);
			text(cp5.get(Textfield.class, "email").getText() ,173,173);
			text(cp5.get(Textfield.class, "adress").getText() ,173,185);
			text("$39,990" ,316,227);
		}
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);

		ocultarInputs();
		break;
		
	case 26://pantalla historialRed
		image(ordR, 0, 0);
		if(compraX==true) {
			fill(157,20,20);
			noStroke();
			rect(50,108,314,126);
			fill(255);
			image(x, 50, 140);
			textFont(font5);
			text("Modelo X",171,149);
			text(cp5.get(Textfield.class, "name").getText() ,173,161);
			text(cp5.get(Textfield.class, "email").getText() ,173,173);
			text(cp5.get(Textfield.class, "adress").getText() ,173,185);
			text("$84,990" ,316,227);
		}if(compraS==true) {
			fill(157,20,20);
			noStroke();
			rect(50,108,314,126);
			fill(255);
			image(s, 49, 135);
			textFont(font5);
			text("Modelo S",171,149);
			text(cp5.get(Textfield.class, "name").getText() ,173,161);
			text(cp5.get(Textfield.class, "email").getText() ,173,173);
			text(cp5.get(Textfield.class, "adress").getText() ,173,185);
			text("$79,990" ,316,227);
		}if(compra3==true) {
			fill(157,20,20);
			noStroke();
			rect(50,108,314,126);
			fill(255);
			image(tres, 51, 140);
			textFont(font5);
			text("Modelo 3",171,149);
			text(cp5.get(Textfield.class, "name").getText() ,173,161);
			text(cp5.get(Textfield.class, "email").getText() ,173,173);
			text(cp5.get(Textfield.class, "adress").getText() ,173,185);
			text("$39,990" ,316,227);
		}
		ocultarInputs();
		break;
		
	case 27://pantalla historialB2
		image(ordB, 0, 0);
		if(compraX==true) {
			fill(28,28,28);
			noStroke();
			rect(50,108,314,126);
			fill(255);
			image(x, 50, 140);
			textFont(font5);
			text("Modelo X",171,149);
			text(cp5.get(Textfield.class, "name").getText() ,173,161);
			text(cp5.get(Textfield.class, "email").getText() ,173,173);
			text(cp5.get(Textfield.class, "adress").getText() ,173,185);
			text("$84,990" ,316,227);
		}if(compraS==true) {
			fill(28,28,28);
			noStroke();
			rect(50,108,314,126);
			fill(255);
			image(s, 49, 135);
			textFont(font5);
			text("Modelo S",171,149);
			text(cp5.get(Textfield.class, "name").getText() ,173,161);
			text(cp5.get(Textfield.class, "email").getText() ,173,173);
			text(cp5.get(Textfield.class, "adress").getText() ,173,185);
			text("$79,990" ,316,227);
		}if(compra3==true) {
			fill(28,28,28);
			noStroke();
			rect(50,108,314,126);
			fill(255);
			image(tres, 51, 140);
			textFont(font5);
			text("Modelo 3",171,149);
			text(cp5.get(Textfield.class, "name").getText() ,173,161);
			text(cp5.get(Textfield.class, "email").getText() ,173,173);
			text(cp5.get(Textfield.class, "adress").getText() ,173,185);
			text("$39,990" ,316,227);
		}
		ocultarInputs();
		break;
		
	}
}
public void mouseClicked() {
	switch(pantalla) {
	case 0:
		/*cp5.get(Textfield.class,"name").setVisible(false);
		cp5.get(Textfield.class,"username").setVisible(false);
		cp5.get(Textfield.class,"email").setVisible(false);
		cp5.get(Textfield.class,"password").setVisible(false);
		cp5.get(Textfield.class,"confirmPassword").setVisible(false);*/
		if(mouseX>82 && mouseX<145 && mouseY>575 && mouseY<612) {
			pantalla=1;//para pasar al login
			cp5.get(Textfield.class,"username").setVisible(true);
			cp5.get(Textfield.class,"password").setVisible(true);
			
		}else if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=2;//para pasar al register
			mostrarInputs();
		}
		break;
		
	case 1://pantalla login
		logearse();
		if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=0;
			limpiarInputs();
		}
		break;
	case 2://pantalla Register
		getInfoForm();
		if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=0;//para devolver a la pantalla inicial
			registrarse=0;
			
			//metodo para que si el usuario decide devolverse y volver
			//a entrar se encuentren las casillas vacias
			limpiarInputs();
		}if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896 && registrarse==1) {
			pantalla=1;//boton de continuar (al welcome)
		}
		
		break;
	case 3://pantalla bienvenida
		if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=4;//boton para continuar hacia el home (modelX)
			ani1=true;
		}

		break;
	case 4://pantalla Home(modelX)
		if(mouseX>105 && mouseX<310 && mouseY>802 && mouseY<842) {
			pantalla=7;//pantalla de ordenar X
			carritos.add(new ModelX("Long Range", "2.7s 0-60mph", "305 miles", "7 adults", "155 mph", "17''", "20'' or 22''", "$84,990", this, font4));
		}if(mouseX>345 && mouseX<414 && mouseY>370 && mouseY<474) {
			pantalla=5;//para pasar a modelS
			ani2=true;
		}if(mouseX>318 && mouseX<382 && mouseY>18 && mouseY<76) {
			pantalla=22;//pantalla de preX
		}
		
		break;
	case 5://pantalla modelS
		if(mouseX>105 && mouseX<310 && mouseY>802 && mouseY<842) {
			pantalla=8;//pantalla de ordenar S
			carritos.add(new ModelS("Long Range", "2.4s 0-60mph", "348 miles", "5 adults", "163 mph", "17''", "19'' or 21''", "$79,990", this,font4));
			for(int i=0; i<carritos.size();i++) {
			System.out.println(carritos.get(i));
			}
		}if(mouseX>345 && mouseX<414 && mouseY>370 && mouseY<474) {
			pantalla=6;//para pasar a model3
			ani3=true;
		}if(mouseX>0 && mouseX<68 && mouseY>370 && mouseY<474) {
			pantalla=4;//para devolverse a modelX
		}	if(mouseX>318 && mouseX<382 && mouseY>18 && mouseY<76) {
			pantalla=23;//pantalla de preS
		}
		
		break;
	case 6://pantalla model3
		if(mouseX>105 && mouseX<310 && mouseY>802 && mouseY<842) {
			pantalla=9;//pantalla de ordenar3
			carritos.add(new Model3("Long Range", "3.2s 0-60mph", "322 miles", "5 adults", "140 mph", "15''", "18''", "$39,990", this,font4));
		}if(mouseX>0 && mouseX<68 && mouseY>370 && mouseY<474) {
			pantalla=5;//para devolverse a modelS
		}if(mouseX>318 && mouseX<382 && mouseY>18 && mouseY<76) {
			pantalla=24;//pantalla de pre3
		}
		
		break;
	case 7://pantalla ordenarX
		if(mouseX>12 && mouseX<76 && mouseY>12 && mouseY<85) {
			pantalla=4;//devolverse al homeX
		}if(mouseX>116 && mouseX<298 && mouseY>16 && mouseY<72) {
			pantalla=4;//devolverse al homeX
		}if(mouseX>47 && mouseX<182 && mouseY>812 && mouseY<846) {
			pantalla=10;//pantalla compararX
		}if(mouseX>227 && mouseX<362 && mouseY>812 && mouseY<846) {
			pantalla=13;//pantalla pagoX
		}
		break;
		
	case 8: //pantalla ordenarS
		if(mouseX>12 && mouseX<76 && mouseY>12 && mouseY<85) {
			pantalla=5;//devolverse al homeS
		}if(mouseX>116 && mouseX<298 && mouseY>16 && mouseY<72) {
			pantalla=4;//devolverse al homeX
		}if(mouseX>47 && mouseX<182 && mouseY>812 && mouseY<846) {
			pantalla=11;//pantalla compararS
		}if(mouseX>227 && mouseX<362 && mouseY>812 && mouseY<846) {
			pantalla=14;//pantalla pagoS
			//En esta parte me toca sobre escribir los Inputs para poder ajustar los colores a mi interfaz
			//y no tener que crear otros Inputs
			cp5.addTextfield("nameCard")
			.setPosition(50,282)
			.setSize(200,40)
			.setFocus(true)
			.setFont(font)
			.setColor(color(255))
			.setColorBackground(color(138,3,3)) 
			.setAutoClear(false) 
			.setCaptionLabel("")
			.setColorForeground(color(138,3,3,1))
			.setColorActive(color(138,3,3));
			
			cp5.addTextfield("numberCard")
			.setPosition(50,362)
			.setSize(200,40)
			.setFocus(false)
			.setFont(font)
			.setColor(color(255))
			.setColorBackground(color(138,3,3)) 
			.setAutoClear(false) 
			.setCaptionLabel("")
			.setColorForeground(color(138,3,3,1))
			.setColorActive(color(138,3,3));
			
			cp5.addTextfield("cvv")
			.setPosition(50,442)
			.setSize(88,40)
			.setFocus(false)
			.setFont(font)
			.setColor(color(255))
			.setColorBackground(color(138,3,3)) 
			.setAutoClear(false) 
			.setCaptionLabel("")
			.setColorForeground(color(138,3,3,1))
			.setColorActive(color(138,3,3));
			
			cp5.addTextfield("mm")
			.setPosition(181,442)
			.setSize(88,40)
			.setFocus(false)
			.setFont(font)
			.setColor(color(255))
			.setColorBackground(color(138,3,3)) 
			.setAutoClear(false) 
			.setCaptionLabel("")
			.setColorForeground(color(138,3,3,1))
			.setColorActive(color(138,3,3));
			
			cp5.addTextfield("adress")
			.setPosition(50,522)
			.setSize(200,40)
			.setFocus(false)
			.setFont(font)
			.setColor(color(255))
			.setColorBackground(color(138,3,3)) 
			.setAutoClear(false) 
			.setCaptionLabel("")
			.setColorForeground(color(138,3,3,1))
			.setColorActive(color(138,3,3));
		}
		break;
		
	case 9://pantalla ordenar3
		if(mouseX>12 && mouseX<76 && mouseY>12 && mouseY<85) {
			pantalla=6;//devolverse al home3
		}if(mouseX>116 && mouseX<298 && mouseY>16 && mouseY<72) {
			pantalla=4;//devolverse al homeX
		}if(mouseX>47 && mouseX<182 && mouseY>812 && mouseY<846) {
			pantalla=12;//pantalla comparar3
		}if(mouseX>227 && mouseX<362 && mouseY>812 && mouseY<846) {
			pantalla=15;//pantalla pago3
		}
		break;
		
	case 10://pantalla compararX
		if(mouseX>103 && mouseX<312 && mouseY>808 && mouseY<846) {
		pantalla=19;
		}if(mouseX>12 && mouseX<76 && mouseY>12 && mouseY<85 || mouseX>116 && mouseX<298 && mouseY>16 && mouseY<72 ) {
			pantalla=4;
		}
		break;
		
	case 11://pantalla compararS
		if(mouseX>103 && mouseX<312 && mouseY>808 && mouseY<846) {
			pantalla=20;
		}if(mouseX>12 && mouseX<76 && mouseY>12 && mouseY<85) {
				pantalla=8;
			}if(mouseX>116 && mouseX<298 && mouseY>16 && mouseY<72) {
				pantalla=4;
			}
		break;
		
	case 12://pantalla comparar3
		if(mouseX>103 && mouseX<312 && mouseY>808 && mouseY<846) {
			pantalla=21;
			}if(mouseX>12 && mouseX<76 && mouseY>12 && mouseY<85) {
				pantalla=9;
			}if(mouseX>116 && mouseX<298 && mouseY>16 && mouseY<72) {
				pantalla=4;
			}
		break;
		
	case 13://pantalla pagoX
		getInfoTarjeta();
		if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=16;//pantalla de agradecimientoX
			compraX=true;
			contadorCompra++;
			mostrarInputs2();
			limpiarInputs();
			}if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=7;
			limpiarInputs();
			}
		break;
	
	case 14://pantalla pagoS
		getInfoTarjeta();
		if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=17;//pantalla de agradecimientoS
			compraS=true;
			contadorCompra++;
			mostrarInputs2();
			limpiarInputs();
			}if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=8;
			limpiarInputs();
			}
		break;
		
	case 15://pantalla pago3
		getInfoTarjeta();
		if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=18;//pantalla de agradecimientoS
			compra3=true;
			contadorCompra++;
			mostrarInputs2();
			limpiarInputs();
			}if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=7;
			limpiarInputs();
			}
		break;
	
	case 16://pantalla thxX
		if(mouseX>44 && mouseX<200 && mouseY>15 && mouseY<70) {
			pantalla=4;
		}if(mouseX>103 && mouseX<312 && mouseY>778 && mouseY<813) {
			pantalla=4;
			}
		break;
		
	case 17://pantalla thxS
		if(mouseX>44 && mouseX<200 && mouseY>15 && mouseY<70) {
			pantalla=4;
		}if(mouseX>103 && mouseX<312 && mouseY>778 && mouseY<813) {
			pantalla=4;
			}
		break;

	case 18://pantalla thx3
		if(mouseX>44 && mouseX<200 && mouseY>15 && mouseY<70) {
			pantalla=4;
		}if(mouseX>103 && mouseX<312 && mouseY>778 && mouseY<813) {
			pantalla=4;
			}
		break;
	
	case 19://pantalla grafica X
		
		break;
		
	case 20://pantalla grafica S
		
		break;
		
	case 21://pantalla grafica 3
		
		break;
		
	case 22://pantalla preX
		if(mouseX>354 && mouseX<414 && mouseY>10 && mouseY<68) {
			pantalla=4;//pantalla home
		}if(mouseX>130 && mouseX<414 && mouseY>103 && mouseY<163) {
			pantalla=25;//pantalla historialBlack
		}
		break;
		
	case 23://pantalla preS
		if(mouseX>354 && mouseX<414 && mouseY>10 && mouseY<68) {
			pantalla=5;//pantalla home
		}if(mouseX>130 && mouseX<414 && mouseY>103 && mouseY<163) {
			pantalla=26;//pantalla historialRed
		}
		break;
		
	case 24://pantalla pre3
		if(mouseX>354 && mouseX<414 && mouseY>10 && mouseY<68) {
			pantalla=6;//pantalla home
		}if(mouseX>130 && mouseX<414 && mouseY>103 && mouseY<163) {
			pantalla=27;//pantalla historialBlack
		}
		break;
		
	case 25://pantalla historialBlack
		if(mouseX>10 && mouseX<82 && mouseY>10 && mouseY<82) {
			pantalla=22;//pantalla preX
		}
		break;
		
	case 26://pantalla historialRed
		if(mouseX>10 && mouseX<82 && mouseY>10 && mouseY<82) {
			pantalla=23;//pantalla preS
		}
		break;
		
	case 27://pantalla2 historialB
		if(mouseX>10 && mouseX<82 && mouseY>10 && mouseY<82) {
			pantalla=24;//pantalla pre3
		}
		break;
	
}
	
}
public void cargaImagenes() {
	pantalla1=loadImage("images/pantallaPrimera.png");
	pantallaReg=loadImage("images/pantallaRegister.png");
	pantallaLog=loadImage("images/pantallaLogIn.png");
	pantallaWel=loadImage("images/pantallaWelcome.png");
	pantallaMx=loadImage("images/modelx.png");
	pantallaMs=loadImage("images/models.png");
	pantallaM3=loadImage("images/model3.png");
	orderX=loadImage("images/orderX.png");
	orderS=loadImage("images/orderS.png");
	order3=loadImage("images/order3.png");
	compX=loadImage("images/compareX.png");
	compS=loadImage("images/compareS.png");
	comp3=loadImage("images/compare3.png");
	paX=loadImage("images/payX.png");
	paS=loadImage("images/payS.png");
	pa3=loadImage("images/pay3.png");
	thaX=loadImage("images/thankX.png");
	thaS=loadImage("images/thankS.png");
	tha3=loadImage("images/thank3.png");
	passWr=loadImage("images/pantallaWrong.png");
	wronLog=loadImage("images/wrongLog.png");
	preX=loadImage("images/preX.png");
	preS=loadImage("images/preS.png");
	pre3=loadImage("images/pre3.png");
	ordB=loadImage("images/orderB.png");
	ordR=loadImage("images/orderR.png");
	x=loadImage("images/x.png");
	s=loadImage("images/s.png");
	tres=loadImage("images/3.png");
	
	
	//for para recargar las animaciones
	for(int i=1;i<71;i++) {
		intro[i]=loadImage("introVi/scene1"+" "+"("+i+").jpg");
	}
	
	for(int i=1;i<95;i++) {
		homeX[i]=loadImage("mX/scene"+" "+"("+i+").jpg");
	}
	
	for(int i=1;i<96;i++) {
		homeS[i]=loadImage("mS/scen"+" "+"("+i+").jpg");
	}
	
	for(int i=1;i<96;i++) {
		home3[i]=loadImage("m3/sce"+" "+"("+i+").jpg");
	}
}
public void mostrarInputs() {
	cp5.get(Textfield.class,"name").setVisible(true);
	cp5.get(Textfield.class,"username").setVisible(true);
	cp5.get(Textfield.class,"email").setVisible(true);
	cp5.get(Textfield.class,"password").setVisible(true);
	cp5.get(Textfield.class,"confirmPassword").setVisible(true);
}
public void mostrarInputs2() {
	cp5.get(Textfield.class,"nameCard").setVisible(true);
	cp5.get(Textfield.class,"numberCard").setVisible(true);
	cp5.get(Textfield.class,"cvv").setVisible(true);
	cp5.get(Textfield.class,"mm").setVisible(true);
	cp5.get(Textfield.class,"adress").setVisible(true);
}
public void ocultarInputs() {
	cp5.get(Textfield.class,"name").setVisible(false);
	cp5.get(Textfield.class,"username").setVisible(false);
	cp5.get(Textfield.class,"email").setVisible(false);
	cp5.get(Textfield.class,"password").setVisible(false);
	cp5.get(Textfield.class,"confirmPassword").setVisible(false);
	cp5.get(Textfield.class,"username2").setVisible(false);
	cp5.get(Textfield.class,"password2").setVisible(false);
	cp5.get(Textfield.class,"nameCard").setVisible(false);
	cp5.get(Textfield.class,"numberCard").setVisible(false);
	cp5.get(Textfield.class,"cvv").setVisible(false);
	cp5.get(Textfield.class,"mm").setVisible(false);
	cp5.get(Textfield.class,"adress").setVisible(false);
}
public void ocultarInputs2() {
	cp5.get(Textfield.class,"name").setVisible(false);
	cp5.get(Textfield.class,"username").setVisible(false);
	cp5.get(Textfield.class,"email").setVisible(false);
	cp5.get(Textfield.class,"password").setVisible(false);
	cp5.get(Textfield.class,"confirmPassword").setVisible(false);
	cp5.get(Textfield.class,"nameCard").setVisible(false);
	cp5.get(Textfield.class,"numberCard").setVisible(false);
	cp5.get(Textfield.class,"cvv").setVisible(false);
	cp5.get(Textfield.class,"mm").setVisible(false);
	cp5.get(Textfield.class,"adress").setVisible(false);
}
public void ocultarInputs3() {
	cp5.get(Textfield.class,"name").setVisible(false);
	cp5.get(Textfield.class,"username").setVisible(false);
	cp5.get(Textfield.class,"email").setVisible(false);
	cp5.get(Textfield.class,"password").setVisible(false);
	cp5.get(Textfield.class,"confirmPassword").setVisible(false);
	cp5.get(Textfield.class,"username2").setVisible(false);
	cp5.get(Textfield.class,"password2").setVisible(false);
}
public void limpiarInputs() {
	cp5.get(Textfield.class,"name").clear();
	cp5.get(Textfield.class,"username").clear();
	cp5.get(Textfield.class,"email").clear();
	cp5.get(Textfield.class,"password").clear();
	cp5.get(Textfield.class,"confirmPassword").clear();
	cp5.get(Textfield.class,"username2").clear();
	cp5.get(Textfield.class,"password2").clear();
	cp5.get(Textfield.class,"nameCard").clear();
	cp5.get(Textfield.class,"numberCard").clear();
	cp5.get(Textfield.class,"cvv").clear();
	cp5.get(Textfield.class,"mm").clear();
	cp5.get(Textfield.class,"adress").clear();
}
public void cargaP5() {
	
	//inicializacion librerias
	
	cp5 = new ControlP5(this);
	cp5.addTextfield("name")
	.setPosition(50,282)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorForeground(color(38,38,38,1))
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("username")
	.setPosition(50,362)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorForeground(color(38,38,38,1))
	.setColorActive(color(38,38,38,1));
	
	cp5.addTextfield("email")
	.setPosition(50,442)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorForeground(color(38,38,38,1))
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("password")
	.setPosition(50,522)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setPasswordMode(true) 
	.setColorForeground(color(38,38,38,1))
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("confirmPassword")
	.setPosition(50,602)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setPasswordMode(true) 
	.setColorForeground(color(38,38,38,1))
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("username2")
	.setPosition(50,282)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorForeground(color(38,38,38,1))
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("password2")
	.setPosition(50,362)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setPasswordMode(true) 
	.setColorForeground(color(38,38,38,1))
	.setColorActive(color(38,38,38));
	
	
	//Inputs de la tarjeta
	cp5.addTextfield("nameCard")
	.setPosition(50,282)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorForeground(color(38,38,38,1))
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("numberCard")
	.setPosition(50,362)
	.setSize(188,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorForeground(color(38,38,38,1))
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("cvv")
	.setPosition(50,442)
	.setSize(88,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("") 
	.setColorForeground(color(38,38,38,1))
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("mm")
	.setPosition(181,442)
	.setSize(88,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorForeground(color(38,38,38,1))
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("adress")
	.setPosition(50,522)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorForeground(color(38,38,38,1))
	.setColorActive(color(38,38,38));
	
	//botones
	/*cp5.addBang("submit")
	.setPosition(0,817)
	.setColorBackground(color(255,255,255,1))
	.setColorActive(color(255,255,255,1))
	.setColorValue(color(255,255,255,1))
	.setColorForeground(color(0,0,0,30))
	.setSize(414,79);*/
}


public void getInfoForm() {
	if (mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
		na = cp5.get(Textfield.class, "name").getText();
		ensayo [0] = na;
		Use = cp5.get(Textfield.class, "username").getText();
		ensayo [1] = Use;
		ema = cp5.get(Textfield.class, "email").getText();
		ensayo[2] = ema;
		pass = cp5.get(Textfield.class, "password").getText();
		ensayo[3] = pass;
		copass = cp5.get(Textfield.class, "confirmPassword").getText();
		ensayo[4] = copass;
		
		/*System.out.println(ensayo[0]+"epa1");
		System.out.println(ensayo[1]+"epa2");
		System.out.println(ensayo[2]+"epa3");
		System.out.println(ensayo[3]+"epa4");
		System.out.println(ensayo[4]+"epa5");*/
		
		if(pass.equals(copass)) {
		usu.add(new Usuario(na,Use,ema,pass));
		registrarse=1;
		}else {
			registrarse=2;
			System.out.println("mala");
		}
		for (int i = 0; i < usu.size(); i++) {
			System.out.println(usu.get(i).getName()+" nombre");
			System.out.println(usu.get(i).getUsername()+" user");
			System.out.println(usu.get(i).getEmail()+" email");
			System.out.println(usu.get(i).getPassword()+" pass");
		}
		 
				
	}
}

public void getInfoTarjeta() {
	if (mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
		nC = cp5.get(Textfield.class, "nameCard").getText();
		tarjeta [0] = nC;
		nnC = cp5.get(Textfield.class, "numberCard").getText();
		tarjeta [1] = nnC;
		cv = cp5.get(Textfield.class, "cvv").getText();
		tarjeta[2] = cv;
		m = cp5.get(Textfield.class, "mm").getText();
		tarjeta[3] = m;
		adre = cp5.get(Textfield.class, "adress").getText();
		tarjeta[4] = adre;
		
		/*System.out.println(tarjeta[0]+"epa1");
		System.out.println(tarjeta[1]+"epa2");
		System.out.println(tarjeta[2]+"epa3");
		System.out.println(tarjeta[3]+"epa4");
		System.out.println(tarjeta[4]+"epa5");*/
		
		for(int i = 0; i < usu.size(); i++) {
			usu.get(i).registroTarjeta(nC, nnC, cv, m, adre);
		}
		/*for (int i = 0; i < usu.size(); i++) {
			System.out.println(usu.get(i).getTarjetaCredito());
			
}*/
	}
}
public void logearse() { 
	System.out.println(cp5.get(Textfield.class, "username2").getText()+" nf");
	if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
	if(cp5.get(Textfield.class, "username2").getText().equals(Use) && cp5.get(Textfield.class, "password2").getText().equals(pass)) {
		
		System.out.println("entro");
		pantalla=3;
		/*veriLog=1;
		}
	}else {
		veriLog=2;	
	}*/
	} 
	}
}


}


