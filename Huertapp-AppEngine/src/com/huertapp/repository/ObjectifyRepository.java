package com.huertapp.repository;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.googlecode.objectify.Key;

public abstract class ObjectifyRepository<T> {

	public T get(Serializable id) {
		if (id instanceof String) {
			return ofy().load().type(getEntityClass()).id((String) id).now();

		} else if (id instanceof Long) {
			return ofy().load().type(getEntityClass()).id((Long) id).now();
		} else {
			// throw new
			// Exception("El tipo de la clave no es soportado por Objectify");
			System.out
					.println("El tipo de la clave no es soportado por Objectify");
		}

		// TODO Auto-generated method stub
		return null;
	}

	public T get(Key<T> key) {
		return ofy().load().key(key).now();
	}

	public List<T> getAll() {
		return ofy().load().type(getEntityClass()).list();
	}

	public void delete(T object) {
		ofy().delete().entity(object);
	}

	public void deleteAll(List<T> objects) {
		ofy().delete().entities(objects);

	}

	public T saveSync(T object) {
		ofy().save().entity(object).now();
		return object;

	}

	public void save(T object) {
		ofy().save().entity(object);

	}

	public List<T> saveAllSync(List<T> objects) {
		return new LinkedList<T>(ofy().save().entities(objects).now().values());

	}

	public Set<T> saveAllSync(Set<T> objects) {
		return new TreeSet<T>(ofy().save().entities(objects).now().values());

	}

	public void saveAll(List<T> objects) {
		ofy().save().entities(objects);

	}

	public void saveAll(Set<T> objects) {
		ofy().save().entities(objects);

	}

	public T getWithCriteria(String field, Object param) {

		return ofy().load().type(getEntityClass()).filter(field, param).first()
				.now();
	}

	public List<T> listWithCriteria(String field, Serializable param) {
		if(field == null || param == null){
			return ofy().load().type(getEntityClass()).list();
		}else{
			return ofy().load().type(getEntityClass()).filter(field, param).list();

		}
	}

	protected abstract Class<T> getEntityClass();
}
