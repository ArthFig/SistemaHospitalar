package view;

import models.Menu;

import javax.swing.*;

public class MenuView {

    /*public int telaInicial() {
        String[] menu = {"Cadastro", "Listagem", "Alteração", "Exclusão"};

        int opcao = JOptionPane.showOptionDialog(
                null,
                "Menu de opções:",
                "SISTEMA HOSPITALAR",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                menu,
                menu[0]
        );

        return opcao;
    }

    public void telaListagem() {
        MenuController menuController = new MenuController();
        String conteudo = menuController.listar();

        JOptionPane.showMessageDialog(
                null,
                conteudo,
                "LISTAGEM DE PACIENTES",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void telaAlteracao() {
        MenuController menuController = new MenuController();
        String[] opcoes = menuController.listarOpcoes();

        // Escolha tarefa para alteração
        String opcao = (String) JOptionPane.showInputDialog(
                null,
                "Escolha um paciente:",
                "ALTERAÇÃO DE PACIENTE",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                null
        );

        if(opcao != null) {
            // Busca menu por id
            Integer idEscolhido = Integer.parseInt(opcao.split(" - ")[0]);
            Menu menu = menuController.buscarPorId(idEscolhido);

            // Alteração dos dados
            String novoTitulo = (String) JOptionPane.showInputDialog(
                    null,
                    "Título:",
                    "ALTERAÇÃO DE PACIENTE",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    null,
                    menu.getTitulo()
            );

            // Salva as alterações
            Boolean alteracaoEfetuada = menuController.alterar(idEscolhido, novoTitulo);
            if(alteracaoEfetuada) {
                JOptionPane.showMessageDialog(
                        null,
                        "Paciente alterada com sucesso!",
                        "ALTERAÇÃO DE PACIENTE",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
    }

    public void telaExclusao() {
        MenuController menuController = new MenuController();
        String[] opcoes = menuController.listarOpcoes();

        // Escolha tarefa para exclusão
        String opcao = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma paciente:",
                "EXCLUSÃO DE PACIENTE",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                null
        );

        if (opcao != null) {
            int confirmacao = JOptionPane.showConfirmDialog(
                    null,
                    "Você tem certeza que deseja excluir?",
                    "EXCLUSÃO DE PACIENTE",
                    JOptionPane.YES_NO_OPTION
            );

            // Deleta a tarefa pelo id
            if(confirmacao == JOptionPane.YES_OPTION) {
                Integer idEscolhido = Integer.parseInt(opcao.split(" - ")[0]);
                Boolean exclusaoEfetuada = menuController.excluir(idEscolhido);
                if (exclusaoEfetuada) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Paciente excluída com sucesso!",
                            "EXCLUSÃO DE PACIENTE",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        }
    }*/
}
