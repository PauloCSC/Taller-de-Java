/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.venta.service;

import pe.egcc.venta.dto.VentaDto;

/**
 *
 * @author paulomac
 */
 //Los objetos se pasan por referencia 
public class VentaService {
    
    public void procesarVenta( VentaDto dto ){
        //variables
        double importe, impuesto, total;
        //proceso
        total = dto.getPrecio() * dto.getCantidad();
        importe = total * 1.18;
        impuesto = total - importe;
        //Resultado
        dto.setImporta(importe);
        dto.setImpuesto(impuesto);
        dto.setTotal(total);
    }
    
}
