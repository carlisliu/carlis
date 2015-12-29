package xyz.flym.carlis.service;

import xyz.flym.carlis.persistence.domain.Setting;

/**
 * 
 * @author Carlis
 * 
 */
public interface SettingService {

	void save(Setting setting);

	void update(Setting setting);

	Setting find();
}
