/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejeclases;


public class Tema {
    private String nombre,macro;
    private int nroHab;
    
    Tema(String a, String b,int c){
        nombre=a;
        macro=b;
        nroHab=c;
    }

   
    
    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getMacro() {
		return macro;
	}



	public void setMacro(String macro) {
		this.macro = macro;
	}



	public int getNroHab() {
		return nroHab;
	}



	public void setNroHab(int nroHab) {
		this.nroHab = nroHab;
	}



	public void mostrar()
    {
        System.out.println(nombre+" "+macro+" "+nroHab);
    }
    
}
