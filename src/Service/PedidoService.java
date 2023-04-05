package Service;

import model.Pedido;
import model.Produto;
import model.Usuario;

import java.util.List;

public class PedidoService {
    public void efetuarPedido(Pedido pedido) {

        //System.out.println("Pedido #" + pedido.getProdutos() + " efetuado com sucesso!");

        System.out.println("Valor total: " + pedido.calcularValorTotal());
    }


    }
