public class cls_productos {
  private String str_codigo;
  private String str_nombre;
  private String str_descripcion;
  private int int_stock;
  private float flt_valorCompra;
  private float flt_ganancia;
  private float flt_valorVenta;

  public cls_productos(String cod, String nom, String desc, int stock, float valComp, float ganancia) {
    this.str_codigo = cod;
    this.str_nombre = nom;
    this.str_descripcion = desc;
    this.int_stock = stock;
    this.flt_valorCompra = valComp;
    this.flt_ganancia = ganancia;

    // calcular valor venta

    this.flt_valorVenta = (flt_valorCompra * ganancia) + flt_valorCompra;
  }

  // setters
  public void setNombre(String nombre) { this.str_nombre = nombre; }
  public void setDescripcion(String descripcion) { this.str_descripcion = descripcion; }

  // getters
  public String getNombre() { return str_nombre; }
  public String getDescripcion() { return str_descripcion; }
  public String getCodigo() { return str_codigo; }
  public int getStock() { return int_stock; }
  public float getValorCompra() { return flt_valorCompra; }
  public float getGanancia() { return flt_ganancia; }
  public float getvalorVenta() { return flt_valorVenta; }

}