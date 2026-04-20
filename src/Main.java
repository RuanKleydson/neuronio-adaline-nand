public class Main {
    public static void main(String[] args) {

        // Conjunto de dados (porta NAND)
        double[][] entradas = {
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        double[] targets = {1, 1, 1, 0};

        // Instanciação do Neurônio (2 entradas, taxa de 0.01)
        Neuronio neuronio = new Neuronio(2, 0.01);

        // Parâmetros de parada
        int maxEpocas = 1000;
        double erroMinimo = 0.001;

        int epoca = 0;
        double erroTotal;

        // Loop de treinamento
        do {
            erroTotal = 0;

            for (int i = 0; i < entradas.length; i++) {
                double saida = neuronio.processar(entradas[i]);
                double erro = targets[i] - saida;

                neuronio.treinar(entradas[i], erro);
                // Erro quadrático para evitar números negativos
                erroTotal += Math.pow(erro, 2);
            }

            epoca++;

        } while (erroTotal > erroMinimo && epoca < maxEpocas);

        // Resultados
        System.out.println("Resultados:");
        System.out.println("Épocas: " + epoca);
        System.out.println("Erro final: " + erroTotal);

        // Exibição dos pesos e bias
        System.out.println("\nPesos Ajustados:");
        System.out.println("Peso w1: " + neuronio.getPesos()[0]);
        System.out.println("Peso w2: " + neuronio.getPesos()[1]);
        System.out.println("Bias: " + neuronio.getBias());

        System.out.println("\nTeste da Rede (NAND):");
        for (double[] entrada : entradas) {
            double valorLinear = neuronio.processar(entrada);

            // Função de ativação Degrau (Step) para decisão final binária
            int saidaFinal = (valorLinear >= 0) ? 1 : 0;

            System.out.println(entrada[0] + " NAND " + entrada[1] + " = " + saidaFinal);
        }
    }
}