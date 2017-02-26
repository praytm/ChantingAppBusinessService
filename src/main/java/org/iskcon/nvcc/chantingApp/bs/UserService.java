/**
 * 
 */
package org.iskcon.nvcc.chantingApp.bs;

import org.iskcon.nvcc.chantingApp.dto.RefreshUserStatisticsOutputDTO;
import org.iskcon.nvcc.chantingApp.dto.UserDTO;

/**
 * @author aditya.anand
 *
 */
public interface UserService {

	
	public UserDTO registerUser(UserDTO userDto);
	
	public UserDTO loginUser(UserDTO userDto);
	
	public Boolean changeUserStatusToActive(UserDTO userDto);
	
	public Boolean changeUserStatusToNotActive(UserDTO userDto);
	
	public RefreshUserStatisticsOutputDTO refreshUserStatistics(UserDTO userDto);
}
