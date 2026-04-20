import java.util.Random;

public class Neuronio {

    private double[] pesos;
    private double bias; // Deslocamento da função

    private double taxaAprendizagem; // Passo de ajuste dos pesos

    public Neuronio(int numEntradas, double taxaAprendizagem) {
        this.pesos = new double[numEntradas];
        this.taxaAprendizagem = taxaAprendizagem;
        inicializarPesos();
    }

    public double getBias() {
        return bias;
    }

    public double[] getPesos() {
        return pesos;
    }

    // Inicializa com valores aleatórios para quebrar a simetria inicial
    private void inicializarPesos() {
        Random rand = new Random();
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = rand.nextDouble() * 2 - 1;
        }
        this.bias = rand.nextDouble() * 2 - 1;
    }

    // Calcula a combinação linear: (Entrada * Peso) + Bias
    public double processar(double[] entradas) {
        double soma = bias;
        for (int i = 0; i < entradas.length; i++) {
            soma += entradas[i] * pesos[i];
        }
        return soma;
    }

    // Atualiza os pesos baseado no Erro (Regra Delta)
    public void treinar(double[] entradas, double erro) {
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] += taxaAprendizagem * erro * entradas[i];
        }
        bias += taxaAprendizagem * erro;
    }
}