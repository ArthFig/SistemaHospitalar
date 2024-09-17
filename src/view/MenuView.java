package view;

import models.Menu;

import javax.swing.*;

public class MenuView {

    public int telaInicial() {
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
}
