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
public class GetChantingHistoryRequestDTO implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3103303547305031439L;

	private UserDTO userDto;
	
	private Date dateInput;

	/**
	 * @return the userDto
	 */
	public UserDTO getUserDto() {
		return userDto;
	}

	/**
	 * @param userDto the userDto to set
	 */
	public void setUserDto(UserDTO userDto) {
		this.userDto = userDto;
	}

	/**
	 * @return the dateInput
	 */
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getDateInput() {
		return dateInput;
	}

	/**
	 * @param dateInput the dateInput to set
	 */
	@JsonDeserialize(using = JsonDateDeserializer.class, as = Date.class)
	public void setDateInput(Date dateInput) {
		this.dateInput = dateInput;
	}
	
	
}
