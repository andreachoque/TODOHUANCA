/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Carmen Huanca
 */
public class Material { //TRUFI
    private String area,tipo,nombre;
    private int idMaterial;
    Material(int a, String b, String c, String d){
        idMaterial=0;
        area=b;
        tipo=c;
        nombre=d;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrar()
    {
        System.out.println(idMaterial+" "+area+" "+tipo+" "+nombre);
    }

}
