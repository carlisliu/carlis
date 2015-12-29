package xyz.flym.carlis.persistence.mapper;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Category;

public interface TestMapper extends BaseMapper<Double, Category> {

	List<Category> findAllCategories();
}
