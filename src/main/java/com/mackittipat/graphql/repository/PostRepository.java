package com.mackittipat.graphql.repository;

import com.mackittipat.graphql.domain.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

}
