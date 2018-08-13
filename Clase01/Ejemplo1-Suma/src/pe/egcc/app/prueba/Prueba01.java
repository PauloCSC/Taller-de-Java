package pe.egcc.app.prueba;

import pe.egcc.app.service.MateService;

public class Prueba01 {
    
    public static void main(String[] args) {
        //Datos
        int n1 = 51,n2=13;
        MateService mateService = new MateService();
        int suma = mateService.sumar(n1, n2);
        
    }
    
}
