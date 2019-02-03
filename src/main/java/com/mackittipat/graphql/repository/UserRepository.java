package com.mackittipat.graphql.repository;

import com.mackittipat.graphql.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
