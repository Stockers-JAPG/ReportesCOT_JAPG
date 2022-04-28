package com.padre.reportescotizadortelcel_v2.domain;

import java.io.Serializable;

public class CotizacionesFuerzaVentaDat implements Serializable {

    private String tipo;
    private String idCotizacion;
    private String fechaHoraRegistro;
    private String region;
    private String nombre;
    private String correoEnvio;
    private String ofertaSuplementaria;
    private String ofertaPrimaria;
    private String plazo;
    private String descripcion;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(String idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public String getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    public void setFechaHoraRegistro(String fechaHoraRegistro) {
        this.fechaHoraRegistro = fechaHoraRegistro;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoEnvio() {
        return correoEnvio;
    }

    public void setCorreoEnvio(String correEnvio) {
        this.correoEnvio = correEnvio;
    }

    public String getOfertaSuplementaria() {
        return ofertaSuplementaria;
    }

    public void setOfertaSuplementaria(String ofertaSuplementaria) {
        this.ofertaSuplementaria = ofertaSuplementaria;
    }

    public String getOfertaPrimaria() {
        return ofertaPrimaria;
    }

    public void setOfertaPrimaria(String ofertaPrimaria) {
        this.ofertaPrimaria = ofertaPrimaria;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "CotizacionesFuerzaVentaDatDTO{" +
                "tipo='" + tipo + '\'' +
                ", idCotizacion='" + idCotizacion + '\'' +
                ", fechaHoraRegistro='" + fechaHoraRegistro + '\'' +
                ", region='" + region + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correEnvio='" + correoEnvio + '\'' +
                ", ofertaSuplementaria='" + ofertaSuplementaria + '\'' +
                ", ofertaPrimaria='" + ofertaPrimaria + '\'' +
                ", plazo='" + plazo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
