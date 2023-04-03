package com.generation.ecommerce;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.generation.ecommerce.model.Producto;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;


@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void pruebaGET() throws Exception {
		this.mockMvc.perform(get("/miOtzo/productos/8"))
		.andDo(print() )
		.andExpect( status().isOk() )
		.andExpect(content().string(
				containsString("dracula.jpg")
				));
		
	} //prueba Get
	
	@Test
	@Disabled("Deshabilitado porque ya fue eliminado")
	public void pruebaDELETE () throws Exception{
		this.mockMvc.perform(delete("/miOtzo/productos/7"))
		.andDo(print() )
		.andExpect( status().isOk() )
		; //porque en controller tenemos un void. si fuera otro nos puede regresarlo que borramos
		
	}//prueba delete
	
	@Test
	public void pruebaPOST() throws Exception {
		Producto p = new Producto();
		p.setNombre("Perros calientes");
		p.setDescripcion("Pan y salchicha");
		p.setURL_Imagen("perros_calientrs.jpg");
		p.setPrecio(20);
		
		this.mockMvc.perform(post("/miOtzo/productos/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(p) )
				)
		.andDo(print() )
		.andExpect( status().isOk() )
		
		; //
	}
	
	
	private static String asJsonString(final Object obj) {
        try {
          return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
          throw new RuntimeException(e);
        }//catch
     } // asJsonString
	

	@Test
	public void pruebaPUT() throws Exception{
		this.mockMvc.perform(delete("/miOtzo/productos/7")
				.queryParam("imagen", "dracula.jpg")
				)
		.andDo(print() )
		.andExpect( status().isOk() )
		;
		
	}//prueba put

}
