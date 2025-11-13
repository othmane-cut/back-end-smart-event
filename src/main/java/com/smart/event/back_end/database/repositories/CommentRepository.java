package com.smart.event.back_end.database.repositories;

import com.smart.event.back_end.database.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository  extends JpaRepository<Comment , Long> {
}
