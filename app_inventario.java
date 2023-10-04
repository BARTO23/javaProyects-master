import javax.swing.JOptionPane;

public class app_inventario {

  static cls_productos[] productos  = new cls_productos[100];
  static int int_posicionesP = 0;
  static boolean bl_sw;
  static int int_p;
  public static void main(String[] args){
    fnt_menuP(true);
  }

  private static void fnt_registrar(String cod, String nom, String desc, int sto, float valor, float ga){
    productos[int_posicionesP] = new cls_productos(cod, nom, desc, sto, valor, ga);
    int_posicionesP +=1;
    JOptionPane.showMessageDialog(null, "Producto registrado", "Registrar",
    JOptionPane.INFORMATION_MESSAGE);
  }

  private static void fnt_selector(int opcion){
    if (opcion == 1){
      String cod = JOptionPane.showInputDialog(null, "Ingresar Codigo ");
      String nom = JOptionPane.showInputDialog(null, "Ingresar Nombre");
      String desc = JOptionPane.showInputDialog(null, "Ingresar Descripción");
      int sto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar Stock"));
      float valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresar el valor de compra"));
      float ga = Float.parseFloat(JOptionPane.showInputDialog(null,"Ganancia "));
      fnt_registrar(cod, nom, desc, sto, valor, ga);
    }

    private 

    if(opcion == 2){
      String cod = JOptionPane.showInputDialog(null, "ingrese el codigo del producto a consultar: ");
      fnt_consultar(cod);
    }

    if(opcion == 3){

    }
  }

  public static void fnt_consultar(String codigo) {
    bl_sw = false;
    int_p = 0;
    for (int i = 0; i <int_posicionesP; i++) {
        if (codigo.equals(productos [i].getCodigo())){
            bl_sw = true;
            int_posicionesP = i;
            break;
        }
    }
    if (bl_sw = false){
        JOptionPane.showMessageDialog(null, "No se encontro el registro consultado");
    }else{
        JOptionPane.showMessageDialog(null, "Nombre: " + productos[int_p].getNombre() +
        "\n " + productos[int_p].getDescripcion() + "\n" + productos[int_p].getStock() +
        "\n " + productos[int_p].getValorCompra() + "\n" + productos[int_p].getGanancia() +
        "\n " + productos[int_p].getvalorVenta());
    }
  }

  private static void fnt_menuP(boolean men){
    while(men == true) {
      int m = Integer.parseInt(JOptionPane.showInputDialog(null, 
      "MENU PRINCIPAL\n" + 
      "1. Registrar producto\n " +
      "2. Consultar producto\n " +
      "3. Acutalizar producto\n " +
      "4. Registro de compras\n " +
      "5. Reportes\n " +
      "6. Salir\n "));
      fnt_selector(m);
    }
  }
}
