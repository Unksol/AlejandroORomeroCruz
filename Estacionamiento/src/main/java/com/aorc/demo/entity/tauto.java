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
public class tauto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4037364241240264657L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long idAuto;
	
	@Column
	private String numPlaca;
	
	@Column
	private Timestamp hrReg;
	
	@Column
	private Boolean activo;

	public Long getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(Long idAuto) {
		this.idAuto = idAuto;
	}

	public String getNumPlaca() {
		return numPlaca;
	}

	public void setNumPlaca(String numPlaca) {
		this.numPlaca = numPlaca;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activo == null) ? 0 : activo.hashCode());
		result = prime * result + ((hrReg == null) ? 0 : hrReg.hashCode());
		result = prime * result + ((idAuto == null) ? 0 : idAuto.hashCode());
		result = prime * result + ((numPlaca == null) ? 0 : numPlaca.hashCode());
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
		tauto other = (tauto) obj;
		if (activo == null) {
			if (other.activo != null)
				return false;
		} else if (!activo.equals(other.activo))
			return false;
		if (hrReg == null) {
			if (other.hrReg != null)
				return false;
		} else if (!hrReg.equals(other.hrReg))
			return false;
		if (idAuto == null) {
			if (other.idAuto != null)
				return false;
		} else if (!idAuto.equals(other.idAuto))
			return false;
		if (numPlaca == null) {
			if (other.numPlaca != null)
				return false;
		} else if (!numPlaca.equals(other.numPlaca))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "tauto [idAuto=" + idAuto + ", numPlaca=" + numPlaca + ", hrReg=" + hrReg + ", activo=" + activo + "]";
	}

}
