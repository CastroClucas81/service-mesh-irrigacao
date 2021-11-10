package com.ms.utiliza.operacoes.irrigacao.controllers;

import com.ms.utiliza.operacoes.irrigacao.dtos.IrrigacaoDto;
import com.ms.utiliza.operacoes.irrigacao.models.IrrigacaoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;

@RestController
public class UtilizaOperacoesIrrigacaoController {

    @Value("${rota.base}")
    private String rotaBase;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/usar-irrigacao/ativar")
    public ResponseEntity<IrrigacaoModel> usarIrrigacaoAtivar(@RequestBody @Valid IrrigacaoDto irrigacaoDto) {

        IrrigacaoModel irrigacao = restTemplate.postForObject(rotaBase + "ativar-irrigacao", irrigacaoDto, IrrigacaoModel.class);
        return new ResponseEntity<>(irrigacao, HttpStatus.CREATED);
    }

    @PostMapping("/usar-irrigacao/desativar")
    public ResponseEntity<IrrigacaoModel> usarIrrigacaoDesativar(@RequestBody @Valid IrrigacaoDto irrigacaoDto) {

        IrrigacaoModel irrigacao = restTemplate.postForObject(rotaBase + "desativar-irrigacao", irrigacaoDto, IrrigacaoModel.class);
        return new ResponseEntity<>(irrigacao, HttpStatus.CREATED);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
