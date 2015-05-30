package Tema9_3;

/**
 * 
 * @author Javier Bravo, Miguel Ángel y Manuel
 *
 */
public class ModeloImp implements Modelo {
	private VistaLogin vistaLog;
	private VistaSign_In vistaSign;
	private VistaWelcome vistaWel;
	private String usu, passwd, nick, mail, pass, passRep;

	@Override
	public void setVista(VistaLogin vistaLog) {
		this.vistaLog = vistaLog;
	}

	@Override
	public void setVistaSign(VistaSign_In vistaSign) {
		this.vistaSign = vistaSign;
	}

	@Override
	public void setVistaWel(VistaWelcome vistaWel) {
		this.vistaWel = vistaWel;
	}

	@Override
	public void setUserPwd(String usuario, String password) {
		this.usu = usuario;
		this.passwd = password;
	}

	public void setSign(String usuario, String correo, String password,
			String passwordRep) {
		this.nick = usuario;
		this.mail = correo;
		this.pass = password;
		this.passRep = passwordRep;
		this.passwd = password;
	}

	@Override
	public boolean Login() {
		if (this.usu.isEmpty() || this.passwd.isEmpty()) {
			return false;
		} else
			return false;
	}

	@Override
	public boolean Sign() {
		if (this.nick.isEmpty() && this.pass.isEmpty()
				&& this.passRep.isEmpty() && this.mail.isEmpty()) {
			return false;
		} else if (this.mail.contains("@") && this.mail.contains(".")) {
			return true;
		} else if (!this.pass.equals(passRep)) {
			return false;
		}

		return true;
	}

}
