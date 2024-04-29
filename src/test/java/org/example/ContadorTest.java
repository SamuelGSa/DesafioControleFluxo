package org.example;

import org.example.exception.ParametrosInvalidosException;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ContadorTest {

    // Teste para verificar se o método conta corretamente
    @Test
    public void testContarSucesso() {
        // Redireciona o System.out para capturar a saída para verificação
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Contador.contar(1, 3);

        // Restaura o System.out padrão
        System.setOut(System.out);

        // Normaliza os separadores de linha
        String actualOutput = outContent.toString().replace(System.lineSeparator(), "\n");

        // Verifica se a saída é a esperada
        String expectedOutput = "Imprimindo o número 1: 1\nImprimindo o número 1: 2\n";
        assertEquals(expectedOutput, actualOutput);
    }

    // Teste para verificar se a exceção é lançada quando o primeiro parâmetro é maior que o segundo
    @Test
    public void testContarComParametrosInvalidos() {
        assertThrows(ParametrosInvalidosException.class, () -> {
            Contador.contar(3, 1);
        });
    }
}