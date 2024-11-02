package modelos;


public class TipoCambio {
    private String moneda1;
    private String moneda2;
    private double tasa;



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

    public double resultado(int cantidad){
        return cantidad*this.tasa;
    }

}
