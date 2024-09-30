package com.rickfarias.workshopmongo.resources;

import com.rickfarias.workshopmongo.domain.Post;
import com.rickfarias.workshopmongo.domain.User;
import com.rickfarias.workshopmongo.dto.UserDTO;
import com.rickfarias.workshopmongo.services.PostService;
import com.rickfarias.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = postService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
