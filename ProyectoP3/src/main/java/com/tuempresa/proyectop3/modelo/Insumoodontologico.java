package com.tuempresa.proyectop3.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the insumoodontologico database table.
 * 
 */
@Entity
@Table(name="insumoodontologico")
@NamedQuery(name="Insumoodontologico.findAll", query="SELECT i FROM Insumoodontologico i")
public class Insumoodontologico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int idInsumo;

	@Lob
	private String descripcion;

	@Column(length=50)
	private String nombre;

	@Column(precision=10, scale=2)
	private BigDecimal precio;

	//bi-directional many-to-one association to Promocione
	@ManyToOne
	@JoinColumn(name="idPromocion")
	private Promocione promocione;

	public Insumoodontologico() {
	}

	public int getIdInsumo() {
		return this.idInsumo;
	}

	public void setIdInsumo(int idInsumo) {
		this.idInsumo = idInsumo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Promocione getPromocione() {
		return this.promocione;
	}

	public void setPromocione(Promocione promocione) {
		this.promocione = promocione;
	}

}