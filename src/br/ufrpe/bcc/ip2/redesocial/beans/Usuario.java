package br.ufrpe.bcc.ip2.redesocial.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private Date dataNascimento;
    private String cidade;
    private Foto fotoPerfil;
    private Set<Usuario> amigos;
    private Set<Conteudo> conteudos;

    public Usuario() {
        this.amigos = new HashSet<>();
        this.conteudos = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        return getEmail().equals(usuario.getEmail());
    }

    @Override
    public int hashCode() {
        return 37*getEmail().hashCode();
    }

    public void adicionarAmigo(Usuario usuario){
        this.amigos.add(usuario);
    }

    public void adicionarConteudo(Conteudo conteudo){
        this.conteudos.add(conteudo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Foto getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(Foto fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public Set<Usuario> getAmigos() {
        return amigos;
    }

//    public void setAmigos(Set<Usuario> amigos) {
//        this.amigos = amigos;
//    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

//    public void setConteudo(Set<Conteudo> conteudos) {
//        this.conteudos = conteudos;
//    }
}
