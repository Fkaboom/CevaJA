package model;

import enuns.FormaPagamento;
import enuns.StatusPedidos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private long id;
    private Usuario usuario;
    private List<Produto> produtos;
    private LocalDateTime entrega;
    private StatusPedidos statusPedidos;

    private FormaPagamento formaPagamento;


    public Pedido(Usuario usuario, List<Produto> produtos, LocalDateTime entrega, StatusPedidos statusPedidos) {
        this.usuario = usuario;
        this.produtos = produtos;
        this.entrega = entrega;
        this.statusPedidos = statusPedidos;
    }

    public long getId() {
        return id;
    }
    public BigDecimal calcularValorTotal(){
        BigDecimal valorTotalPedido = BigDecimal.ZERO;
        for (Produto produto : produtos) {
          valorTotalPedido = valorTotalPedido.add(produto.getValor());
        }
     return valorTotalPedido;
    }
}
