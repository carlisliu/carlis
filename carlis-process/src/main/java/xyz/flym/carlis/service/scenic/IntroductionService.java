package xyz.flym.carlis.service.scenic;

import xyz.flym.carlis.persistence.domain.ScenicSpot;

/**
 * 
 * @author Carlis
 *
 */
public interface IntroductionService {

	/**
	 * find Scenic Spot
	 * 
	 * @param spotId
	 * @return
	 */
	public ScenicSpot findScenicSpotById(int spotId);

	/**
	 *
	 * @param scenicSpot
	 * @return
	 */
	public int updateSelective(ScenicSpot scenicSpot);

	/**
	 * 
	 * @param scenicSpot
	 * @return
	 */
	public int insertSelective(ScenicSpot scenicSpot);
}
