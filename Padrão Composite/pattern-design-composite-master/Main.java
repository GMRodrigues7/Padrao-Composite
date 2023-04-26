
public class Main {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente("Guilherme Rodrigues");
	    Funcionario atendente = new Atendente("Phellipe Duarte");
	    Funcionario caixa = new Caixa("Natan Fernandes");
	        
	    gerente.adicionar(atendente);
	    gerente.printNomeDoFuncionario();
	    gerente.adicionar(caixa);
	    gerente.printNomeDoFuncionario();
	    gerente.remover(atendente);
	}
}
