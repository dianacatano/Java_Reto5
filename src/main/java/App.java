import java.awt.EventQueue;
import vista.VistaRequerimientos;

/**
 * Esta clase solo se debe usar para hacer pruebas locales, no se debe subir en
 * iMaster
 */
public class App {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    VistaRequerimientos ventana = new VistaRequerimientos();
                    ventana.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        // System.out.println("Requerimiento 1");
        // VistaRequerimientos.requerimiento1();
        // System.out.println();

        // System.out.println("Requerimiento 2");
        // VistaRequerimientos.requerimiento2();
        // System.out.println();

        // System.out.println("Requerimiento 3");
        // VistaRequerimientos.requerimiento3();
    }
}
