package org.iskcon.nvcc.chantingApp.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = -7788619177798333712L;
	
	private String userId;
	private String name;
	private Date createdDate;
	private Date lastLoginDate;
	private String email;
	private String password;
	private String mobile;
	private Boolean isRegisteredViaGoogle;
	private String profilepic;
	private String googleAuthToken;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	@JsonDeserialize(using = JsonDateDeserializer.class, as = Date.class)
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getCreatedDate() {
		return createdDate;
	}
	@JsonDeserialize(using = JsonDateDeserializer.class, as = Date.class)
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the isRegisteredViaGoogle
	 */
	public Boolean getIsRegisteredViaGoogle() {
		return isRegisteredViaGoogle;
	}
	/**
	 * @param isRegisteredViaGoogle the isRegisteredViaGoogle to set
	 */
	public void setIsRegisteredViaGoogle(Boolean isRegisteredViaGoogle) {
		this.isRegisteredViaGoogle = isRegisteredViaGoogle;
	}
	
	public String getProfilepic() {
		return profilepic;
	}
	public void setProfilepic(String profilepic) {
		this.profilepic = profilepic;
	}
	/**
	 * @return the googleAuthToken
	 */
	public String getGoogleAuthToken() {
		return googleAuthToken;
	}
	/**
	 * @param googleAuthToken the googleAuthToken to set
	 */
	public void setGoogleAuthToken(String googleAuthToken) {
		this.googleAuthToken = googleAuthToken;
	}
	

	
}
