package Tema9_3;

/**
 * 
 * @author Javier Bravo, Miguel �ngel y Manuel
 *
 */
public interface Modelo {
	public void setVista(VistaLogin vistaLog);

	public void setVistaSign(VistaSign_In vistaSign);

	public void setVistaWel(VistaWelcome vistaWel);

	public void setUserPwd(String usuario, String password);

	public boolean Login();

	public boolean Sign();

	public void setSign(String user, String mail, String pass, String passRep);

}
