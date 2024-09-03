/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ifsul.edu.operacao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author IFSul
 */
public class OperacaoTest {

    private Operacao o;

    public OperacaoTest() {
        o = new Operacao();
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void somarSubtrairTest() {
        System.out.println("Integrar somar e subtrair");
        int soma = o.somar(10, 5);
        int subtrai = o.subtrair(soma, 3);
        Operacao instance = new Operacao();
        System.out.println("Resultado: " + subtrai);
        assertEquals(12, subtrai);
    }
    
    @Test
    public void subtrairMultiplicarTest() {
        System.out.println("Integrar subtrair e multiplicar");
        int subtrai = o.subtrair(20, 10);
        int multi = o.multiplicar(subtrai, 3);
        System.out.println("Resultado: " + multi);
        assertEquals(30, multi);
    }

    @Test
    public void multiplicarDividirTest() {
        System.out.println("Integrar multiplicar e dividir");
        int multi = o.multiplicar(15, 3);
        int div = o.dividir(multi, 5);
        System.out.println("Resultado: " + div);
        assertEquals(9, div);
    }

    @Test
    public void dividirSomarTest() {
        System.out.println("Integrar somar e dividir");
        int div = o.dividir(21, 3);
        int soma = o.somar(div, 3);
        System.out.println("Resultado: " + soma);
        assertEquals(10, soma);
    }
    @Test
    public void somarSubtrairDividirMultiplicarTest(){
        System.out.println("Integrar somar, dividir, multiplicar, subtrair");
        int soma = o.somar(10, 5);
        int subtrai = o.subtrair(soma, 3);
        int multi = o.multiplicar(subtrai, 3);
        int div = o.dividir(multi, 2);
        System.out.println("Resultado: " + div);
        assertEquals(18, div);
    }
}
