package model;

import enuns.FormaPagamento;
import enuns.StatusPedidos;

import java.math.BigDecimal;
import java.math.RoundingMode;
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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public long getId() {
        return id;
    }

    public BigDecimal calcularValorTotal() {
        List<Produto> produtosPedido = produtos;
        listarProdutos(produtosPedido);
        BigDecimal valorTotalPedido = BigDecimal.ZERO;
        //arrumar calculo com stream
//        BigDecimal valorTotalPedido = BigDecimal.ZERO;
//        for (Produto produto : produtos) {
//            valorTotalPedido = valorTotalPedido.add(produto.getValor());
//        }


        produtos.stream()
                .forEach((produto) -> {
                    valorTotalPedido.add(produto.getValor());
                });

        return valorTotalPedido.setScale(2, RoundingMode.HALF_UP);
    }

    private void listarProdutos(List<Produto> produtosPedido) {
        produtosPedido.stream()
                .forEach((produto) -> {
                    System.out.println("Produto " + produto.getNome() + " Valor: R$" + produto.getValor());
                });
    }
}
