package com.vti.blogapp.repository;

import ch.qos.logback.classic.model.processor.LoggerModelHandler;
import com.vti.blogapp.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long>{
        // findBy-tìm kiếm, countBy-đếm, existsBy-kiểm tra tồn tại, deleteBy-xoá
        // List<Comment> findByEmail(String email);
        // List<Comment> findByNameAndEmail(String name, String email);
        // Page<Comment> findByPostId(Long postId, Pageable pageable);

        // @Query annotation
        // @Query("FROM Comment WHERE postId - ?1")
        //@Query(value = "SELECT * FROM Comment WHERE postId = ?1", nativeQuery = true)
        @Query(value = "SELECT * FROM Comment WHERE pos_id = :postId", nativeQuery = true)
        Page<Comment> findByPostId(@Param("postId") Long postId, Pageable pageable);

        @Query("DELETE Comment WHERE email = ?1")
        @Modifying
        void deleteByEmail(String email);
    }

