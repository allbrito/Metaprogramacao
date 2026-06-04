package envio;

public class EnvioSedex {

    private double frete;
    private String codigo;

    public void calcularFrete(double valorFrete) {
        frete = valorFrete + (valorFrete * adicionalRapidez());
    }

    public void gerarCodigo() {
        codigo = "Gerando código Sedex";
    }

    public void notificarCliente(){
        System.out.println("Enviando Email...\nValor do Frete: " + frete + "\nCódigo de Rastreio: " + codigo);
    }

    private double adicionalRapidez() {
        return 0.07;
    }

    public double getFrete() {
        return frete;
    }

    public String getCodigo() {
        return codigo;
    }
}
