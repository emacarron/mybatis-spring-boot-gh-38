package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.Message;

@Mapper
public interface MessageMapper {

    Message findOne(String code);
}
