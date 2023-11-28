package com.cm.reditclone.repository;

import com.cm.reditclone.model.Post;
import com.cm.reditclone.model.Subreddit;
import com.cm.reditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}