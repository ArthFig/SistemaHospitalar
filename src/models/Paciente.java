package models;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    public Long id;
    public String nome;
    public LocalDate data_nascimento;
    public Character sexo;
    public String telefone;
    public String email;
    public String numero_sus;
    public String cpf;
    public String tipo_sanguineo;
    public Endereco endereco;

    public Paciente() {
    }

    public Paciente(Long id, String nome, LocalDate data_nascimento, Character sexo, String telefone, String email, String numero_sus, String cpf, String tipo_sanguineo, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.numero_sus = numero_sus;
        this.cpf = cpf;
        this.tipo_sanguineo = tipo_sanguineo;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero_sus() {
        return numero_sus;
    }

    public void setNumero_sus(String numero_sus) {
        this.numero_sus = numero_sus;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo_sanguineo() {
        return tipo_sanguineo;
    }

    public void setTipo_sanguineo(String tipo_sanguineo) {
        this.tipo_sanguineo = tipo_sanguineo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
