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
public class vehiculo {
    private String marca,placa,color;
    private int modelo;
    
    public vehiculo(String a, String b, String c, int d){
         marca=a;
         placa=b;
         color=c;
         modelo=0;
     }


    public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getModelo() {
		return modelo;
	}


	public void setModelo(int modelo) {
		this.modelo = modelo;
	}


	public void mostrar()
    {
        System.out.println(marca+" "+placa+" "+color+" "+modelo);
    }
    
}
