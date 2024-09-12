package models;

public class Responsavel {
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private Paciente paciente;

    public Responsavel() {
    }

    public Responsavel(Long id, String nome, String cpf, String telefone, Paciente paciente) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.paciente = paciente;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
