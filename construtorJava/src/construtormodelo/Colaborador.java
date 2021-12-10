package construtormodelo;

public class Colaborador extends FuncionatioAbstract {
	
	private String cargo; 
	private String funcao; 

	public Colaborador() {
		
	}
	
	public Colaborador(String cargo, String funcao) {
		this.cargo = cargo; 
		this.funcao = funcao; 
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
	

}
