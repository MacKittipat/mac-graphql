package com.mackittipat.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mackittipat.graphql.domain.Post;
import com.mackittipat.graphql.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PostQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAllPosts() {
        return (List<Post>) postRepository.findAll();
    }

}
