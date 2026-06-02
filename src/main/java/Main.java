import envio.EnvioInternacional;
import envio.EnvioPAC;
import envio.EnvioSedex;
import envio.ProcessadorPedido;

public class Main {
    public static void main(String[] args) {

        ProcessadorPedido pac = new EnvioPAC();
        ProcessadorPedido sedex = new EnvioSedex();
        ProcessadorPedido internacional = new EnvioInternacional();

        double frete = 20.0;

        pac.processarPedido(frete);

        System.out.println();

        sedex.processarPedido(frete);

        System.out.println();

        internacional.processarPedido(frete);
    }
}