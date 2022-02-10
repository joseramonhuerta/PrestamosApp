package com.servfix.prestamosapp;

public class Prestamo {
    int id_prestamo;
    int id_cliente;
    String nombre_cliente;
    String fecha_prestamo;
    double importe_prestamo;
    double importe_capital;
    double importe_interes;
    double saldo_prestamo;
    String fecha_ultimo_abono;
    double importe_abono;
    int estatus_prestamo;
    String descripcion_estatus_prestamo;

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public double getImporte_prestamo() {
        return importe_prestamo;
    }

    public void setImporte_prestamo(double importe_prestamo) {
        this.importe_prestamo = importe_prestamo;
    }

    public double getImporte_capital() {
        return importe_capital;
    }

    public void setImporte_capital(double importe_capital) {
        this.importe_capital = importe_capital;
    }

    public double getImporte_interes() {
        return importe_interes;
    }

    public void setImporte_interes(double importe_interes) {
        this.importe_interes = importe_interes;
    }

    public double getSaldo_prestamo() {
        return saldo_prestamo;
    }

    public void setSaldo_prestamo(double saldo_prestamo) {
        this.saldo_prestamo = saldo_prestamo;
    }

    public String getFecha_ultimo_abono() {
        return fecha_ultimo_abono;
    }

    public void setFecha_ultimo_abono(String fecha_ultimo_abono) {
        this.fecha_ultimo_abono = fecha_ultimo_abono;
    }

    public double getImporte_abono() {
        return importe_abono;
    }

    public void setImporte_abono(double importe_abono) {
        this.importe_abono = importe_abono;
    }

    public int getEstatus_prestamo() {
        return estatus_prestamo;
    }

    public void setEstatus_prestamo(int estatus_prestamo) {
        this.estatus_prestamo = estatus_prestamo;
    }

    public String getDescripcion_estatus_prestamo() {
        return descripcion_estatus_prestamo;
    }

    public void setDescripcion_estatus_prestamo(String descripcion_estatus_prestamo) {
        this.descripcion_estatus_prestamo = descripcion_estatus_prestamo;
    }
}
