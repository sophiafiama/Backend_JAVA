package model;

public class Paciente {

    private Integer id;
    private String nome;
    private String sobrenome;
    private String rg;
    private String dataDeRegistro;
    private String enderecoID;

    public Paciente(Integer id, String nome, String sobrenome, String rg, String dataDeRegistro, String enderecoID) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataDeRegistro = dataDeRegistro;
        this.enderecoID = enderecoID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    public String getEnderecoID() {
        return enderecoID;
    }

    public void setEnderecoID(String enderecoID) {
        this.enderecoID = enderecoID;
    }
}
