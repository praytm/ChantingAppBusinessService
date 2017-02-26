/**
 * 
 */
package org.iskcon.nvcc.chantingApp.dto;

import java.io.Serializable;

/**
 * @author MA041SH
 *
 */
public class RefreshUserStatisticsOutputDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1967284209760517278L;
	
	private Integer totalNumberOfActiveUsers;
	
	private Integer totalNumberOfUsers;
	
	private Integer totalNumberOfBeadsForUser;
	
	private Integer todaysNumberOfBeadsForUser;

	/**
	 * @return the totalNumberOfActiveUsers
	 */
	public Integer getTotalNumberOfActiveUsers() {
		return totalNumberOfActiveUsers;
	}

	/**
	 * @param totalNumberOfActiveUsers the totalNumberOfActiveUsers to set
	 */
	public void setTotalNumberOfActiveUsers(Integer totalNumberOfActiveUsers) {
		this.totalNumberOfActiveUsers = totalNumberOfActiveUsers;
	}

	/**
	 * @return the totalNumberOfUsers
	 */
	public Integer getTotalNumberOfUsers() {
		return totalNumberOfUsers;
	}

	/**
	 * @param totalNumberOfUsers the totalNumberOfUsers to set
	 */
	public void setTotalNumberOfUsers(Integer totalNumberOfUsers) {
		this.totalNumberOfUsers = totalNumberOfUsers;
	}

	/**
	 * @return the totalNumberOfBeadsForUser
	 */
	public Integer getTotalNumberOfBeadsForUser() {
		return totalNumberOfBeadsForUser;
	}

	/**
	 * @param totalNumberOfBeadsForUser the totalNumberOfBeadsForUser to set
	 */
	public void setTotalNumberOfBeadsForUser(Integer totalNumberOfBeadsForUser) {
		this.totalNumberOfBeadsForUser = totalNumberOfBeadsForUser;
	}

	/**
	 * @return the todaysNumberOfBeadsForUser
	 */
	public Integer getTodaysNumberOfBeadsForUser() {
		return todaysNumberOfBeadsForUser;
	}

	/**
	 * @param todaysNumberOfBeadsForUser the todaysNumberOfBeadsForUser to set
	 */
	public void setTodaysNumberOfBeadsForUser(Integer todaysNumberOfBeadsForUser) {
		this.todaysNumberOfBeadsForUser = todaysNumberOfBeadsForUser;
	}

}
