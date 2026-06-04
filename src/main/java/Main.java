import envio.EnvioInternacional;
import envio.EnvioPAC;
import envio.EnvioSedex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double frete = 20.0;

        System.out.println("Escolha o tipo de envio: PAC(1), Sedex(2), Internacional(3)");
        int tipo = s.nextInt();

        if (tipo == 1) {
            EnvioPAC pac = new EnvioPAC();
            pac.calcularFrete(frete);
            pac.gerarCodigo();
            pac.notificarCliente();
        }

        if (tipo == 2) {
            EnvioSedex sedex = new EnvioSedex();
            sedex.calcularFrete(frete);
            sedex.gerarCodigo();
            sedex.notificarCliente();
        }

        if (tipo == 3) {
            EnvioInternacional internacional = new EnvioInternacional();
            internacional.calcularFrete(frete);
            internacional.gerarCodigo();
            internacional.notificarCliente();
        }
    }
}
