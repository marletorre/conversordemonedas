package filtros;


import java.util.Arrays;
import java.util.List;

public class DireccionAPI {
    private String direccion;

    public DireccionAPI(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean esValida() {
        if (direccion.length() < 72) {
            return false;
        } else {
            return true;
        }
    }

    public void redireccionar(int opcion){
        List<String> posiblesCambios = Arrays.asList("USD/ARS", "ARS/USD", "USD/BRL", "BRL/USD", "USD/COP", "COP/USD");

        switch (opcion) {
            case 1:
                this.direccion = this.direccion.concat(posiblesCambios.get(opcion-1));
                break;
            case 2:
                this.direccion = this.direccion.concat(posiblesCambios.get(opcion-1));
                break;
            case 3:
                this.direccion = this.direccion.concat(posiblesCambios.get(opcion-1));
                break;
            case 4:
                this.direccion = this.direccion.concat(posiblesCambios.get(opcion-1));
                break;
            case 5:
                this.direccion = this.direccion.concat(posiblesCambios.get(opcion-1));
                break;
            case 6:
                this.direccion = this.direccion.concat(posiblesCambios.get(opcion-1));
                break;
            case 7:
                break;
            }
    }
}


