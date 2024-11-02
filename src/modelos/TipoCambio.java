package modelos;


public class TipoCambio {
    private String moneda1;
    private String moneda2;
    private double tasa;


    public String getMoneda1() {
        return moneda1;
    }

    public String getMoneda2() {
        return moneda2;
    }

    public TipoCambio(String moneda1, String moneda2, double tasa) {
        this.moneda1 = moneda1;
        this.moneda2 = moneda2;
        this.tasa = tasa;
    }

    public TipoCambio(TipoCambioRegistro tipoCambioRegistro){
        this.moneda1 = tipoCambioRegistro.base_code();
        this.moneda2 = tipoCambioRegistro.target_code();
        this.tasa = tipoCambioRegistro.conversion_rate();

    }



    public String mostrarResultado(double valor) {
        return "El valor "+valor+" [" + this.moneda1 + "]" +
                " corresponde a " +this.tasa*valor + "[" + this.moneda2 + "]";
    }
}
