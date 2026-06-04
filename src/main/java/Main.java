import envio.EnvioInternacional;
import envio.EnvioPAC;
import envio.EnvioSedex;
import envio.ProcessadorPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double frete = 20.0;
        ProcessadorPedido pedido;

        System.out.println("Escolha o tipo de envio: PAC(1), Sedex(2), Internacional(3)");
        int tipo = s.nextInt();

        if (tipo == 1) {
            pedido = new EnvioPAC();
            pedido.processarPedido(frete);
        }

        if (tipo == 2) {
            pedido = new EnvioSedex();
            pedido.processarPedido(frete);
        }

        if (tipo == 3) {
            pedido = new EnvioInternacional();
            pedido.processarPedido(frete);
        }
    }
}