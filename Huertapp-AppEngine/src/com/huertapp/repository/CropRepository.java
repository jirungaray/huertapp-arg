package com.huertapp.repository;

import com.huertapp.model.Crop;

public class CropRepository extends ObjectifyRepository<Crop> {

	@Override
	protected Class<Crop> getEntityClass() {
		return Crop.class;
	}

}
