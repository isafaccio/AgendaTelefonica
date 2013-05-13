/**
* @Autor Isa Faccio
*/
public class AgendaTelefonica {
	public static void main(String[]args) {
		Cliente carlos;
		carlos = new Cliente();
		carlos.nome="Henrique Agilio";
		carlos.email="crl.henriq@gmail.com";
		carlos.endereco="rua dos mamoeiros, 754 W - Jardim Primavera";
		carlos.telefone[0]=99772629;
		carlos.telefone[1]=33081214;
		carlos.telefone[2]=33251548;
		
		Cliente jaque;
		jaque = new Cliente();
		jaque.nome="Jaqueline Moreira";
		jaque.email="jaque_fofa@hotmail.com";
		jaque.endereco="rua dos amores, 321 N - Centro";
		jaque.telefone[0]=99546325;
		jaque.telefone[1]=33082524;
		jaque.telefone[2]=33365895;
		
		Cliente mauro;
		mauro = new Cliente();
		mauro.nome="Mauro Screer";
		mauro.email="Mauro.Stillys@yahoo.com.br";
		mauro.endereco="Avenida dos uirapurus, 548 W - Residencial das Orquideas";
		mauro.telefone[0]=99749856;
		mauro.telefone[1]=33082526;
		mauro.telefone[2]=33215448;
		
					
		System.out.println("Antes do Método");
		System.out.println("---------------");
		System.out.println("Cliente 001 = "+carlos.nome+"\n endereço = "+carlos.endereco+"\n e-mail = "+carlos.email+
				"\n telefones para contato = "+carlos.telefone[0]+", "+carlos.telefone[1]+", "+carlos.telefone[2]);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Cliente 002 = "+jaque.nome+"\n endereço = "+jaque.endereco+"\n e-mail = "+jaque.email+
				"\n telefones para contato = "+jaque.telefone[0]+", "+jaque.telefone[1]+", "+jaque.telefone[2]);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Cliente 003 = "+mauro.nome+"\n endereço = "+mauro.endereco+"\n e-mail = "+mauro.email+
				"\n telefones para contato = "+mauro.telefone[0]+", "+mauro.telefone[1]+", "+mauro.telefone[2]);
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("_______________________________________________________________________");
		
		int i = 0;
		while (i<2) {
		mauro.telefone[i]=jaque.telefone[i];
		i++;
		}
		jaque.telefone[0]=carlos.telefone[0];		
									
		System.out.println("Depois do Método");
		System.out.println("----------------");
		System.out.println("Cliente 001 = "+carlos.nome+"\n endereço = "+carlos.endereco+"\n e-mail = "+carlos.email+
				"\n telefones para contato = "+carlos.telefone[0]+", "+carlos.telefone[1]+", "+carlos.telefone[2]);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Cliente 002 = "+jaque.nome+"\n endereço = "+jaque.endereco+"\n e-mail = "+jaque.email+
				"\n telefones para contato = "+jaque.telefone[0]+", "+jaque.telefone[1]+", "+jaque.telefone[2]);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Cliente 003 = "+mauro.nome+"\n endereço = "+mauro.endereco+"\n e-mail = "+mauro.email+
				"\n telefones para contato = "+mauro.telefone[0]+", "+mauro.telefone[1]+", "+mauro.telefone[2]);
		System.out.println("-------------------------------------------------------------------");
		
	}
}
