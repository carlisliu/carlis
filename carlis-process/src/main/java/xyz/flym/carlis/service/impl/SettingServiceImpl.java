package xyz.flym.carlis.service.impl;

import xyz.flym.carlis.persistence.domain.Setting;
import xyz.flym.carlis.persistence.mapper.SettingMapper;
import xyz.flym.carlis.service.SettingService;

/**
 * 
 * @author Carlis
 * 
 */
public class SettingServiceImpl implements SettingService {

	private SettingMapper settingMapper;

	@Override
	public void save(Setting setting) {
		settingMapper.save(setting);
	}

	@Override
	public void update(Setting setting) {
		settingMapper.update(setting);
	}

	@Override
	public Setting find() {
		return settingMapper.find();
	}

	public SettingMapper getSettingMapper() {
		return settingMapper;
	}

	public void setSettingMapper(SettingMapper settingMapper) {
		this.settingMapper = settingMapper;
	}

}
