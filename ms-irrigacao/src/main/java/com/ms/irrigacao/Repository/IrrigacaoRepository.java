package com.ms.irrigacao.Repository;

import com.ms.irrigacao.models.IrrigacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IrrigacaoRepository extends JpaRepository<IrrigacaoModel, Long> {
}
