package view;

import controllers.PacienteController;

import javax.swing.*;

public class PacienteView {
    public int telaInicial() {
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
            /*PacienteController pacienteController = new PacienteController();
            Boolean cadastradoEfetuado = pacienteController.cadastrar(titulo);

            if (cadastradoEfetuado) {
                JOptionPane.showMessageDialog(
                        null,
                        "Paciente cadastrado com sucesso!",
                        "PACIENTE - CADASTRO DE PACIENTE",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }*/
        }
    }
}
