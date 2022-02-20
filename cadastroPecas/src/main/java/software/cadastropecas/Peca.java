package software.cadastropecas;
/**
 *
 * @author vinic
 */
public abstract class Peca {
	protected String nome;
	protected Integer codigo;
	protected Integer quantidade;
	protected Float valor;
	
	public Peca(String nome, Integer codigo, Integer quantidade, Float valor) {
            this.nome = nome;
            this.codigo = codigo;
            this.quantidade = quantidade;
            this.valor = valor;
	}
}
