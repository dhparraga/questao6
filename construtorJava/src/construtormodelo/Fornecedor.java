package construtormodelo;

public class Fornecedor extends FuncionatioAbstract {
	
	private String nome_fantasia; 
	private String website; 

	public Fornecedor() {
		// TODO Auto-generated constructor stub
	}
	
	public Fornecedor(String nomeFantasia, String website) {
		this.nome_fantasia = nomeFantasia;
		this.website = website; 
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	
	

}
