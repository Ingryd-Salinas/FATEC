
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

/**
 * Classe para associar dois objetos: Veiculo e Proprietário
 * 
 * @author Ingryd Salinas
 * @since 01/04/2026
 */
public class Venda {
    int codVenda;
    LocalDate dataVenda;
    DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DecimalFormat df = new DecimalFormat("###,##0.00");
    Veiculo v;
    Proprietario p;
    
    //Construtor da classe venda

    public Venda(int codVenda, String dataVenda, Veiculo v, Proprietario p) {
        this.codVenda = codVenda;
        this.dataVenda = LocalDate.parse(dataVenda, formatadorData);
        this.v = v;
        this.p = p;
    }
    
    //Método comum para exibir a venda realizada
    public void exibirVenda(){
        String msg;
        msg = p.nome + " adquiriu o veículo " + 
              v.modelo + " pelo preço de R$ " + 
              df.format(v.valor) + ", cuja venda tem o número " +
              codVenda + ", no dia " + formatadorData.format(dataVenda);
        System.out.println(msg);
    }
}
