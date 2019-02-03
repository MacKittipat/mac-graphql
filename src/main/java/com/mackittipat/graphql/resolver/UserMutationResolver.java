package com.mackittipat.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mackittipat.graphql.domain.User;
import com.mackittipat.graphql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private UserRepository userRepository;

    public User createUser(String name, Integer age) {
        User user = new User(name, age);
        return userRepository.save(user);
    }

}
