package rest.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rest.domain.repository.UserRepository;

@Component
public class UserDao {

    @Autowired
    private UserRepository repository;

}
