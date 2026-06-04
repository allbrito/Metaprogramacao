package envio;

public class EnvioPAC {

    private final int tipo = 1;
    private double frete;
    private String codigo;

    public void calcularFrete(double valorFrete) {
        frete = valorFrete;
    }

    public void gerarCodigo() {
        codigo = "Gerando código PAC";
    }

    public void notificarCliente(){
        System.out.println("Enviando Email...\nValor do Frete: " + frete + "\nCódigo de Rastreio: " + codigo);
    }

    public double getFrete() {
        return frete;
    }

    public String getCodigo() {
        return codigo;
    }
}
