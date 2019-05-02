package main;

public class EnvioEmailPublicidad extends TemplateEnvioEmail {

	@Override
	protected void formarCabecera() {
		System.out.println("formando cabecera Email Publicidad");
	}

	@Override
	protected void formarCuerpo() {
		System.out.println("formando cuerpo Email Publicidad");
	}

	@Override
	protected void prepararDestinatariosYRemitentes() {
		System.out.println("preparar Destinatarios y Remitentes Email Publicidad");
	}

	@Override
	protected void enviar() {
		System.out.println("enviando Email Publicidad");
	}

}
