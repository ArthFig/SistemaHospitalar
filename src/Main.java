import view.MenuView;
import view.PacienteView;

public class Main {
    public static void main(String[] args) {

        PacienteView pacienteView = new PacienteView();
        int opcao;

        // Estrutura de funcionalidades
        do {
            // Tela inicial
            opcao = pacienteView.telaInicial();

            switch (opcao) {
                // Cadastro
                case 0:
                    pacienteView.telaCadastro();
                    break;

                // Listagem
                case 1:
                    pacienteView.telaListagem();
                    break;

                // Alteração
                case 2:
                    pacienteView.telaAlteracao();
                    break;

                // Exclusão
                case 3:
                    pacienteView.telaExclusao();
                    break;

            }

        } while(opcao >= 0);
    }
}