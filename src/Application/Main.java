package Application;

import model.Pedido;
import model.Produto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    LocalDate fabricacao = LocalDate.of(2022,1,10);
    LocalDate validade = LocalDate.of(2030,12,10);

   Produto produto = new Produto(new BigDecimal(25.6),"Corote",fabricacao,validade,"Alemanha");

}