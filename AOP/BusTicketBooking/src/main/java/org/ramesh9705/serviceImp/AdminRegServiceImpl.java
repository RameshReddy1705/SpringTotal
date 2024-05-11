package org.ramesh9705.serviceImp;

import org.ramesh9705.model.AdminReg;
import org.ramesh9705.model.AdminRegDto;
import org.ramesh9705.repository.AdminRegRepo;
import org.ramesh9705.service.AdminRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class AdminRegServiceImpl implements AdminRegService
{
	@Autowired
	private AdminRegRepo adminRegRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public AdminReg addAdmin(AdminRegDto adminRegDto)
	{
		AdminReg adminReg = new AdminReg(
				adminRegDto.getAdminId(),
				adminRegDto.getAdminName(),
				adminRegDto.getAdminPhoneNumber(),
				adminRegDto.getAdminGmail(),
				adminRegDto.getUserName(),
//				adminRegDto.getPassword()
				this.passwordEncoder.encode(adminRegDto.getPassword())
				);
		return adminRegRepo.save(adminReg);
	}

	
}
