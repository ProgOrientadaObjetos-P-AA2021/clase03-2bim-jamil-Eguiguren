/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporte;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author jamil
 */
public class ReportePolicia {
  double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String b, ArrayList<Policia> li) {

        setLista(li);
    }

    public void setPromedioEdades() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + getLista().get(i).getEdad();
        }
        promedioEdades = suma / lista.size();
    }

    public double getPromedioEdades() {
        return promedioEdades;
    }

    public ArrayList<Policia> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Policia> li) {
        lista = li;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sReporte de policias:\n",
                super.toString());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s - %s %s - %d\n", cadena,
                    getLista().get(i).getNombre(),
                    getLista().get(i).getApellido(),
                    getLista().get(i).getEdad());
        }
        cadena = String.format("%s *Promedio de matrículas: %.2f", cadena,
                getPromedioEdades());
        return cadena;
    }

}