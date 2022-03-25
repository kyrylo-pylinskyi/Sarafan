package pylinskyi.sarafan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pylinskyi.sarafan.domain.User;

public interface UserDetailsRepo extends JpaRepository<User, String> {

}
