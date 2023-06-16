/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defensa3;

/**
 *
 * @author Carmen Huanca
 */
public class Categorias { //TRUFI -material
    private String nombreCategoria;
    private int idCategoria;
    Categorias(int a, String b){
    	idCategoria=a;
    	nombreCategoria=b;
    }

    public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public void mostrar()
    {
        System.out.println(" "+nombreCategoria+" "+ idCategoria+" ");
    }
}
