package com.ms.irrigacao.services;

import com.ms.irrigacao.enums.StatusIrrigacao;
import com.ms.irrigacao.models.IrrigacaoModel;
import org.springframework.stereotype.Service;

@Service
public class IrrigacaoService {

    public IrrigacaoModel changeActive(IrrigacaoModel irrigacaoModel) {
        irrigacaoModel.setStatusIrrigacao(StatusIrrigacao.ATIVO);

        return irrigacaoModel;
    }

    public IrrigacaoModel changeDisable(IrrigacaoModel irrigacaoModel) {
        irrigacaoModel.setStatusIrrigacao(StatusIrrigacao.INATIVO);
        return irrigacaoModel;
    }
}
