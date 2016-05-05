package xyz.flym.carlis.persistence.domain;

import java.util.Date;

public class ScenicSpotHotelRela {
	private Integer scenicSpotId;
	
	private Integer hotelId;

	private Date createdOn;

    private Date modifiedOn;

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

	public Integer getScenicSpotId() {
		return scenicSpotId;
	}

	public void setScenicSpotId(Integer scenicSpotId) {
		this.scenicSpotId = scenicSpotId;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
    
}