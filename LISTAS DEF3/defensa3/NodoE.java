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
public class NodoE {
    private int ci,idEspecialidades;
    private String nom,pat,mat,seudonimo,lugar;
    private NodoE sig;
    
    NodoE(){
        
        sig=null;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE sig) {
        this.sig = sig;
    }

	public int getIdEspecialidades() {
		return idEspecialidades;
	}

	public void setIdEspecialidades(int idEspecialidades) {
		this.idEspecialidades = idEspecialidades;
	}

	public String getSeudonimo() {
		return seudonimo;
	}

	public void setSeudonimo(String seudonimo) {
		this.seudonimo = seudonimo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
    
    
}
