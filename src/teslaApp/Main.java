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

//variables botones
boolean boton1 = false;
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
	
	font = createFont("Roboto-Regular.tff", 20);
	
	//arreglos de informacion
	usu = new ArrayList <Usuario>();
	
	//espacio para cargar todas las imagenes de la app
	pantalla1=loadImage("images/pantallaPrimera.png");
	pantallaReg=loadImage("images/pantallaRegister.png");
	pantallaLog=loadImage("images/pantallaLogIn.png");
	pantallaWel=loadImage("images/pantallaWelcome.png");
	pantallaMx=loadImage("images/modelx.png");
	pantallaMs=loadImage("images/models.png");
	pantallaM3=loadImage("images/model3.png");
	
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
		image(pantalla1,0,0);
		ocultarInputs();
		
	break;
	case 1://pantalla de logearse
		image(pantallaLog,0,0);
		text("X: "+mouseX+ " Y: "+mouseY,mouseX,mouseY);
		
	break;
	case 2://pantalla para registrarse
		image(pantallaReg,0,0);
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
		
	case 1:
		if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=0;
			limpiarInputs();
		}
		break;
	case 2:
		if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=0;//para devolver a la pantalla inicial
			
			//metodo para que si el usuario decide devolverse y volver
			//a entrar se encuentren las casillas vacias
			limpiarInputs();
		}if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			
			pantalla=3;//boton de continuar (al welcome)
		}
		break;
	case 3:
		if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=4;//boton para continuar hacia el home (modelX)
		}

		break;
	case 4://pantalla Home(modelX)
		if(mouseX>105 && mouseX<310 && mouseY>802 && mouseY<842) {
			
		}if(mouseX>345 && mouseX<414 && mouseY>370 && mouseY<474) {
			pantalla=5;//para pasar a modelS
			
		}
		
		break;
	case 5://pantalla modelS
		if(mouseX>105 && mouseX<310 && mouseY>802 && mouseY<842) {
			
		}if(mouseX>345 && mouseX<414 && mouseY>370 && mouseY<474) {
			pantalla=6;//para pasar a model3
		}if(mouseX>0 && mouseX<68 && mouseY>370 && mouseY<474) {
			pantalla=4;//para devolverse a modelX
		}
		
		break;
	case 6://pantalla model3
		if(mouseX>105 && mouseX<310 && mouseY>802 && mouseY<842) {
			
		}if(mouseX>0 && mouseX<68 && mouseY>370 && mouseY<474) {
			pantalla=5;//para devolverse a modelS
			
		}
		
		break;
		
	
}
	getInfoForm();
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
	
	//botones
	cp5.addBang("submit")
	.setPosition(0,817)
	.setColorBackground(color(255,255,255,1))
	.setColorActive(color(255,255,255,1))
	.setColorValue(color(255,255,255,1))
	.setColorForeground(color(0,0,0,30))
	.setSize(414,79);
}

/*public void submit() {
	registro=cp5.get(Textfield.class,"input").getText();
	ensayo[1]=registro;
	System.out.println(ensayo[1]);
			}*/
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
		}
		for (int i = 0; i < usu.size(); i++) {
			System.out.println(usu.get(i).getName()+"nombre");
			System.out.println(usu.get(i).getUsername()+"user");
			System.out.println(usu.get(i).getEmail()+"email");
			System.out.println(usu.get(i).getPassword()+"pass");
		}
		 
				
	}
}

}


