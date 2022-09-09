package clases;

import java.util.Scanner;

public class Biblioteca {
    private String nombreLibro;
    private String codigo;
    private int numeroDePaginas;
    private int numeroDeEjemplares;
    private String autor;

    public Biblioteca() {
    }

    public Biblioteca(String nombreLibro, String codigo, int numeroDePaginas, int numeroDeEjemplares, String autor) {
        this.nombreLibro = nombreLibro;
        this.codigo = codigo;
        this.numeroDePaginas = numeroDePaginas;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.autor = autor;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void ingresar(){

    }
}
