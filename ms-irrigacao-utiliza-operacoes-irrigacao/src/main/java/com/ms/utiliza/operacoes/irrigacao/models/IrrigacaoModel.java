package com.ms.utiliza.operacoes.irrigacao.models;

import com.ms.utiliza.operacoes.irrigacao.enums.StatusIrrigacao;
import lombok.Data;

@Data
public class IrrigacaoModel {
    private static final long serialVersionUID = 1L;

    private String vazaoAgua;

    private String tamanhoArea;

    private String tipoJato;

    private String tempoIrrigacao;

    private StatusIrrigacao statusIrrigacao;
}
