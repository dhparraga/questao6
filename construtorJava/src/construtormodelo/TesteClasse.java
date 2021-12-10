package construtormodelo;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TesteClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Associado associadoJr = new Associado(); 
		Colaborador  colaboradorJr  = new Colaborador(); 
		Fornecedor fornecedorJr = new Fornecedor();
		
		
		associadoJr.setNome("Teste_Daniel");
		colaboradorJr.setCidade("Cidade do Colaborador : Cuiabá-MT");
		fornecedorJr.setCpf_cnpj("CPNJ Fornecedor: 09.123.213.213./0000");
		
		
		System.out.println(associadoJr.getNome());
		System.out.println(colaboradorJr.getCidade());
		System.out.println(fornecedorJr.getCpf_cnpj());

	}

}
