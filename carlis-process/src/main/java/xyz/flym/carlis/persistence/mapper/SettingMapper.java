package xyz.flym.carlis.persistence.mapper;

import xyz.flym.carlis.persistence.domain.Setting;

/**
 * 
 * @author Carlis
 * 
 */
public interface SettingMapper {

	void save(Setting setting);

	void update(Setting setting);

	Setting find();
}
