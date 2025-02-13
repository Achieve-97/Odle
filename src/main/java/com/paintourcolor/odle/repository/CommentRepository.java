package com.paintourcolor.odle.repository;

import com.paintourcolor.odle.entity.Comment;
import com.paintourcolor.odle.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    Page<Comment> findAllByPostId(Long postId, Pageable pageable);
    boolean existsByIdAndPost_Id(Long commentId, Long postId);
}
