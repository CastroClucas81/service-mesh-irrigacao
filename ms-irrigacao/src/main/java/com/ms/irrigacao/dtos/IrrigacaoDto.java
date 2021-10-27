package com.ms.irrigacao.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class IrrigacaoDto {

    @NotBlank
    private String vazaoAgua;

    @NotBlank
    private String tamanhoArea;

    @NotBlank
    private String tipoJato;

    @NotBlank
    private String tempoIrrigacao;
}
