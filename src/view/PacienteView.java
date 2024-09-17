package view;

import controllers.PacienteController;
import models.Menu;

import javax.swing.*;

public class PacienteView {
    /*public int telaInicial() {
        String[] menu = {"Cadastro", "Listagem", "Alteração", "Exclusão"};

        int opcao = JOptionPane.showOptionDialog(
                null,
                "Menu de opções:",
                "PACIENTE - SISTEMA HOSPITALAR",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                menu,
                menu[0]
        );

        return opcao;
    }

    public void telaCadastro() {
        String titulo = (String) JOptionPane.showInputDialog(
                null,
                "Título:",
                "PACIENTE - CADASTRO DE PACIENTE",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                null
        );

        if(titulo != null) {
            PacienteController pacienteController = new PacienteController();
            Boolean cadastradoEfetuado = pacienteController.cadastrar(titulo);

            if (cadastradoEfetuado) {
                JOptionPane.showMessageDialog(
                        null,
                        "Paciente cadastrado com sucesso!",
                        "PACIENTE - CADASTRO DE PACIENTE",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
    }

    public void telaListagem() {
        PacienteController pacienteController = new PacienteController();
        String conteudo = pacienteController.listar();

        JOptionPane.showMessageDialog(
                null,
                conteudo,
                "LISTAGEM DE PACIENTES",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void telaAlteracao() {
        PacienteController pacienteController = new PacienteController();
        String[] opcoes = pacienteController.listarOpcoes();

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
            Menu menu = pacienteController.buscarPorId(idEscolhido);

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
            Boolean alteracaoEfetuada = pacienteController.alterar(idEscolhido, novoTitulo);
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
        PacienteController pacienteController = new PacienteController();
        String[] opcoes = pacienteController.listarOpcoes();

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
                Long idEscolhido = Long.parseLong(opcao.split(" - ")[0]);
                Boolean exclusaoEfetuada = pacienteController.excluir(idEscolhido);
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
