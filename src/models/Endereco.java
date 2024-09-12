package models;

public class Endereco {
    private Long id;
    private String cep;
    private String cidade;
    private String rua;
    private Integer numero;
    private String complemento;

    public Endereco() {
    }

    public Endereco(Long id, String cep, String cidade, String rua, Integer numero, String complemento) {
        this.id = id;
        this.cep = cep;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}