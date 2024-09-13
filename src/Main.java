import view.MenuView;

public class Main {
    public static void main(String[] args) {

        MenuView menuView = new MenuView();
        int opcao;

        // Estrutura de funcionalidades
        do {
            // Tela inicial
            opcao = menuView.telaInicial();

            switch (opcao) {
                // Cadastro
                case 0:
                    menuView.telaCadastro();
                    break;

                // Listagem
                case 1:
                    menuView.telaListagem();
                    break;

                // Alteração
                case 2:
                    menuView.telaAlteracao();
                    break;

                // Exclusão
                case 3:
                    menuView.telaExclusao();
                    break;

            }

        } while(opcao >= 0);
    }
}