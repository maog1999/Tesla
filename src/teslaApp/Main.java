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

//variables botones
boolean boton1 = false;
private PFont font;
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
		getInfoForm();
		if(mouseX>82 && mouseX<145 && mouseY>575 && mouseY<612) {
			pantalla=1;//para pasar al login
			//cp5.get(Textfield.class,"name").setVisible(false);
		}else if(mouseX>0 && mouseX<414 && mouseY>817 && mouseY<896) {
			pantalla=2;//para pasar al register
		}
		
	case 1:
		if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=0;
			//cp5.get(Textfield.class,"name").setVisible(true);
		//	cp5.get(Textfield.class,"name").clear();
		}
	case 2:
		if(mouseX>36 && mouseX<75 && mouseY>16 && mouseY<66) {
			pantalla=0;
		}
		
	
}
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
	.setPosition(50,100)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("username")
	.setPosition(50,200)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("email")
	.setPosition(50,300)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("password")
	.setPosition(50,400)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
	.setColorActive(color(38,38,38));
	
	cp5.addTextfield("confirmPassword")
	.setPosition(50,500)
	.setSize(200,40)
	.setFocus(true)
	.setFont(font)
	.setColor(color(255))
	.setColorBackground(color(38,38,38)) 
	.setAutoClear(false) 
	.setCaptionLabel("")
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
/*public void input (String Thetext) {
	ensayo[0] = Thetext;
	//System.out.println("entro : "+Thetext);
	System.out.println(ensayo[0]+"ay papi");
}*/

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
		
		//if(pass.equals(copass)) {
		usu.add(new Usuario(na,Use,ema,pass));
	//	}
		for (int i = 0; i < usu.size(); i++) {
			System.out.println(usu.get(i).getName()+"nombre");
			System.out.println(usu.get(i).getUsername()+"user");
			System.out.println(usu.get(i).getEmail()+"email");
			System.out.println(usu.get(i).getPassword()+"pass");
		}
		 
				
		/*confirmPassword = cp5.get(Textfield.class, "confirmPassword").getText();
		email = cp5.get(Textfield.class, "email").getText();*/
		
		//Esto valida que un string sea igual a otro
		/*if(password.equals(confirmPassword)) {
			userRegisController.getInfoForm(username,password,confirmPassword,email);
}*/
	}
}

}


