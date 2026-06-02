package envio;

public abstract class ProcessadorPedido {

    protected double frete;
    protected String codigo;

    public void processarPedido(double valorFrete){
        calcularFrete(valorFrete);
        gerarCodigo();
        notificarCliente();
    }

    public void notificarCliente(){
        System.out.println("Enviando Email...\nValor do Frete: " + frete + "\nCódigo de Rastreio: " + codigo);
    }

    public abstract void calcularFrete(double valorFrete);

    public abstract void gerarCodigo();

    public double getFrete() {
        return frete;
    }

    public String getCodigo() {
        return codigo;
    }
}
