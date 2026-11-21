package org.example;

public class BookBuilder {

    private Book livro;

    public BookBuilder() {
        livro = new Book();
    }

    public Book build() {
        if (livro.getCodigo() == 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (livro.getTitulo().equals("")) {
            throw new IllegalArgumentException("Título inválido");
        }
        return livro;
    }

    public BookBuilder setCodigo(int codigo) {
        livro.setCodigo(codigo);
        return this;
    }

    public BookBuilder setTitulo(String titulo) {
        livro.setTitulo(titulo);
        return this;
    }

    public BookBuilder setAutor(String autor) {
        livro.setAutor(autor);
        return this;
    }

    public BookBuilder setEditora(String editora) {
        livro.setEditora(editora);
        return this;
    }

    public BookBuilder setAnoPublicacao(int anoPublicacao) {
        livro.setAnoPublicacao(anoPublicacao);
        return this;
    }

    public BookBuilder setEdicao(int edicao) {
        livro.setEdicao(edicao);
        return this;
    }

    public BookBuilder setIdioma(String idioma) {
        livro.setIdioma(idioma);
        return this;
    }

    public BookBuilder setNumeroPaginas(int numeroPaginas) {
        livro.setNumeroPaginas(numeroPaginas);
        return this;
    }

    public BookBuilder setGenero(String genero) {
        livro.setGenero(genero);
        return this;
    }

    public BookBuilder setIsbn(String isbn) {
        livro.setIsbn(isbn);
        return this;
    }

}
