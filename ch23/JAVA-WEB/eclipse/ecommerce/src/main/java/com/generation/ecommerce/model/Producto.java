package com.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity//indico que mi clase Producto se convierte en una entidad JPA(persistencia de datos)
	
	@Table(name= "Producto") //especificar de forma correcta el nombre de la tabla
	

public class Producto {
	
	@Id//el campo id es la primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //el campo id sera generado automaticamente por la DB
    @Column(name="id", unique = true, nullable = false) //especifica el nombre de la columna en la DB
	
	
	//Atributos
	private Long id; 
	private String nombre;
	private String descripcion;
	private String URL_Imagen;
	private double precio;
	//atributo contador
	
	//contador ++ para ese atributo
	
	//Constructor vacio para el jackson (serializar y seserializar un objeto JAVA a JSON)
	public Producto() {
		
	} //Constructor vacio

	//Constructor con todos los campos
	
	public Producto( String nombre, String descripcion, String uRL_Imagen, double precio) {
		
		
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.URL_Imagen = uRL_Imagen;
		this.precio = precio;
	}

	
	
	
	public Producto(Long id, String nombre, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getURL_Imagen() {
		return URL_Imagen;
	}

	public void setURL_Imagen(String uRL_Imagen) {
		this.URL_Imagen = uRL_Imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	//toString 
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", URL_Imagen="
				+ URL_Imagen + ", precio=" + precio + "]";
	}
	
	
	
	/*

    Colecciones o Collections
    
        - Array
        
    Estructura de datos lineal, siempre contiene datos del mismo tipo. Los datos estan almacenados de forma contigua en la memoria. Se accede a los elementos a traves de un indice.
    
        - Tamanio fijo
        - Acceso rapido
        - Coste elevado para insertar o eliminar elementos. 
        
        
    
        - Set (conjuntos)
    Estructuras de datos que almacena elementos unicos y sin orden.
    
        - No hay elementos elementos duplicados. Si trato de agregar un elemento repetido, el conjunto lo ignora.
        - No hay orden especifico (puede ser bueno o malo para acceder a la informacion)
        - Busqueda rapida: hay funciones especificas de este conjunto para buscar informacion
    
        
        
        
        - Map (mapas)
    Estructura de datos que almacena informacion en pares de clave-valor. 
        
        - Almancena informacion en pares (clave unica)
        - No hay orden especifico 
        - Busqueda rapida: si conozco la llave, conozco el dato que puedo tomar
        
        
        
        
        - ArrayList
        - HashSet
        - HashMap


*/
	
	
	
}
