package com.generation.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepositorio;



//en el servicio se definen las operaciones crud 

@Service
public class ProductoServices {
	


	
	//Creo el objeto de la calse ProductoRepositorio
	public final ProductoRepositorio productoRepositorio;
	
	//Cablear con autowired
	@Autowired
	
	//Uso ese objeto como parametro de mi constructor
	public ProductoServices (ProductoRepositorio productoRepositorio) {
		this.productoRepositorio = productoRepositorio;
	}
	
//Create (Metodo para agregar un objeto del tipo Producto y guardarlo en la base de datos. Si el producto existe, no deberia actualizar la Base de datos porque seria un objeto duplicado.
    
    public void crearProducto(Producto prod) { //objeto del tipo producto
        Optional<Producto> productoBuscado = 
                productoRepositorio.findByNombre(prod.getNombre());
        if (productoBuscado.isPresent()) {
            throw new IllegalStateException("El producto con el nombre "
                    + "[" + prod.getNombre() + "] ya existe.");
        } else {
            productoRepositorio.save(prod);
        }//else //if 
    }//addProducto
	
	//Read
	public List<Producto> leerProducto() {
		return productoRepositorio.findAll();
		
		
	}//Toda la lista de productos
	//Read (leer un producto con un id especifico)
    public Producto getProducto(Long prodId) {
        return productoRepositorio.findById(prodId).
                orElseThrow(()-> new IllegalStateException("El Producto "
                        + "con el id " + prodId + " no existe.") );
    }//getProducto
	
//	

  //Update para actualizar un producto
    public void actualizarProducto(Long prodId, String nombre, String descripcion, String URL_Imagen, double precio) {
        
        //si el producto existe...
        if(productoRepositorio.existsById(prodId)) {
            //entonces lo modifico
            Producto productoABuscar = productoRepositorio.getById(prodId) ;//ya que verifico que mi producto existe, lo traigo y lo asigno a una variable llamada productoABuscar
            if (nombre!= null) productoABuscar.setNombre(nombre);
            if (descripcion!= null) productoABuscar.setDescripcion(descripcion);
            if (precio!= 0) productoABuscar.setPrecio(precio);
            if (URL_Imagen!= null) productoABuscar.setURL_Imagen(URL_Imagen);
            //cuando termino de editar el objeto...
            productoRepositorio.save(productoABuscar);
        }else {
            System.out.println("El producto con el id " + prodId + " no existe");
        }        
    }
        
  //Read (leer un producto con un id especifico)
    public Producto leerProducto(Long prodId) {
        return productoRepositorio.findById(prodId).orElseThrow(()-> new IllegalStateException("El Producto " + "con el id " + prodId + " no existe.") );
    }//getProducto
//	
//	
//	
//	//Delete
	public void borrarProducto(Long prodId) {
		if (productoRepositorio.existsById(prodId)) {
			productoRepositorio.deleteById(prodId);
		}
		
	}
//	
//	
}
