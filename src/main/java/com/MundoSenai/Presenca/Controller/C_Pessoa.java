package com.MundoSenai.Presenca.Controller;

import com.MundoSenai.Presenca.Service.S_Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Pessoa {
    @GetMapping("/")
    public String helloWorld(){
        return "Login/login";
    }

    @PostMapping("/")
    public String postLogin(@RequestParam("usuario") String usuario, @RequestParam("senha") String senha) {
        if (S_Pessoa.getPessoaLogin(usuario, senha) == null) {
            return "Login/login";
        } else {
            return "Home/home";
        }
    }

    @GetMapping("/cadastro")
    public String getCadastro(){
        return "Pessoa/cadastro";
    }

    @PostMapping("/cadastro")
    public String postCadastro(@RequestParam("nome") String nome,
                               @RequestParam("email") String email,
                               @RequestParam("cpf") String cpf,
                               @RequestParam ("telefone") String telefone,
                               @RequestParam ("datanasc") String datanasc,
                               @RequestParam ("senha") String senha,
                               @RequestParam ("confsenha") String confsenha){
        return "redirect:/";
    }


}
