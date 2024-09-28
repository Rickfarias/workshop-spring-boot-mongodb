package com.rickfarias.workshopmongo.repository;

import com.rickfarias.workshopmongo.domain.Post;
import com.rickfarias.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
