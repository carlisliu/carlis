package xyz.flym.carlis.persistence.mapper;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Carlis
 *
 * @param <T>
 * @param <PK>
 */
public interface BaseMapper<T, PK extends Serializable> {

	/**
	 * Save entity.
	 * 
	 * @param t
	 */
	public void save(T t);

	/**
	 * update entity.
	 * 
	 * @param t
	 * @return
	 */
	public int update(T t);

	/**
	 * get entity
	 * 
	 * @param id
	 * @return
	 */
	public T get(PK id);

	/**
	 * find entities by specified attributes.
	 * 
	 * @param t
	 * @return
	 */
	public List<T> findBy(T t);

	/**
	 * delete entity.
	 * 
	 * @param id
	 * @return
	 */
	public int delete(PK id);

	/**
	 * get all entities.
	 * 
	 * @return
	 */
	public List<T> getAll();
}
