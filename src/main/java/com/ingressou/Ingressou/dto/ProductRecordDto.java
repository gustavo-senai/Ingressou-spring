package com.ingressou.Ingressou.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String nmproduto, @NotNull BigDecimal vlProduto) {

}
