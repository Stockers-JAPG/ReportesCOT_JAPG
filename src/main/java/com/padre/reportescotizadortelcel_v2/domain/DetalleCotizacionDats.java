package com.padre.reportescotizadortelcel_v2.domain;

import java.io.Serializable;

public class DetalleCotizacionDats implements Serializable {

    private String idCotizacion;
    private String idUsuario;
    private String ip;
    private String formaPago;
    private String precio;
    private String precioIva;
    private String precioSubsidio;
    private String precioSubsidioIva;
    private String precioSinSubsidio;
    private String precioSinSubsidioIva;
    private String fechaHoraRegistro;
    private String correoEnvio;
    private String idOfertaPrimaria;
    private String idOfertaSuplementaria;
    private String region;
    private String iva;
    private String Sobreprecio;
    private String cargoEquipo;
    private String cargoEquipoIva;
    private String identificadorUno;
    private String identificadorDos;
    private String identificadorTres;
    private String plazo;
    private String sku;
    private String color;
    private String enviado;

    public String getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(String idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPrecioIva() {
        return precioIva;
    }

    public void setPrecioIva(String precioIva) {
        this.precioIva = precioIva;
    }

    public String getPrecioSubsidio() {
        return precioSubsidio;
    }

    public void setPrecioSubsidio(String precioSubsidio) {
        this.precioSubsidio = precioSubsidio;
    }

    public String getPrecioSubsidioIva() {
        return precioSubsidioIva;
    }

    public void setPrecioSubsidioIva(String precioSubsidioIva) {
        this.precioSubsidioIva = precioSubsidioIva;
    }

    public String getPrecioSinSubsidio() {
        return precioSinSubsidio;
    }

    public void setPrecioSinSubsidio(String precioSinSubsidio) {
        this.precioSinSubsidio = precioSinSubsidio;
    }

    public String getPrecioSinSubsidioIva() {
        return precioSinSubsidioIva;
    }

    public void setPrecioSinSubsidioIva(String precioSinSubsidioIva) {
        this.precioSinSubsidioIva = precioSinSubsidioIva;
    }

    public String getFechaHoraRegistro() {
        return fechaHoraRegistro;
    }

    public void setFechaHoraRegistro(String fechaHoraRegistro) {
        this.fechaHoraRegistro = fechaHoraRegistro;
    }

    public String getCorreoEnvio() {
        return correoEnvio;
    }

    public void setCorreoEnvio(String correoEnvio) {
        this.correoEnvio = correoEnvio;
    }

    public String getIdOfertaPrimaria() {
        return idOfertaPrimaria;
    }

    public void setIdOfertaPrimaria(String idOfertaPrimaria) {
        this.idOfertaPrimaria = idOfertaPrimaria;
    }

    public String getIdOfertaSuplementaria() {
        return idOfertaSuplementaria;
    }

    public void setIdOfertaSuplementaria(String idOfertaSuplementaria) {
        this.idOfertaSuplementaria = idOfertaSuplementaria;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getSobreprecio() {
        return Sobreprecio;
    }

    public void setSobreprecio(String sobreprecio) {
        Sobreprecio = sobreprecio;
    }

    public String getCargoEquipo() {
        return cargoEquipo;
    }

    public void setCargoEquipo(String cargoEquipo) {
        this.cargoEquipo = cargoEquipo;
    }

    public String getCargoEquipoIva() {
        return cargoEquipoIva;
    }

    public void setCargoEquipoIva(String cargoEquipoIva) {
        this.cargoEquipoIva = cargoEquipoIva;
    }

    public String getIdentificadorUno() {
        return identificadorUno;
    }

    public void setIdentificadorUno(String identificadorUno) {
        this.identificadorUno = identificadorUno;
    }

    public String getIdentificadorDos() {
        return identificadorDos;
    }

    public void setIdentificadorDos(String identificadorDos) {
        this.identificadorDos = identificadorDos;
    }

    public String getIdentificadorTres() {
        return identificadorTres;
    }

    public void setIdentificadorTres(String identificadorTres) {
        this.identificadorTres = identificadorTres;
    }

    public String getPlazo() {
        return plazo;
    }

    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnviado() {
        return enviado;
    }

    public void setEnviado(String enviado) {
        this.enviado = enviado;
    }

    @Override
    public String toString() {
        return "DetalleCotizacionDats{" +
                "idCotizacion='" + idCotizacion + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", ip='" + ip + '\'' +
                ", formaPago='" + formaPago + '\'' +
                ", precio='" + precio + '\'' +
                ", precioIva='" + precioIva + '\'' +
                ", precioSubsidio='" + precioSubsidio + '\'' +
                ", precioSubsidioIva='" + precioSubsidioIva + '\'' +
                ", precioSinSubsidio='" + precioSinSubsidio + '\'' +
                ", precioSinSubsidioIva='" + precioSinSubsidioIva + '\'' +
                ", fechaHoraRegistro='" + fechaHoraRegistro + '\'' +
                ", correoEnvio='" + correoEnvio + '\'' +
                ", idOfertaPrimaria='" + idOfertaPrimaria + '\'' +
                ", idOfertaSuplementaria='" + idOfertaSuplementaria + '\'' +
                ", region='" + region + '\'' +
                ", iva='" + iva + '\'' +
                ", Sobreprecio='" + Sobreprecio + '\'' +
                ", cargoEquipo='" + cargoEquipo + '\'' +
                ", cargoEquipoIva='" + cargoEquipoIva + '\'' +
                ", identificadorUno='" + identificadorUno + '\'' +
                ", identificadorDos='" + identificadorDos + '\'' +
                ", identificadorTres='" + identificadorTres + '\'' +
                ", plazo='" + plazo + '\'' +
                ", sku='" + sku + '\'' +
                ", color='" + color + '\'' +
                ", enviado='" + enviado + '\'' +
                '}';
    }
}
