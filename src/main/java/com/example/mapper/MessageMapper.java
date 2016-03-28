package com.example.mapper;

import com.example.model.Message;

public interface MessageMapper {

    Message findOne(String code);
}
