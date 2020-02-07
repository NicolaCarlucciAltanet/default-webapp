package com.defaultwebapp.webapp.services;

import org.springframework.stereotype.Component;

import com.defaultwebapp.webapp.dao.DaoQuery;
import com.defaultwebapp.webapp.utilities.ConstantProperties;

@Component
public class ServicesDaoQuery {

	public void writeDaoQuery1(String id_maccchina) {
		DaoQuery daoQuery = new DaoQuery(ConstantProperties.urlSqlServer, ConstantProperties.userSqlServer,
				ConstantProperties.passwordSqlServer, ConstantProperties.driverSqlServer);
		daoQuery.DaoQuery1(id_maccchina);
	}
}