package com.github.kyriosdata.llm.application.console;

import com.github.kyriosdata.exemplo.application.console.ProgramaCalendario;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramaCalendarioTest {

    @Test
    public void mainImprimeHoje() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        try {
            ProgramaCalendario.main(new String[0]);
            String saida = outContent.toString();
            assertTrue(saida.contains("Hoje é"), "Saída deve conter 'Hoje é'");
        } finally {
            System.setOut(originalOut);
        }
    }
}
