package br.com.unimed.ideia.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdeiaPK implements Serializable {

	@Column(name="COD_PROCESSO_F")
	private long codProcesso;
	
	@Column(name="COD_ETAPA_F")
	private long codEtapa;
	
	@Column(name="COD_CICLO_F")
	private long codCiclo;
	
	public IdeiaPK(){
		
	}
	
	

	@Override
	public int hashCode() {		
		return (int) (codProcesso + codEtapa + codCiclo)  ;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdeiaPK other = (IdeiaPK) obj;
		if (codCiclo != other.codCiclo)
			return false;
		if (codEtapa != other.codEtapa)
			return false;
		if (codProcesso != other.codProcesso)
			return false;
		return true;
	}



	public long getCodProcesso() {
		return codProcesso;
	}

	public void setCodProcesso(long codProcesso) {
		this.codProcesso = codProcesso;
	}

	public long getCodEtapa() {
		return codEtapa;
	}

	public void setCodEtapa(long codEtapa) {
		this.codEtapa = codEtapa;
	}

	public long getCodCiclo() {
		return codCiclo;
	}

	public void setCodCiclo(long codCiclo) {
		this.codCiclo = codCiclo;
	}

	
	
}
