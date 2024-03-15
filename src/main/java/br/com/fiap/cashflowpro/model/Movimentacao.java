package br.com.fiap.cashflowpro.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data //já coloca os getters e setters e td mais
@Entity
public class Movimentacao {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)

    @NotBlank @Size(min = 3, max = 255)//É DO JAKARTA VALIDATION
    private Long id;
    private String descricao;
    private LocalDate data;
    @Positive
    private BigDecimal valor;
    // @TipoMovimentacaos
    private String tipo;// RECEITA | DESPESA
}
