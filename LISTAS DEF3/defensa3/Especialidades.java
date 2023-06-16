package defensa3;

public class Especialidades {
	 private String nombreEspecialidades;
	    private int idEspecialidades,idCategoriaE;
	    Especialidades(int a, int c, String b){
	    	idEspecialidades=a;
	    	idCategoriaE=c;
	    	nombreEspecialidades=b;
	    }
		public String getNombreEspecialidades() {
			return nombreEspecialidades;
		}
		public void setNombreEspecialidades(String nombreEspecialidades) {
			this.nombreEspecialidades = nombreEspecialidades;
		}
		public int getIdEspecialidades() {
			return idEspecialidades;
		}
		public void setIdEspecialidades(int idEspecialidades) {
			this.idEspecialidades = idEspecialidades;
		}
		public int getIdCategoriaE() {
			return idCategoriaE;
		}
		public void setIdCategoriaE(int idCategoriaE) {
			this.idCategoriaE = idCategoriaE;
		}
	    
		public void mostrar()
	    {
	        System.out.println(	idEspecialidades+" "+ idCategoriaE+" "+nombreEspecialidades+ " ");
	    }

}
