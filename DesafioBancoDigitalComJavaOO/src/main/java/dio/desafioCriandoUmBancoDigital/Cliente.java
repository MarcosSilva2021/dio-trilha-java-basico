package main.java.dio.desafioCriandoUmBancoDigital;

public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;
    private String email;
    private String telefone;
    private Banco banco;
    
    public Cliente(String nome, String cpf, String profissao, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.email = email;
        this.telefone = telefone;
       // this.banco.clientes.add(this);
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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
        this.banco.clientes.add(this);
    }

    @Override
    public String toString() {
        return "{nome=" + nome + ", cpf=" + cpf + ", profissao=" + profissao + ", email=" + email
                + ", telefone=" + telefone + ", banco=" + banco.getNome() + "}";
    }

}
