package xyz.flym.carlis.persistence.mapper;

public interface BaseMapper<ID, T> {

	T findById(ID id);

	ID save(T entity);

	ID update(T entity);

	void delete(ID id);
}
