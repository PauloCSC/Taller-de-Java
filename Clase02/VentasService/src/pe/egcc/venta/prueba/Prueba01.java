/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.venta.prueba;

import pe.egcc.venta.dto.VentaDto;
import pe.egcc.venta.service.VentaService;

/**
 *
 * @author paulomac
 */
public class Prueba01 {
    public static void main(String[] args) {
        //Dato
        VentaDto dto = new VentaDto(30.13, 8);
        //Proceso
        VentaService service = new VentaService();
        service.procesarVenta(dto);
        //reporte
        System.out.println("Importe: "+dto.getImporta()); 
        System.out.println("Impuesto: "+dto.getImpuesto()); 
        System.out.println("Total: "+dto.getTotal()); 
    }
}
