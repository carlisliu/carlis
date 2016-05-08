package xyz.flym.carlis.service.scenic.impl;

import xyz.flym.carlis.persistence.domain.ScenicSpot;
import xyz.flym.carlis.persistence.mapper.ScenicSpotMapper;
import xyz.flym.carlis.service.scenic.IntroductionService;

/**
 * 
 * @author Carlis
 *
 */
public class IntroductionServiceImpl implements IntroductionService {

	private ScenicSpotMapper scenicSpotMapper;

	/**
	 * findScenicSpot
	 */
	@Override
	public ScenicSpot findScenicSpotById(int spotId) {
		return scenicSpotMapper.selectByPrimaryKey(spotId);
	}

	@Override
	public int updateSelective(ScenicSpot scenicSpot) {
		return scenicSpotMapper.updateByPrimaryKeySelective(scenicSpot);
	}

	@Override
	public int insertSelective(ScenicSpot scenicSpot) {
		return scenicSpotMapper.insertSelective(scenicSpot);
	}

	public ScenicSpotMapper getScenicSpotMapper() {
		return scenicSpotMapper;
	}

	public void setScenicSpotMapper(ScenicSpotMapper scenicSpotMapper) {
		this.scenicSpotMapper = scenicSpotMapper;
	}

}
