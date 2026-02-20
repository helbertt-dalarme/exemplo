package com.github.kyriosdata.llm.application.api;

import com.github.kyriosdata.exemplo.application.api.DiaDaSemanaController;
import com.github.kyriosdata.exemplo.domain.DiaDaSemana;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Testes para o controlador `DiaDaSemanaController`.
 */
public class DiaDaSemanaControllerTest {

    @Test
    public void converteDataValida() {
        DiaDaSemanaController controller = new DiaDaSemanaController();
        LocalDate data = controller.localDateFromString("01-01-2018");
        assertNotNull(data, "Data válida não deve retornar null");
        assertEquals(LocalDate.of(2018, 1, 1), data, "Data convertida incorreta");
    }

    @Test
    public void converteDataInvalidaRetornaNull() {
        DiaDaSemanaController controller = new DiaDaSemanaController();
        LocalDate data = controller.localDateFromString("texto-invalido");
        assertNull(data, "Entrada inválida deve resultar em null");
    }

    @Test
    public void diaDaSemanaParaDataEspecifica() {
        DiaDaSemanaController controller = new DiaDaSemanaController();
        DiaDaSemana resultado = controller.diaDaSemana("01-01-2018");

        assertNotNull(resultado, "Resultado não deve ser null");
        assertEquals(LocalDate.of(2018, 1, 1), resultado.getData(), "Data no objeto está incorreta");
        assertEquals("segunda-feira", resultado.getDiaDaSemana(), "Dia da semana incorreto para 01-01-2018");
    }
}
