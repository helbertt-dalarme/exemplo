package com.github.kyriosdata.llm.domain;

import com.github.kyriosdata.exemplo.domain.NumeroUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumeroUtilsTest {

    @Test
    public void zeroRetornaZero() {
        assertEquals("zero", NumeroUtils.porExtenso(0));
    }

    @Test
    public void valorNegativoLancaExcecao() {
        assertThrows(IllegalArgumentException.class, () -> NumeroUtils.porExtenso(-1));
    }

    @Test
    public void unidadesEDezenasBasicas() {
        assertEquals("um", NumeroUtils.porExtenso(1));
        assertEquals("dez", NumeroUtils.porExtenso(10));
        assertEquals("onze", NumeroUtils.porExtenso(11));
        assertEquals("dezenove", NumeroUtils.porExtenso(19));
        assertEquals("vinte", NumeroUtils.porExtenso(20));
        assertEquals("vinte e um", NumeroUtils.porExtenso(21));
    }

    @Test
    public void centenas() {
        assertEquals("cem", NumeroUtils.porExtenso(100));
        assertEquals("cento e um", NumeroUtils.porExtenso(101));
        assertEquals("duzentos e trinta e quatro", NumeroUtils.porExtenso(234));
    }

    @Test
    public void milharesEMilhoes() {
        assertEquals("mil", NumeroUtils.porExtenso(1000));
        assertEquals("mil e um", NumeroUtils.porExtenso(1001));
        assertEquals("um milhão", NumeroUtils.porExtenso(1000000));
        assertEquals("dois milhões", NumeroUtils.porExtenso(2000000));
    }

    @Test
    public void combinacoesComVirgulaEE() {
        // 1.001.001 -> "um milhão, mil e um"
        assertEquals("um milhão, mil e um", NumeroUtils.porExtenso(1001001));
    }
}
