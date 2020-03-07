package com.mackenzie.cif.question.domain.dto;

import com.mackenzie.cif.question.domain.domain.Question;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class QuestionDTO {
    private String id;
    private String code;
    private String description;
    private String group;

    public static QuestionDTO create(Question q){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(q, QuestionDTO.class);
    }
}
