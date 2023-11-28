package com.cm.reditclone.repository;

import com.cm.reditclone.model.Comment;
import com.cm.reditclone.model.Post;
import com.cm.reditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}