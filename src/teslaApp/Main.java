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
PImage [] intro;
String textValue = "";
String registro;
String na;
String Use;
String ema;
String pass;
String copass;

int pantalla ;

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


//variables botones
int registrarse;
int veriLog=0;
private PFont font;
/*boolean
boolean
*/

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
public void settings() {
	size(414,896);
}

public void setup() {
	pantalla = 0;
	ensayo = new String [5];
	
	//arreglo
	ensayo[0] = "name";
	ensayo[1] = "username";
	ensayo[2] = "email";
	ensayo[3] = "password";
	ensayo[4] = "confirmPassword";
	
	/*for(int i=1;i<73;i++) {
		intro[i]=loadImage("introVi/scene1 ("+i+").jpg");
	}*/
	
	font = createFont("Roboto-Regular.tff", 20);
	
	//arreglos de informacion
	usu = new ArrayList <Usuario>();
	
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
		image(pantalla1, 0, 0);
		ocultarInputs();
		
	break;
	case 1://pantalla de logearse
		image(pantallaLog,0,0);
		if(veriLog==2) {
			image(wronLog, 0, 0);
		}else {
			image(pantallaLog,0,0);
		}
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
		ocultarInputs();
		break;
	case 4://pantalla Home -->modeloX
		image(pantallaMx, -4, 0);
		ocultarInputs();
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);
		break;
	case 5://pantalla modeloS
		image(pantallaMs, 0, 0);
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);

		ocultarInputs();
		break;
	case 6://pantalla modelo3
		image(pantallaM3, 0, 0);
		ocultarInputs();
		break;
case 7://pantalla ordenar mX
		image(orderX, 0, 0);
		ocultarInputs();
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);

		break;
		
	case 8://pantalla ordenar mS
		image(orderS, 0, 0);
		ocultarInputs();
		break;
		
	case 9://pantalla ordenar m3
		image(order3, 0, 0);
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
		ocultarInputs();
		break;
	
	case 14://pantalla pagoS
		image(paS, 0, 0);
		ocultarInputs();
		break;
		
	case 15://pantalla pago3
		image(pa3, 0, 0);
		ocultarInputs();
		break;
	
	case 16://pantalla thxX
		image(thaX, 0, 0);
		ocultarInputs();
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);
		break;
		
	case 17://pantalla thxS
		image(thaS, 0, 0);
		ocultarInputs();
		break;

	case 18://pantalla thx3
		image(tha3, 0, 0);
		ocultarInputs();
		break;
	
	case 19://pantalla grafica X
		
		break;
		
	case 20://pantalla grafica S
		
		break;
		
	case 21://pantalla grafica 3
		
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
	case 3:
		if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=4;//boton para continuar hacia el home (modelX)
		}

		break;
	case 4://pantalla Home(modelX)
		if(mouseX>105 && mouseX<310 && mouseY>802 && mouseY<842) {
			pantalla=7;//pantalla de ordenar X
		}if(mouseX>345 && mouseX<414 && mouseY>370 && mouseY<474) {
			pantalla=5;//para pasar a modelS
			
		}
		
		break;
	case 5://pantalla modelS
		if(mouseX>105 && mouseX<310 && mouseY>802 && mouseY<842) {
			pantalla=8;//pantalla de ordenar S
		}if(mouseX>345 && mouseX<414 && mouseY>370 && mouseY<474) {
			pantalla=6;//para pasar a model3
		}if(mouseX>0 && mouseX<68 && mouseY>370 && mouseY<474) {
			pantalla=4;//para devolverse a modelX
		}
		
		break;
	case 6://pantalla model3
		if(mouseX>105 && mouseX<310 && mouseY>802 && mouseY<842) {
			pantalla=9;//pantalla de ordenar3
		}if(mouseX>0 && mouseX<68 && mouseY>370 && mouseY<474) {
			pantalla=5;//para devolverse a modelS
			
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
		if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=16;
			}if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=7;
			}
		break;
	
	case 14://pantalla pagoS
		if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=17;
			}if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=8;
			}
		break;
		
	case 15://pantalla pago3
		if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=16;
			}if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=7;
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
}
public void mostrarInputs() {
	cp5.get(Textfield.class,"name").setVisible(true);
	cp5.get(Textfield.class,"username").setVisible(true);
	cp5.get(Textfield.class,"email").setVisible(true);
	cp5.get(Textfield.class,"password").setVisible(true);
	cp5.get(Textfield.class,"confirmPassword").setVisible(true);
}
public void ocultarInputs() {
	cp5.get(Textfield.class,"name").setVisible(false);
	cp5.get(Textfield.class,"username").setVisible(false);
	cp5.get(Textfield.class,"email").setVisible(false);
	cp5.get(Textfield.class,"password").setVisible(false);
	cp5.get(Textfield.class,"confirmPassword").setVisible(false);
	cp5.get(Textfield.class,"username2").setVisible(false);
	cp5.get(Textfield.class,"password2").setVisible(false);
}
public void ocultarInputs2() {
	cp5.get(Textfield.class,"name").setVisible(false);
	cp5.get(Textfield.class,"username").setVisible(false);
	cp5.get(Textfield.class,"email").setVisible(false);
	cp5.get(Textfield.class,"password").setVisible(false);
	cp5.get(Textfield.class,"confirmPassword").setVisible(false);
}
public void limpiarInputs() {
	cp5.get(Textfield.class,"name").clear();
	cp5.get(Textfield.class,"username").clear();
	cp5.get(Textfield.class,"email").clear();
	cp5.get(Textfield.class,"password").clear();
	cp5.get(Textfield.class,"confirmPassword").clear();
}
public void cargaP5() {
	
	//inicializacion librerias
	
	/*for (int i = 0; i < ensayo.length; i++) {
	cp5 = new ControlP5(this);
	cp5.addTextfield(ensayo[i])
	.setPosition(51,280+(i*80))
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorActive(color(38,38,38));
	System.out.println(ensayo[i]);
	}*/
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
	.setColorActive(color(38,38,38));
	
	
	
	cp5.addTextfield("email")
	.setPosition(50,442)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
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
	.setColorActive(color(38,38,38));
	
	
	//botones
	cp5.addBang("submit")
	.setPosition(0,817)
	.setColorBackground(color(255,255,255,1))
	.setColorActive(color(255,255,255,1))
	.setColorValue(color(255,255,255,1))
	.setColorForeground(color(0,0,0,30))
	.setSize(414,79);
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
public void logearse() {
	if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
		if(mouseX>0 && mouseX<414 && mouseY>0 && mouseY<896) {
			veriLog=1;}
	if(cp5.get(Textfield.class, "username2").getText().equals(Use) && cp5.get(Textfield.class, "password2").getText().equals(pass)) {
		
		System.out.println("entro");
		pantalla=3;
		}
	}else {
		veriLog=2;	
	}
	}

public void infoTarjeta() {
	
}


}


