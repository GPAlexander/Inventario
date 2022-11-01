package Controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class proveedoresCBX {

    private int id;
    private String nombre;
    ProveedoresAppClass pac = new ProveedoresAppClass();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre;
    }

    public Vector<proveedoresCBX> mostrarProveedores() {

        List<webservices.Proveedores> datos = pac.selectAlProveedores();
        Vector<proveedoresCBX> datosCBX = new Vector<proveedoresCBX>();
        proveedoresCBX dat = null;

        dat = new proveedoresCBX();
        dat.setId(0);
        dat.setNombre("Selecciona Proveedor");

        datosCBX.add(dat);

        for (webservices.Proveedores u : datos) {
            dat = new proveedoresCBX();
            dat.setId(u.getId());
            dat.setNombre(u.getNombre());
            datosCBX.add(dat);
        }

        return datosCBX;
    }

}
