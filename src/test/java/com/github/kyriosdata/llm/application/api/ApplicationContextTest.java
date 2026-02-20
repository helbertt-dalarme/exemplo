package com.github.kyriosdata.llm.application.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Teste simples que carrega o contexto da aplicação Spring Boot.
 */
@SpringBootTest(classes = com.github.kyriosdata.exemplo.application.api.Application.class)
public class ApplicationContextTest {

    @Test
    void contextoCarrega() {
        // Se o contexto não carregar, o teste falhará ao inicializar.
    }
}
