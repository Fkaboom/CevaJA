package model;

import enuns.TipoCerveja;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cerveja extends Produto {
    private TipoCerveja tipoCerveja;
    private double teorAlc;
    private int volume;

    public Cerveja(BigDecimal valor, String nome, LocalDate fabricacao, LocalDate vencimento,
                   String origem, TipoCerveja tipoCerveja, double teorAlc, int volume) {
        super(valor, nome, fabricacao, vencimento, origem);
        this.tipoCerveja = tipoCerveja;
        this.teorAlc = teorAlc;
        this.volume = volume;
    }

    public Cerveja(BigDecimal valor, String nome, LocalDate fabricacao, LocalDate vencimento, String origem) {
        super(valor, nome, fabricacao, vencimento, origem);

    }




}
