package Service;

import model.Pedido;
import model.Produto;
import model.Usuario;

import java.util.List;

public class PedidoService {
    public void efetuarPedido(Pedido pedido) {

        //System.out.println("Pedido #" + pedido.getProdutos() + " efetuado com sucesso!");

        List<Produto> produtosPedido = pedido.getProdutos();
        produtosPedido.stream()
                        .forEach(produto ->
                        {
                            System.out.println("Produto " + produto.getNome() + " Valor: R$" + produto.getValor());
                        });

        System.out.println("Valor total: " + pedido.calcularValorTotal());
    }


    }
