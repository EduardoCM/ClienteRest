package com.tesji.service;

import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tesji.estoico.Alumno;

public class AlumnoCliente {

	private static Logger LOG = Logger.getLogger(AlumnoCliente.class.getName());
	
	private static final String URL = "http://localhost:8080/HelloJersey";
	private static final String TARGET = "rest/alumnos";
	
	private static final String REST_URI = "https://floating-headland-12547.herokuapp.com/webapi/alumnos";
	
	private static Client client = ClientBuilder.newClient();

	public static void main(String args[]) {

		Alumno nuevoAlumno = new Alumno(1234, "NuevoSiete", "nuevoSiete", "Director de Inovacion CitiBanamex Mundial");
		Response respuesta = createAlumno(nuevoAlumno);
		LOG.info("Respuesta: " + respuesta);
		
		//Alumno alumno = getAlumno(5);
		//LOG.info("Alumno: " + alumno);
		
		
		//Response respuestaDelete = deleteAlumno(1);
		//LOG.info("Respuesta delete: " + respuestaDelete);
		
		
		//Alumno alumnoNuevo = new Alumno(10221680, "Eduardoooo", "Castilloooo", "Director Sistemas Citibanamex");
		//Response respuesta = updateAlumno(alumnoNuevo, 2);	
		//LOG.info("Respuesta: " + respuesta);

	}

	
	
	public static Response createAlumno(Alumno alumno) {
		return client
			.target(REST_URI)
			.request(MediaType.APPLICATION_JSON)
			.post(Entity.entity(alumno, MediaType.APPLICATION_JSON));
	}
	
	
	public static Alumno getAlumno(int id) {
		return client.target(REST_URI)
			   .path(String.valueOf(id))
			   .request(MediaType.APPLICATION_JSON)
			   .get(Alumno.class);
			
	}
	
	public static Response deleteAlumno(int id) {
		return client.target(REST_URI)
				.path(String.valueOf(id))
				.request(MediaType.APPLICATION_JSON)
				.delete();
	}
	
	public static Response updateAlumno(Alumno alumno, int id) {
		return client.target(REST_URI)
				.path(String.valueOf(id))
				.request(MediaType.APPLICATION_JSON)
				.put(Entity.entity(alumno, MediaType.APPLICATION_JSON));
	}

}
