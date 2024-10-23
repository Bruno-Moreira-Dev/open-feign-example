package br.com.bruno.open_feign_dio.controller;

import br.com.bruno.open_feign_dio.entity.Contato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {

    @GetMapping
    public Contato retornaContato() {
        return Contato.builder()
                .id(1L)
                .nome("Bruno")
                .telefone("1198838-4348")
                .build();
    }
}
