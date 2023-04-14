package com.f.myproject.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.f.myproject.entity.RegisterApi;
import com.f.myproject.repository.RegisterApiRepository;

@ApplicationScoped
public class RegisterApiImplService implements RegisterApiService {

	@Inject
	private RegisterApiRepository registerApiRepository;

	@Override
	public RegisterApi saveRegisterApi(RegisterApi registerApi) {
		return registerApiRepository.saveRegisterApi(registerApi);

	}

}
