package rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.domain.entity.User;
import rest.domain.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("")
public class UserApi {

    @Autowired
    private UserRepository repository;

    @GetMapping("get")
    public List<User> get() {
        return repository.findAll();
    }

}
