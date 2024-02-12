package inc.sims.hustles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import inc.sims.hustles.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
