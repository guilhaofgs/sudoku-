public class Main {
    public static void main(String[] args) {
        // Inicializa um tabuleiro vazio (0 = posição vazia)
        int[][] tabuleiro = new int[9][9];

        // Exemplo de preenchimento simples
        Sudoku sudoku = new Sudoku(tabuleiro);

        // Exibe o tabuleiro
        sudoku.exibirTabuleiro();
    }
}