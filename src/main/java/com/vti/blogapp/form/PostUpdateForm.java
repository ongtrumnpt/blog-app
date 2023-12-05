package com.vti.blogapp.form;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostUpdateForm {
    private String title;
    private String description;
    private String content;
}
