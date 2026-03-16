package com.exemplo.contatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContatosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContatosApplication.class, args);
    }

    @GetMapping("/contatos")
    public String listarContatos() {
        return "Contatos listados com sucesso!";
    }

    @PostMapping("/contatos")
    public String criarContato() {
        return "Contato criado com sucesso!";
    }

    @PutMapping("/contatos")
    public String atualizarContato() {
        return "Contato atualizado com sucesso!";
    }

    @DeleteMapping("/contatos")
    public String deletarContato() {
        return "Contato deletado com sucesso!";
    }
}
