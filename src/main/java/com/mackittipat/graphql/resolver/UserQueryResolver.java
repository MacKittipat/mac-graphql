package com.mackittipat.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mackittipat.graphql.domain.User;
import com.mackittipat.graphql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers() {
        return (List<User>) userRepository.findAll();
    }

}
