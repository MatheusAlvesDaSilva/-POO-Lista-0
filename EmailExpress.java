package exerciciovp1;

import java.util.ArrayList;

public class EmailExpress {
	
	public String meuEmail;
	public MensagemDeEmail[] emailsNovos;
	public ArrayList<String> emailsAmigos;
	public ArrayList<MensagemDeEmail> caixaDeSaida;
	
public void listarEmailsRecentes(){
	
	System.out.println("Apresentando as mensagens mais recentes da caixa postal do emai" + meuEmail );

	
	int Total = emailsNovos.length;
		
	System.out.println("A quatidade de Mensagens de Recentes é: " + Total );
	
		

}

public boolean escreverEmail(String email,String assunto,String mensagem){
	
	if ( email == null ){		
		System.out.println("O email de destino deve ser preenchido corretamente");
	}
	
return true;	

}

}
