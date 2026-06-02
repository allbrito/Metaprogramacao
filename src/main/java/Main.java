import reflexao.RegistroProcessador;
import envio.ProcessadorPedido;

public class Main {
    public static void main(String[] args) {

        double frete = 20.0;

        ProcessadorPedido p1 = RegistroProcessador.obterProcessador(1);
        p1.processarPedido(frete);

        System.out.println();

        ProcessadorPedido p2 = RegistroProcessador.obterProcessador(2);
        p2.processarPedido(frete);

        System.out.println();

        ProcessadorPedido p3 = RegistroProcessador.obterProcessador(3);
        p3.processarPedido(frete);
    }
}