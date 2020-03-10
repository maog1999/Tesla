package teslaApp;

public  class Usuario {
	private String name,username,email,password; 
	private Tarjeta tarjetaCredito;	
	public Usuario(String Name, String Username, String Email,String Password) {
		name = Name;
		username = Username;
		email = Email;
		password = Password;
	}
	
	public void registroTarjeta (String NombreT,String NumeroT,String CVV,String Mmyy,String Adress) {
		tarjetaCredito = new Tarjeta(NombreT, NumeroT, CVV, Mmyy, Adress);
	}

	public Tarjeta getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(Tarjeta tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
