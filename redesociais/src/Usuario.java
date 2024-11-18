import org.example.Exception.ChecagemDeUsuario;

import java.util.HashSet;


public class Usuario {

    private String nome;
    private String email;
    private HashSet<RedeSocial> redeSociais;

    public Usuario(HashSet<RedeSocial> redeSociais) {
        this.redeSociais = redeSociais;
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

    public HashSet<RedeSocial> getRedeSociais() {
        return redeSociais;
    }

    public void setRedeSociais(HashSet<RedeSocial> redeSociais) {
        this.redeSociais = redeSociais;
    }

    public static void criarUsuario(Usuario usuario, RedeSocial redeSocial) throws ChecagemDeUsuario {
        if (!usuario.getRedeSociais().contains(redeSocial)) {
            usuario.getRedeSociais().add(redeSocial);
        } else {
            throw new ChecagemDeUsuario("Usuário já cadastrado");
        }
    }

}