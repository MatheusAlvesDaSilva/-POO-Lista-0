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
		if(emailDoRemetente != null && !emailDoRemetente.equals("")){
		this.emailDoRemetente = emailDoRemetente;
	    }
	}
	
	public void setEmailDoDestinatario(String emailDoDestinatario){
		if(emailDoDestinatario != null && !emailDoDestinatario.equals("")){
		this.emailDoRemetente = emailDoDestinatario;
		}
	}
}
