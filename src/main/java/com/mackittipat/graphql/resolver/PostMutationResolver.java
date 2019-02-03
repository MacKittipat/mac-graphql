package com.mackittipat.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mackittipat.graphql.domain.Post;
import com.mackittipat.graphql.domain.User;
import com.mackittipat.graphql.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private PostRepository postRepository;

    public Post createPost(String title, Long userId) {
        User user = new User();
        user.setId(userId);

        Post post = new Post();
        post.setTitle(title);
        post.setUser(user);

        return postRepository.save(post);
    }
}
