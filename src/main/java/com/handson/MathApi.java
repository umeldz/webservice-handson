package com.handson;



import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.handson.operations.Operations;
import com.handson.operations.entity.Binary;
import com.handson.operations.entity.Power;
import com.handson.operations.entity.SquareRoot;


//Endpoint = http://localhost:8080/handson2/webapi
@Path("/math-api")
public class MathApi {
	
	
	@Path("/")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response operations() {
		Gson json = new Gson();
		List<String> operations_list = new ArrayList<>();
		operations_list.add("square-root");
		operations_list.add("power");
		operations_list.add("euler");
		operations_list.add("fibonacci");
		operations_list.add("random-numbers");
		operations_list.add("prime");
		operations_list.add("division");
		operations_list.add("binary");
		
		return Response
			      .status(Response.Status.OK)
			      .entity(json.toJson(operations_list))
			      .build();
	}


	@Path("/squared-root")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response squared_root(@QueryParam("n") int n) {
		//System.out.println(n);
		//String square_root = Operations.squared_root(n);

		SquareRoot square = new SquareRoot();
		square.setNumber(n);
		square.setRoot(Math.sqrt(n));
		  return Response
			      .status(Response.Status.ACCEPTED)
			      .entity(square)
			      .build();
	}

	@Path("/power")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response power(@QueryParam("n") int n) {
		Power power = Operations.power(n);
		
		return Response
			      .status(Response.Status.ACCEPTED)
			      .entity(power)
			      .build();
	}

	@Path("/euler")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response euler(@QueryParam("n") int n) {
		String result = Operations.euler(n);
	
		return Response
			      .status(Response.Status.ACCEPTED)
			      .entity(result)
			      .build();
		
	}

	@Path("/fibonacci")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response fibonacci(@QueryParam("n") int n) {
		
		String result = Operations.fibonacci(n);
		return Response
			      .status(Response.Status.ACCEPTED)
			      .entity(result)
			      .build();
	}

	@Path("/random-numbers")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response random_numbers(@QueryParam("n") int n, @QueryParam("min") int min, @QueryParam("max") int max) {
		
		String random_result = Operations.random_numbers(n, min, max);
		
		return Response
			      .status(Response.Status.ACCEPTED)
			      .entity(random_result)
			      .build();
	}

	@Path("/prime")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response prime(@QueryParam("n") int n) {
		boolean isPrime = Operations.isPrime(n);
		
		return Response
			      .status(Response.Status.ACCEPTED)
			      .entity(isPrime)
			      .build();
	}

	@Path("/division")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response division(@QueryParam("divisor") int divisor, @QueryParam("dividend") int dividend) {
		String division_result = Operations.division(divisor, dividend);
			
		return Response
			      .status(Response.Status.OK)
			      .entity(division_result)
			      .build();
	}

	@Path("/binary")
	@GET
	@Produces(MediaType.TEXT_XML)
	public Response binary(@QueryParam("number") int number) {
		Binary binary = Operations.binary(number);
		
		
		return Response
			      .status(Response.Status.OK)
			      .entity(binary)
			      .build();
	}
	
}
