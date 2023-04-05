package Application;

import Service.PedidoService;
import enuns.FormaPagamento;
import enuns.StatusPedidos;
import model.Endereco;
import model.Pedido;
import model.Produto;
import model.Usuario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("213", 123, "Teste", "tess");
        Usuario Gabriel = new Usuario("João Gabriel", LocalDate.of(2003, 12, 12), endereco, "cpf");
        LocalDate fabricacao = LocalDate.of(2022, 1, 10);
        LocalDate validade = LocalDate.of(2030, 12, 10);

        Produto produto = new Produto(new BigDecimal(20.6).setScale(2, RoundingMode.HALF_UP), "Corote", fabricacao, validade, "Alemanha");
        Produto produto2 = new Produto(new BigDecimal(20.6).setScale(2, RoundingMode.HALF_UP), "teste", fabricacao, validade, "Alemanha");
        Produto produto3 = new Produto(new BigDecimal(20.6).setScale(2, RoundingMode.HALF_UP), "teste", fabricacao, validade, "Alemanha");
        Pedido pedido1 = new Pedido(Gabriel, Arrays.asList(produto, produto2,produto3), LocalDateTime.of
                (28, 12, 29, 12, 52, 58, 45),
                StatusPedidos.ACEITO);

        PedidoService pedidoService = new PedidoService();
        pedidoService.efetuarPedido(pedido1);

    }
}