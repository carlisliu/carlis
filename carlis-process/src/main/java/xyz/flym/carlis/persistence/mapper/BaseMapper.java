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
	public int insert(T t);

	/**
	 * insert columns based on parameter.
	 * 
	 * @param t
	 * @return
	 */
	public int insertSelective(T t);

	/**
	 * update entity.
	 * 
	 * @param t
	 * @return
	 */
	public int updateByPrimaryKey(T t);

	/**
	 * 
	 * @param t
	 * @return
	 */
	public int updateByPrimaryKeySelective(T t);

	/**
	 * get entity
	 * 
	 * @param id
	 * @return
	 */
	public T selectByPrimaryKey(PK id);

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
	public int deleteByPrimaryKey(PK id);

	/**
	 * get all entities.
	 * 
	 * @return
	 */
	public List<T> getAll();
}
