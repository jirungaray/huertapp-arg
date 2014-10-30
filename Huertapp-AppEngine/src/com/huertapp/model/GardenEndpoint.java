package com.huertapp.model;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.huertapp.repository.GardenRepository;

@Api(name = "gardenAPI", namespace = @ApiNamespace(ownerDomain = "huertapp.com", ownerName = "huertapp.com", packagePath = "model"))
public class GardenEndpoint {

	/**
	 * This method lists all the entities inserted in datastore. It uses HTTP
	 * GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 *         persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listGardens")
	public CollectionResponse<Garden> listGardens(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		
		List<Garden> execute = new GardenRepository().getAll();
	
		return CollectionResponse.<Garden> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET
	 * method.
	 *
	 * @param id
	 *            the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getGarden")
	public Garden getGarden(@Named("id") Long id) {
		return new GardenRepository().get(id);
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity
	 * already exists in the datastore, an exception is thrown. It uses HTTP
	 * POST method.
	 *
	 * @param garden
	 *            the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "addGarden")
	public Garden addGarden(Garden garden) {
		garden = new GardenRepository().saveSync(garden);
		return garden;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does
	 * not exist in the datastore, an exception is thrown. It uses HTTP PUT
	 * method.
	 *
	 * @param garden
	 *            the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateGarden")
	public Garden updateGarden(Garden garden) {
		
		return new GardenRepository().saveSync(garden);
	}

	/**
	 * This method removes the entity with primary key id. It uses HTTP DELETE
	 * method.
	 *
	 * @param id
	 *            the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "deleteGarden")
	public void deleteGarden(@Named("id") Long id) {
		GardenRepository repo = new GardenRepository();
		repo.delete(repo.get(id));
	}

}
