package com.vti.blogapp.service;

import com.vti.blogapp.dto.CommentDto;
import com.vti.blogapp.form.CommentCreateForm;
import com.vti.blogapp.mapper.CommentMapper;
import com.vti.blogapp.repository.CommentRepository;
import com.vti.blogapp.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    public CommentDto create(CommentCreateForm form, Long postId){
        var comment = CommentMapper.map(form);
        var post = postRepository.findById(postId).get();
        comment.setPost(post);
        var savedComment = commentRepository.save(comment);
        return CommentMapper.map(savedComment);
    }
}
