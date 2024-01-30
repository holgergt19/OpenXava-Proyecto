package com.tuempresa.proyectop3.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the promociones database table.
 * 
 */
@Entity
@Table(name="promociones")
@NamedQuery(name="Promocione.findAll", query="SELECT p FROM Promocione p")
public class Promocione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int idPromocion;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	@Column(length=50)
	private String nombre;

	//bi-directional many-to-one association to Insumoodontologico
	@OneToMany(mappedBy="promocione")
	private List<Insumoodontologico> insumoodontologicos;

	public Promocione() {
	}

	public int getIdPromocion() {
		return this.idPromocion;
	}

	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Insumoodontologico> getInsumoodontologicos() {
		return this.insumoodontologicos;
	}

	public void setInsumoodontologicos(List<Insumoodontologico> insumoodontologicos) {
		this.insumoodontologicos = insumoodontologicos;
	}

	public Insumoodontologico addInsumoodontologico(Insumoodontologico insumoodontologico) {
		getInsumoodontologicos().add(insumoodontologico);
		insumoodontologico.setPromocione(this);

		return insumoodontologico;
	}

	public Insumoodontologico removeInsumoodontologico(Insumoodontologico insumoodontologico) {
		getInsumoodontologicos().remove(insumoodontologico);
		insumoodontologico.setPromocione(null);

		return insumoodontologico;
	}

}