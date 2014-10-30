package com.huertapp.model;

import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.huertapp.repository.CropRepository;

@Api(name = "cropAPI", namespace = @ApiNamespace(ownerDomain = "huertapp.com", ownerName = "huertapp.com", packagePath = "model"))
public class CropEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listCropsForGarden")
	public CollectionResponse<Crop> listCropsForGarden(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit,
			@Named("gardenId") long gardenId) {

			List<Crop> execute = new CropRepository().listWithCriteria("gardenId", gardenId);

		return CollectionResponse.<Crop> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getCropById", path="getById")
	public Crop getCropById(@Named("id") Long id) {
		return new CropRepository().get(id);
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param crop the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertCrop")
	public Crop insertCrop(Crop crop) {
		return new CropRepository().saveSync(crop);
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param crop the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateCrop")
	public Crop updateCrop(Crop crop) {
	return new CropRepository().saveSync(crop);

	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeCrop")
	public void removeCrop(@Named("id") Long id) {
		new CropRepository().delete(new CropRepository().get(id));
	}

}
