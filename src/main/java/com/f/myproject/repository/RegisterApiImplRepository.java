package com.f.myproject.repository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import com.f.myproject.entity.RegisterApi;
@Named("registerApiImplRepository")
@ApplicationScoped
public class RegisterApiImplRepository implements RegisterApiRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Inject
	@Named("test")
	private DataSource ds;
@Transactional
	@Override
	public RegisterApi saveRegisterApi(RegisterApi registerApi) {

		String sql = "INSERT INTO Register_Api (urlId, request, response, module,"
				+ " operation, tags, secretKey, methodType,"
				+ " inputType, outputType) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	Query query = entityManager.createNativeQuery(sql);
	query.setParameter(1, registerApi.getUrlId());
	query.setParameter(2, registerApi.getRequest());
	query.setParameter(3, registerApi.getResponse());
	query.setParameter(4, registerApi.getModule());
	query.setParameter(5, registerApi.getOperation());
	query.setParameter(6, registerApi.getTags());
	query.setParameter(7, registerApi.getSecretKey());
	query.setParameter(8, registerApi.getMethodType());
	query.setParameter(9, registerApi.getInputType());
	query.setParameter(10, registerApi.getOutputType());

	int result = query.executeUpdate();
	System.out.println(result);

	return registerApi;

	}

}
