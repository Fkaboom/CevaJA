package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Produto {
    private BigDecimal valor;
    private String nome;
    private LocalDate fabricacao;
    private LocalDate vencimento;
    private String origem;

    public Produto(BigDecimal valor, String nome, LocalDate fabricacao, LocalDate vencimento, String origem) {
        this.valor = valor;
        this.nome = nome;
        this.fabricacao = fabricacao;
        this.vencimento = vencimento;
        this.origem = origem;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
