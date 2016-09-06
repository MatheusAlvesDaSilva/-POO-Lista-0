package exerciciovp1;

public class MensagemDeEmail {

	private String emailDoRemetente;
	private String emailDoDestinatario;
	public String mensagem;
	public String assunto;
	
	
	public String getEmailDoRemetente(){
		return emailDoRemetente;
	}
	
	public String getEmailDoDestinatario(){
		return emailDoDestinatario;
	}
	
	public void setEmailDoRemetente(String emailDoRemetente){
		this.emailDoRemetente = emailDoRemetente;
	}
	
	public void setEmailDoDestinatario(String emailDoDestinatario){
		this.emailDoRemetente = emailDoDestinatario;
	}
}
