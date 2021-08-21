package controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dao.Requerimiento_1Dao;
import modelo.dao.Requerimiento_2Dao;
import modelo.dao.Requerimiento_3Dao;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import modelo.vo.Requerimiento_3Vo;
import vista.VistaRequerimientos;

public class ControladorRequerimientos {
    // Su código
    private Requerimiento_1Dao reqDao1;
    private Requerimiento_2Dao reqDao2;
    private Requerimiento_3Dao reqDao3;

    public ControladorRequerimientos() {
        this.reqDao1 = new Requerimiento_1Dao();
        this.reqDao2 = new Requerimiento_2Dao();
        this.reqDao3 = new Requerimiento_3Dao();
    }

    public ArrayList<Requerimiento_1Vo> consultarRequerimiento1() throws SQLException {
        // Su código
        return this.reqDao1.requerimiento1();
    }

    public ArrayList<Requerimiento_2Vo> consultarRequerimiento2() throws SQLException {
        // Su código
        return this.reqDao2.requerimiento2();
    }

    public ArrayList<Requerimiento_3Vo> consultarRequerimiento3() throws SQLException {
        // Su código
        return this.reqDao3.requerimiento3();

    }
}
