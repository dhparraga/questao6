package construtormodelo;

public class Associado extends FuncionatioAbstract {
	
	private String situacao; 
	private Integer numeroAssociado;
	
	public Associado() {
		super(); 
	}
	
	public Associado(String situacao, Integer numeroAssociado) {
		super();
		this.situacao = situacao; 
		this.numeroAssociado = numeroAssociado;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Integer getNumeroAssociado() {
		return numeroAssociado;
	}

	public void setNumeroAssociado(Integer numeroAssociado) {
		this.numeroAssociado = numeroAssociado;
	} 
	
	
	
	

}
