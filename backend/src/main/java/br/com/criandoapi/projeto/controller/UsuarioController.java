package br.com.criandoapi.projeto.controller;

import br.com.criandoapi.projeto.DAO.IUsuario;
import br.com.criandoapi.projeto.model.Usuario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
// GetMapping("/usuarios")  //para todos os endpoints vai ser
public class UsuarioController {

    @Autowired // injeção automática dos métodos de acesso ao banco
    private IUsuario dao;

    @GetMapping("/usuarios")
    public List<Usuario> Retorno () {return (List<Usuario>) dao.findAll();}

    // cria um usuario
    @PostMapping("/usuarios")
    public Usuario criarUsuario (@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }

}
