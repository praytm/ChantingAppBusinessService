/**
 * 
 */
package org.iskcon.nvcc.chantingApp.dto;

import java.io.Serializable;
import java.util.Map;

/**
 * @author MA041SH
 *
 */
public class ChantingHistoryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8015857226751279660L;

	private Map<String, Integer> chantingHistory;

	/**
	 * @return the chantingHistory
	 */
	public Map<String, Integer> getChantingHistory() {
		return chantingHistory;
	}

	/**
	 * @param chantingHistory the chantingHistory to set
	 */
	public void setChantingHistory(Map<String, Integer> chantingHistory) {
		this.chantingHistory = chantingHistory;
	}
	
	
}
