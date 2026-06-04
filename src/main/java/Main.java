import reflexao.RegistroProcessador;
import envio.ProcessadorPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double frete = 20.0;

        System.out.println("Escolha o tipo de envio: PAC(1), Sedex(2), Internacional(3)");
        int tipo = s.nextInt();

        ProcessadorPedido pedido = RegistroProcessador.obterProcessador(tipo);
        pedido.processarPedido(frete);
    }
}