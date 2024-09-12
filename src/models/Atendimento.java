package models;

import java.time.LocalDateTime;

public class Atendimento {
    private Long id;
    private LocalDateTime data_hora_entrada;
    private String estado;
    private Character gravidade;
    private Paciente paciente;

    public Atendimento() {
    }

    public Atendimento(Long id, LocalDateTime data_hora_entrada, String estado, Character gravidade, Paciente paciente) {
        this.id = id;
        this.data_hora_entrada = data_hora_entrada;
        this.estado = estado;
        this.gravidade = gravidade;
        this.paciente = paciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData_hora_entrada() {
        return data_hora_entrada;
    }

    public void setData_hora_entrada(LocalDateTime data_hora_entrada) {
        this.data_hora_entrada = data_hora_entrada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Character getGravidade() {
        return gravidade;
    }

    public void setGravidade(Character gravidade) {
        this.gravidade = gravidade;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
