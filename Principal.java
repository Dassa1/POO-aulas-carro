public class Principal {
    public static void main(String[] args) {
        //criando um objeto fusca
        Carro meuCarro = new Carro();
        meuCarro.marca = "Volkswagen";
        meuCarro.modelo = "Fusca";
        meuCarro.cor ="Branco";
        meuCarro.ano = 1965;

        meuCarro.acelerar();
        meuCarro.freiar();

        //criando objeto ferrari
        Carro carroDoVizinho = new Carro();
        carroDoVizinho.marca = "Ferrari";
        carroDoVizinho.modelo = "XTA-2026";
        carroDoVizinho.cor ="Vermelho";
        carroDoVizinho.ano = 2026;

        carroDoVizinho.acelerar();
        carroDoVizinho.acelerar();
        carroDoVizinho.acelerar();
        carroDoVizinho.acelerar();

        System.out.println("A velocidade do meu carro é: " + meuCarro.velocidadeAtual);
        System.out.println("A velocidade do carro do meu vizinho é: " + carroDoVizinho.velocidadeAtual);
    }
}