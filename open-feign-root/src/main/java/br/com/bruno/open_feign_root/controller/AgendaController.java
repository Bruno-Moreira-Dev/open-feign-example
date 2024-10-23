package br.com.bruno.open_feign_root.controller;

import br.com.bruno.open_feign_root.entity.Contato;
import br.com.bruno.open_feign_root.utils.ConsumindoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agenda")
public class AgendaController {

    @Autowired
    private ConsumindoApi consumindoApi;

    @GetMapping
    public Contato retornaContato() {
        return consumindoApi.retornaContato();
    }
}
