package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookBuilderTest {

    @Test
    void deveRetornarExcecaoParaLivroSemCodigo() {
        try {
            BookBuilder livroBuilder = new BookBuilder();
            Book livro = livroBuilder
                    .setTitulo("Livro A")
                    .setAutor("Autor A")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaLivroSemTitulo() {
        try {
            BookBuilder livroBuilder = new BookBuilder();
            Book livro = livroBuilder
                    .setCodigo(1)
                    .setAutor("Autor A")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Título inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarLivroValido() {
        BookBuilder livroBuilder = new BookBuilder();
        Book livro = livroBuilder
                .setCodigo(1)
                .setTitulo("Livro A")
                .setAutor("Autor A")
                .build();

        assertNotNull(livro);
    }
}
