
/**
 * Classe para instanciar objetos do tipo eletrodomestico e colocar para funcionar
 * @author Ingryd Salinas
 * @since 18/05/2026 - 11:42:13
 */
public class Casa {
    public static void main(String[] args) throws InterruptedException {
        Microondas m= new Microondas();
        TV tv= new TV();
        tv.soneca();
        //tv.ligar();
        //tv.desligar();
        //m.ligar(5);
        //m.pipoca();
        //m.descongelar();
        //m.escolherTempo();
    }//fim do main
}
