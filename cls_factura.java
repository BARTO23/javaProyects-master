public class cls_factura {
  private String str_cod_producto;
  private int int_cantidad;
  private float flt_valorVenta;
  private float flt_total;
 
  public cls_factura(String codigo, int cantidad, float valor_venta){
    this.str_cod_producto = codigo;
    this.int_cantidad = cantidad;
    this.flt_valorVenta = valor_venta;
    this.flt_total = valor_venta * cantidad; // calcular total venta
  }
  //geters
  public String getCodigo() {return this.str_cod_producto;}
  public int getInt_cantidad() {return int_cantidad;}
  public float getFlt_valorVenta() {return flt_valorVenta;}
  public float getFlt_total() {return flt_total;}
}
