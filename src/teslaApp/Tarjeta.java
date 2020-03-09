package teslaApp;

public class Tarjeta {
	private String nombreT,numeroT,cvv,mmyy,adress;
	
public Tarjeta(String NombreT,String NumeroT,String CVV,String Mmyy,String Adress) {
	nombreT = NombreT;
	numeroT = NumeroT;
	cvv = CVV;
	mmyy = Mmyy;
	adress = Adress;
}

public String getNombreT() {
	return nombreT;
}

public void setNombreT(String nombreT) {
	this.nombreT = nombreT;
}

public String getNumeroT() {
	return numeroT;
}

public void setNumeroT(String numeroT) {
	this.numeroT = numeroT;
}

public String getCvv() {
	return cvv;
}

public void setCvv(String cvv) {
	this.cvv = cvv;
}

public String getMmyy() {
	return mmyy;
}

public void setMmyy(String mmyy) {
	this.mmyy = mmyy;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

}
