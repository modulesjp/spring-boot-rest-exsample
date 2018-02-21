package rest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rest.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
