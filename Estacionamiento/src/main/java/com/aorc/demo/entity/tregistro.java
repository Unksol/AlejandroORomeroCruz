package com.aorc.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class tregistro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -662146001411711971L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long idRegistro;
	
	@Column
	private Timestamp hrEntrada;
	
	@Column
	private Timestamp hrSalida;
	
	@Column
	private Long hrsTotal; 
	
	@Column
	private Double sumCosto;
	
	@Column
	private Timestamp hrReg;
	
	@Column
	private Boolean activo;
	
	@OneToOne
	private tauto autofk;
	
	@OneToOne
	private ttarifa tarifafk;

	public Long getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Long idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Timestamp getHrEntrada() {
		return hrEntrada;
	}

	public void setHrEntrada(Timestamp hrEntrada) {
		this.hrEntrada = hrEntrada;
	}

	public Timestamp getHrSalida() {
		return hrSalida;
	}

	public void setHrSalida(Timestamp hrSalida) {
		this.hrSalida = hrSalida;
	}

	public Long getHrsTotal() {
		return hrsTotal;
	}

	public void setHrsTotal(Long hrsTotal) {
		this.hrsTotal = hrsTotal;
	}

	public Double getSumCosto() {
		return sumCosto;
	}

	public void setSumCosto(Double sumCosto) {
		this.sumCosto = sumCosto;
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

	public tauto getAutofk() {
		return autofk;
	}

	public void setAutofk(tauto autofk) {
		this.autofk = autofk;
	}

	public ttarifa getTarifafk() {
		return tarifafk;
	}

	public void setTarifafk(ttarifa tarifafk) {
		this.tarifafk = tarifafk;
	}

	@Override
	public String toString() {
		return "tregistro [idRegistro=" + idRegistro + ", hrEntrada=" + hrEntrada + ", hrSalida=" + hrSalida
				+ ", hrsTotal=" + hrsTotal + ", sumCosto=" + sumCosto + ", hrReg=" + hrReg + ", activo=" + activo
				+ ", autofk=" + autofk + ", tarifafk=" + tarifafk + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activo == null) ? 0 : activo.hashCode());
		result = prime * result + ((autofk == null) ? 0 : autofk.hashCode());
		result = prime * result + ((hrEntrada == null) ? 0 : hrEntrada.hashCode());
		result = prime * result + ((hrReg == null) ? 0 : hrReg.hashCode());
		result = prime * result + ((hrSalida == null) ? 0 : hrSalida.hashCode());
		result = prime * result + ((hrsTotal == null) ? 0 : hrsTotal.hashCode());
		result = prime * result + ((idRegistro == null) ? 0 : idRegistro.hashCode());
		result = prime * result + ((sumCosto == null) ? 0 : sumCosto.hashCode());
		result = prime * result + ((tarifafk == null) ? 0 : tarifafk.hashCode());
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
		tregistro other = (tregistro) obj;
		if (activo == null) {
			if (other.activo != null)
				return false;
		} else if (!activo.equals(other.activo))
			return false;
		if (autofk == null) {
			if (other.autofk != null)
				return false;
		} else if (!autofk.equals(other.autofk))
			return false;
		if (hrEntrada == null) {
			if (other.hrEntrada != null)
				return false;
		} else if (!hrEntrada.equals(other.hrEntrada))
			return false;
		if (hrReg == null) {
			if (other.hrReg != null)
				return false;
		} else if (!hrReg.equals(other.hrReg))
			return false;
		if (hrSalida == null) {
			if (other.hrSalida != null)
				return false;
		} else if (!hrSalida.equals(other.hrSalida))
			return false;
		if (hrsTotal == null) {
			if (other.hrsTotal != null)
				return false;
		} else if (!hrsTotal.equals(other.hrsTotal))
			return false;
		if (idRegistro == null) {
			if (other.idRegistro != null)
				return false;
		} else if (!idRegistro.equals(other.idRegistro))
			return false;
		if (sumCosto == null) {
			if (other.sumCosto != null)
				return false;
		} else if (!sumCosto.equals(other.sumCosto))
			return false;
		if (tarifafk == null) {
			if (other.tarifafk != null)
				return false;
		} else if (!tarifafk.equals(other.tarifafk))
			return false;
		return true;
	}
	
}
