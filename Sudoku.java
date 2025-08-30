public class Sudoku {
    private int[][] tabuleiro;

    public Sudoku(int[][] tabuleiroInicial) {
        this.tabuleiro = tabuleiroInicial;
    }

    public void exibirTabuleiro() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Aqui você pode adicionar métodos para validar jogadas, inserir números, etc.
}