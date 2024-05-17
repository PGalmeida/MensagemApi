package unifacef.edu.mensagemapi.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController // esta classe controla as requisições Rest
public class MensagemController {
    @GetMapping("/dia")
    public String Bomdia(){
        return "Bom dia";
    }
    @GetMapping("/tarde")
    public String BoaTarde(){
        return "boa tarde";
    }
    @GetMapping("/noite")
    public String BoaNoite(){
        return "Boa noite";
    }

    @PostMapping("/insere")
    public String insere(@RequestAttribute String teste){
        return "Exemplo de um insert no banco de dados teste = " + teste;
    }

    @DeleteMapping("/remove")
    public String remove(){
        return "Exemplo de um delete no banco de dados";
    }

    @PutMapping("/atualizaAll")
    public String put(){
        return "Exemplo de um update no banco de dados";
    }

    @PatchMapping("/atualizaId/{id}")
    public String pacth(@PathVariable int id){
        return "Exemplo de um update com where no banco de dados. ID = "+ id;
    }
}
