package com.aorc.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class ttarifa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6433438726711544754L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long idTarifa;

	@Column
	private String tipoUsuario;
	
	@Column
	private Double costo;
	
	@Column
	private Timestamp hrReg;
	
	@Column
	private Boolean activo;

	public Long getIdTarifa() {
		return idTarifa;
	}

	public void setIdTarifa(Long idTarifa) {
		this.idTarifa = idTarifa;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public Timestamp getHrReg() {
		return hrReg;
	}

	public void setHrReg(Timestamp hrReg) {
		this.hrReg = hrReg;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "ttarifa [idTarifa=" + idTarifa + ", tipoUsuario=" + tipoUsuario + ", costo=" + costo + ", hrReg="
				+ hrReg + ", activo=" + activo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activo == null) ? 0 : activo.hashCode());
		result = prime * result + ((costo == null) ? 0 : costo.hashCode());
		result = prime * result + ((hrReg == null) ? 0 : hrReg.hashCode());
		result = prime * result + ((idTarifa == null) ? 0 : idTarifa.hashCode());
		result = prime * result + ((tipoUsuario == null) ? 0 : tipoUsuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ttarifa other = (ttarifa) obj;
		if (activo == null) {
			if (other.activo != null)
				return false;
		} else if (!activo.equals(other.activo))
			return false;
		if (costo == null) {
			if (other.costo != null)
				return false;
		} else if (!costo.equals(other.costo))
			return false;
		if (hrReg == null) {
			if (other.hrReg != null)
				return false;
		} else if (!hrReg.equals(other.hrReg))
			return false;
		if (idTarifa == null) {
			if (other.idTarifa != null)
				return false;
		} else if (!idTarifa.equals(other.idTarifa))
			return false;
		if (tipoUsuario == null) {
			if (other.tipoUsuario != null)
				return false;
		} else if (!tipoUsuario.equals(other.tipoUsuario))
			return false;
		return true;
	}
	
}
