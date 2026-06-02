import envio.EnvioInternacional;
import envio.EnvioPAC;
import envio.EnvioSedex;

public class Main {
    public static void main(String[] args) {

        EnvioPAC pac = new EnvioPAC();
        EnvioSedex sedex = new EnvioSedex();
        EnvioInternacional internacional = new EnvioInternacional();

        double frete = 20.0;

        pac.calcularFrete(frete);
        pac.gerarCodigo();
        pac.notificarCliente();

        System.out.println();

        sedex.calcularFrete(frete);
        sedex.gerarCodigo();
        sedex.notificarCliente();

        System.out.println();

        internacional.calcularFrete(frete);
        internacional.gerarCodigo();
        internacional.notificarCliente();
    }
}
