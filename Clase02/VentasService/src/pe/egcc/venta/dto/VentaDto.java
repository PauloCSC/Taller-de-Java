/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.venta.dto;

/**
 *
 * @author paulomac
 */
public class VentaDto {
    
    //INPUT
    private double precio;
    private int cantidad;
    
    //OUTPUT
    private double importa;
    private double impuesto;
    private double total;
    
    public VentaDto(){
        
    }
                
    public VentaDto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporta() {
        return importa;
    }

    public void setImporta(double importa) {
        this.importa = importa;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
