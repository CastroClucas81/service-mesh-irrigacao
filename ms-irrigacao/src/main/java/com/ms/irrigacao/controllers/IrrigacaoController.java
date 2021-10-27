package com.ms.irrigacao.controllers;

import com.ms.irrigacao.dtos.IrrigacaoDto;
import com.ms.irrigacao.models.IrrigacaoModel;
import com.ms.irrigacao.services.IrrigacaoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class IrrigacaoController {

    @Autowired
    IrrigacaoService irrigacaoService;

    @PostMapping("/ativar-irrigacao")
    public IrrigacaoModel ativarIrrigacao(@RequestBody @Valid IrrigacaoDto irrigacaoPlantaDto) {
        IrrigacaoModel irrigacaoPlantaModel = new IrrigacaoModel();

        BeanUtils.copyProperties(irrigacaoPlantaDto, irrigacaoPlantaModel);

        irrigacaoService.changeActive(irrigacaoPlantaModel);

        return irrigacaoPlantaModel;
    }

    @PostMapping("/desativar-irrigacao")
    public ResponseEntity<IrrigacaoModel> desativarIrrigacao(@RequestBody @Valid IrrigacaoDto irrigacaoDto) {
        IrrigacaoModel irrigacaoModel = new IrrigacaoModel();

        BeanUtils.copyProperties(irrigacaoDto, irrigacaoModel);

        irrigacaoService.changeDisable(irrigacaoModel);

        return new ResponseEntity<>(irrigacaoModel, HttpStatus.CREATED);
    }
}
