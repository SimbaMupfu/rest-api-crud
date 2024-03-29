package inc.sims.hustles.service;

import java.util.List;

import inc.sims.hustles.entity.User;

public interface UserService {
	User createUser(User user);
	
	User getUserById(Long userId);
	
	List<User> getAllUsers();
	
	User updateUser(User user);
	
	void deleteUser(Long userId);
}
