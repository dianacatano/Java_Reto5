package vista;

import java.util.ArrayList;
import controlador.ControladorRequerimientos;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import modelo.vo.Requerimiento_3Vo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.sql.SQLException;

public class VistaRequerimientos extends JFrame implements ActionListener {

    private JLabel labelTitulo, labelSubTitulo, labelReq1, labelReq2, labelReq3;
    // private JTextField textBool1, textBool2, textBool3;
    private JButton botonReq1, botonReq2, botonReq3, botonCancelar, botonLimpiar;
    // private JButton botonInsertar, botonGuardar, botonCancelar, botonBuscar,
    // botonModificar, botonEliminar,
    // botonLimpiar;
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea textArea;

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public VistaRequerimientos() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 200, 800, 500);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        labelTitulo = new JLabel("RETO 5");
        labelTitulo.setBounds(120, 5, 200, 30);
        labelTitulo.setFont(new java.awt.Font("Verdana", 1, 22));
        contentPane.add(labelTitulo);

        labelSubTitulo = new JLabel("Requerimiento Base de Datos con Interfaz");
        labelSubTitulo.setBounds(10, 35, 470, 30);
        labelSubTitulo.setFont(new java.awt.Font("Verdana", 1, 14));
        contentPane.add(labelSubTitulo);

        botonReq1 = new JButton("Requerimiento 1");
        botonReq1.setBounds(20, 110, 140, 25);
        botonReq2 = new JButton("Requerimiento 2");
        botonReq2.setBounds(20, 190, 140, 25);
        botonReq3 = new JButton("Requerimiento 3");
        botonReq3.setBounds(20, 270, 140, 25);
        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(20, 400, 110, 25);
        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(140, 400, 110, 25);

        contentPane.add(botonReq1);
        contentPane.add(botonReq2);
        contentPane.add(botonReq3);
        contentPane.add(botonLimpiar);
        contentPane.add(botonCancelar);

        labelReq1 = new JLabel("Promedio de los salarios - Líderes de proyecto");
        labelReq1.setBounds(20, 140, 300, 25);
        labelReq2 = new JLabel("Proveedores de las compras - Proyectos de Neiva");
        labelReq2.setBounds(20, 220, 300, 25);
        labelReq3 = new JLabel("Materiales - Proyectos con ID entre 40 y 55");
        labelReq3.setBounds(20, 300, 300, 25);

        contentPane.add(labelReq1);
        contentPane.add(labelReq2);
        contentPane.add(labelReq3);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(350, 10, 420, 440);
        contentPane.add(scrollPane);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        botonReq1.addActionListener(this);
        botonReq2.addActionListener(this);
        botonReq3.addActionListener(this);
        botonCancelar.addActionListener(this);
        botonLimpiar.addActionListener(this);

        // setSize(480, 320);
        // setTitle("Misión Tic 2022");
        // setLocationRelativeTo(null);
        // setResizable(false);
        // setLayout(null);

    }

    public void requerimiento1() {
        try {
            // Su código
            ArrayList<Requerimiento_1Vo> resReq1 = controlador.consultarRequerimiento1();
            // resReq1.forEach(System.out::println);
            String salida1 = "\n\tCiudad de Residencia \t Promedio \n";
            for (Requerimiento_1Vo r1Vo : resReq1) {
                salida1 += "\t" + r1Vo.getCiudadResidencia() + "\t\t";
                salida1 += (int) Math.round(r1Vo.getPromedio()) + "\n";
            }
            textArea.setText(salida1);
        } catch (SQLException e) {
            System.err.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void requerimiento2() {
        try {
            // Su código
            ArrayList<Requerimiento_2Vo> resReq2 = controlador.consultarRequerimiento2();
            // resReq2.forEach(System.out::println);
            String salida2 = "\n\tID_Proyecto \t\t Proveedor \n";
            for (Requerimiento_2Vo r2Vo : resReq2) {
                salida2 += "\t" + r2Vo.getIdProyecto() + "\t\t";
                salida2 += r2Vo.getProveedor() + "\n";
            }
            textArea.setText(salida2);
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void requerimiento3() {
        try {
            // Su código
            ArrayList<Requerimiento_3Vo> resReq3 = controlador.consultarRequerimiento3();
            // resReq3.forEach(System.out::println);
            String salida3 = "\n\tID_Proyecto \t\t Nombre_Material \n";
            for (Requerimiento_3Vo r3Vo : resReq3) {
                salida3 += "\t" + r3Vo.getIdProyecto() + "\t\t";
                salida3 += r3Vo.getNombreMaterial() + "\n";

            }
            textArea.setText(salida3);
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void limpiar() {
        textArea.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent eV1) {
        // TODO Auto-generated method stub

        if (eV1.getSource() == botonReq1) {
            // try {
            requerimiento1();

            // PersonaVo miPersona =
            // control.consultarPersonas(Integer.parseInt(textCod.getText()));
            // if (miPersona == null) {
            // JOptionPane.showMessageDialog(null, "La persona no existe", "Advertencia",
            // JOptionPane.WARNING_MESSAGE);
            // } else {
            // // mostrar los datos de miPrersona en la ventan CRUD
            // muestraPersona(miPersona);

            // } catch (Exception eV2) {
            // JOptionPane.showMessageDialog(null, "Error al consultar: " +
            // eV2.getMessage(), "Error",
            // JOptionPane.ERROR_MESSAGE);
            // }
        }
        if (eV1.getSource() == botonReq2) {
            requerimiento2();
        }
        if (eV1.getSource() == botonReq3) {
            requerimiento3();
        }
        if (eV1.getSource() == botonLimpiar) {
            limpiar();
        }
        if (eV1.getSource() == botonCancelar) {
            this.dispose();
        }

    }
}
