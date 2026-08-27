public class Carro {
    String cor;
    String marca;
    String modelo;
    int ano;
    int velocidadeAtual = 0;
    double combustível;
    final double TAXA_IMPOSTO = 0.05;
    double combustível;

    public void acelerar() {
        velocidadeAtual += 10;
    }

    public void freiar() {
        velocidadeAtual -= 5;
    }
}