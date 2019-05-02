package main;

public abstract class TemplateEnvioEmail {
	
	public void enviarEmail() {
		formarCabecera();
		formarCuerpo();
		prepararDestinatariosYRemitentes();
		enviar();
	}
	
	protected abstract void formarCabecera();
	protected abstract void formarCuerpo();
	protected abstract void prepararDestinatariosYRemitentes();
	protected abstract void enviar();
	

}
