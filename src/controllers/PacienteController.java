package controllers;

import models.Endereco;
import models.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;

public class PacienteController {
    public Boolean cadastrar(Long id, String nome, LocalDate data_nascimento, Character sexo, String telefone, String email, String numero_sus, String cpf, String tipo_sanguineo, Endereco endereco) {
        Paciente paciente = new Paciente(id, nome, data_nascimento, sexo, telefone, email, numero_sus, cpf, tipo_sanguineo, endereco);
        TarefaDAO tarefaDAO = new TarefaDAO();
        Boolean resposta = tarefaDAO.inserir(paciente);
        return resposta;
    }

    public String listar() {
        TarefaDAO tarefaDAO = new TarefaDAO();
        ArrayList<Paciente> lista = tarefaDAO.selecionar();

        String conteudo = "";
        for (Paciente paciente : lista) {
            conteudo += paciente + "\n";
        }

        return conteudo;
    }

    public String[] listarOpcoes() {
        TarefaDAO tarefaDAO = new TarefaDAO();
        ArrayList<Paciente> lista = tarefaDAO.selecionar();

        String[] opcoes = new String[lista.size()];
        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i] = lista.get(i).getId() + " - " + lista.get(i).getTitulo();
        }

        return opcoes;
    }

    public Boolean excluir(Long id) {
        TarefaDAO tarefaDAO = new TarefaDAO();
        Boolean resposta = tarefaDAO.deletar(id);
        return resposta;
    }

    public Paciente buscarPorId(Long id) {
        TarefaDAO tarefaDAO = new TarefaDAO();
        Paciente paciente = tarefaDAO.selecionarPorId(id);
        return paciente;
    }

    public Boolean alterar(Long id, String nome, LocalDate data_nascimento, Character sexo, String telefone, String email, String numero_sus, String cpf, String tipo_sanguineo, Endereco endereco) {
        Paciente paciente = new Paciente(id, nome, data_nascimento, sexo, telefone, email, numero_sus, cpf, tipo_sanguineo, endereco);
        TarefaDAO tarefaDAO = new TarefaDAO();
        Boolean resposta = tarefaDAO.atualizar(paciente);
        return resposta;
    }
}
