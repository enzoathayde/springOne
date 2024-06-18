package br.com.criandoapi.projeto.model;
import jakarta.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "id")
    private Integer id;

    @Column(name = "nome", length = 200, nullable = true)
    private String nome;

    @Column(name = "email", length = 50, nullable = true)
    private String email;

    @Column(name = "senha", columnDefinition = "TEXT", nullable = true)
    private String senha;

    @Column(name = "telefone", length = 15, nullable = true)
    private String telefone;

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for nome
    public String getNome() {
        return nome;
    }

    // Setter for nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for senha
    public String getSenha() {
        return senha;
    }

    // Setter for senha
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Getter for telefone
    public String getTelefone() {
        return telefone;
    }

    // Setter for telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

