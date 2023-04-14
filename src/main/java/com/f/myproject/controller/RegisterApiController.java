package com.f.myproject.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import com.f.myproject.entity.RegisterApi;
import com.f.myproject.service.RegisterApiService;

@Path("/")
@RequestScoped
public class RegisterApiController {

	@Inject
	private RegisterApiService registerApiService;

	@Path("/addRegisterApi")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public RegisterApi addRegisterApi(@RequestBody RegisterApi registerApi) {
		return registerApiService.saveRegisterApi(registerApi);

	}

}
