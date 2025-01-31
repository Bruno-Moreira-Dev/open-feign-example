package br.com.bruno.open_feign_root.utils;

import br.com.bruno.open_feign_root.entity.Contato;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "agenda", url = "http://localhost:8080/contato")
public interface ConsumindoApi {

    @RequestMapping(method = RequestMethod.GET, value = "")
    Contato retornaContato();
}
