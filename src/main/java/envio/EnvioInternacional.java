package envio;

public class EnvioInternacional {

    private double frete;
    private String codigo;

    public void calcularFrete(double valorFrete) {
        frete = valorFrete + (valorFrete * imposto());
    }

    public void gerarCodigo() {
        codigo = "Gerando código internacional";
    }

    public void notificarCliente(){
        System.out.println("Enviando Email...\nValor do Frete: " + frete + "\nCódigo de Rastreio: " + codigo);
    }

    private double imposto() {
        return 0.2;
    }

    public double getFrete() {
        return frete;
    }

    public String getCodigo() {
        return codigo;
    }
}
