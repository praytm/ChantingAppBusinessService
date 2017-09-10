/**
 * 
 */
package org.iskcon.nvcc.chantingApp.bs;

import org.iskcon.nvcc.chantingApp.dto.ChantingHistoryDTO;
import org.iskcon.nvcc.chantingApp.dto.ChantingSessionDTO;
import org.iskcon.nvcc.chantingApp.dto.GetChantingHistoryRequestDTO;
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
	
	public Boolean saveNewChantingSession(ChantingSessionDTO chantingSessionDto);
	
	public ChantingHistoryDTO getChantingHistoryForUser(GetChantingHistoryRequestDTO  getChantingHistoryRequestDTO);
	
	public Integer getTotalNumberOfBeadsForToday();
	
	public String getValueFromMasterData(String key);
}
