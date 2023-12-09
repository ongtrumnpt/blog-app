package com.vti.blogapp.repository;

import ch.qos.logback.classic.model.processor.LoggerModelHandler;
import com.vti.blogapp.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long>{
        // findBy-tìm kiếm, countBy-đếm, existsBy-kiểm tra tồn tại, deleteBy-xoá
        // List<Comment> findByEmail(String email);
        // List<Comment> findByNameAndEmail(String name, String email);
    Page<Comment> findByPostId(Long postId, Pageable pageable);
    }

