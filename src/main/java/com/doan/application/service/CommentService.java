package com.doan.application.service;

import com.doan.application.model.request.CreateCommentPostRequest;
import com.doan.application.model.request.CreateCommentProductRequest;
import com.doan.application.entity.Comment;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest, long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
