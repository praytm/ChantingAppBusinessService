package org.iskcon.nvcc.chantingApp.dto;

import java.util.Map;

public class HighestChantingInfoDTO {
	private Map<UserDTO, Integer> highestChanters;

	/**
	 * @return the highestChanters
	 */
	public Map<UserDTO, Integer> getHighestChanters() {
		return highestChanters;
	}

	/**
	 * @param highestChanters the highestChanters to set
	 */
	public void setHighestChanters(Map<UserDTO, Integer> highestChanters) {
		this.highestChanters = highestChanters;
	}
	
}
