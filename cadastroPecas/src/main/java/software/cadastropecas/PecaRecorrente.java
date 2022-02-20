package software.cadastropecas;
/**
 *
 * @author vinic
 */
public class PecaRecorrente extends Peca {
	public Integer tempoTroca;
	public String data;
        
	public PecaRecorrente(String nome, Integer codigo, Integer quantidade, Float valor, Integer tempoTroca, String data) {
		super(nome, codigo, quantidade, valor);
		this.tempoTroca = tempoTroca;
		this.data = data;
	}
        public String getNome(){
            return nome;
        }
}