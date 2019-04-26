package view;
import model.Pessoa;
public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa= new Pessoa();
		pessoa.setNome("Leonardo");
		pessoa.setEndereco("Rua massato sakai");
		pessoa.setBairro("Jd Triangulo");
		pessoa.setCep(18538300);
		pessoa.setCidade("Ferraz de Vasconcellos");
		pessoa.setEstado("São Paulo");
		System.out.println(pessoa.getNome()+"\n"+pessoa.getEndereco()+"\n"+pessoa.getBairro()+"\n"+pessoa.getCep()
									+"\n"+pessoa.getCidade()+"\n"+pessoa.getEstado()+"\n"+pessoa.getNome()+"\n");
	}

}
