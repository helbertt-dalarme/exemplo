package com.github.kyriosdata.llm.domain;

import com.github.kyriosdata.exemplo.domain.DiaDaSemana;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class DiaDaSemanaTest {

    @Test
    public void gettersRetornamValoresInformados() {
        LocalDate data = LocalDate.of(2020, 5, 20);
        DiaDaSemana ds = new DiaDaSemana(data, "quarta-feira");

        assertEquals(data, ds.getData());
        assertEquals("quarta-feira", ds.getDiaDaSemana());
    }
}
