package models;

public class Alergia {
    private Long id;
    private String causa;
    private String descricao;
    private Paciente paciente;

    public Alergia() {
    }

    public Alergia(Long id, String causa, String descricao, Paciente paciente) {
        this.id = id;
        this.causa = causa;
        this.descricao = descricao;
        this.paciente = paciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
