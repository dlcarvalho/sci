package br.com.sb.sci.dao.dao;

import java.lang.reflect.ParameterizedType;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class DAOFactory {

	@Produces
	@SuppressWarnings("unchecked")
	public DAO createDAO(InjectionPoint injectionPoint){
		ParameterizedType type = (ParameterizedType) injectionPoint.getType();
		Class classe = (Class) type.getActualTypeArguments()[0];
		return new DAO(classe);
		
		
	}
}