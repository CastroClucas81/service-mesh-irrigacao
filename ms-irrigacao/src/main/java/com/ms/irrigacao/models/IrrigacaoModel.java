package com.ms.irrigacao.models;

import com.ms.irrigacao.enums.StatusIrrigacao;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "irrigacao")
public class IrrigacaoModel {
   // private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="vazao")
    private String vazaoAgua;
    @Column(name="tamanhoarea")
    private String tamanhoArea;
    @Column(name="tipojato")
    private String tipoJato;
    @Column(name="tempoirrigacao")
    private String tempoIrrigacao;
    @Column(name = "")
    private StatusIrrigacao statusIrrigacao;
}
