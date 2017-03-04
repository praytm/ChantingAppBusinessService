/**
 * 
 */
package org.iskcon.nvcc.chantingApp.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author MA041SH
 *
 */
public class ChantingSessionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5521648033610338115L;

	private String userName;
	
	private String password;
	
	private Date chantingSessionDate;
	
	private Date chantingSessionStartTime;
	
	private Date chantingSessionEndTime;
	
	private Integer numberOfBeads;

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the chantingSessionDate
	 */
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getChantingSessionDate() {
		return chantingSessionDate;
	}

	/**
	 * @param chantingSessionDate the chantingSessionDate to set
	 */
	@JsonDeserialize(using = JsonDateDeserializer.class, as = Date.class)
	public void setChantingSessionDate(Date chantingSessionDate) {
		this.chantingSessionDate = chantingSessionDate;
	}

	/**
	 * @return the chantingSessionStartTime
	 */
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getChantingSessionStartTime() {
		return chantingSessionStartTime;
	}

	/**
	 * @param chantingSessionStartTime the chantingSessionStartTime to set
	 */
	@JsonDeserialize(using = JsonDateDeserializer.class, as = Date.class)
	public void setChantingSessionStartTime(Date chantingSessionStartTime) {
		this.chantingSessionStartTime = chantingSessionStartTime;
	}

	/**
	 * @return the chantingSessionEndTime
	 */
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getChantingSessionEndTime() {
		return chantingSessionEndTime;
	}

	/**
	 * @param chantingSessionEndTime the chantingSessionEndTime to set
	 */
	@JsonDeserialize(using = JsonDateDeserializer.class, as = Date.class)
	public void setChantingSessionEndTime(Date chantingSessionEndTime) {
		this.chantingSessionEndTime = chantingSessionEndTime;
	}

	/**
	 * @return the numberOfBeads
	 */
	public Integer getNumberOfBeads() {
		return numberOfBeads;
	}

	/**
	 * @param numberOfBeads the numberOfBeads to set
	 */
	public void setNumberOfBeads(Integer numberOfBeads) {
		this.numberOfBeads = numberOfBeads;
	}
	
	
}
