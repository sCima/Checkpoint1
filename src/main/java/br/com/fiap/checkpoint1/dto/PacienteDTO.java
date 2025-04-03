package br.com.fiap.checkpoint1.dto;

public class PacienteDTO {

    private Long id;
    private String nome;
    private String endereco;
    private String bairro;
    private String email;
    private String telefoneCompleto;

    public PacienteDTO() {
    }

    public PacienteDTO(Long id, String nome, String endereco, String bairro, String email, String telefoneCompleto) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.email = email;
        this.telefoneCompleto = telefoneCompleto;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoneCompleto() {
        return telefoneCompleto;
    }

    public void setTelefoneCompleto(String telefoneCompleto) {
        this.telefoneCompleto = telefoneCompleto;
    }
}
