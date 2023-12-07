package com.vti.blogapp.repository;

import ch.qos.logback.classic.model.processor.LoggerModelHandler;
import com.vti.blogapp.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface CommentRepository extends JpaRepository<Comment, Long>{
    }

