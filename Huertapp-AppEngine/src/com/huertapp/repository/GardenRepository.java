package com.huertapp.repository;

import com.huertapp.model.Garden;

public class GardenRepository extends ObjectifyRepository<Garden> {

	@Override
	protected Class<Garden> getEntityClass() {
		return Garden.class;
	}

}
