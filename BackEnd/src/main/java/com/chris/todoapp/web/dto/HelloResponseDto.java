package com.chris.todoapp.web.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public class HelloResponseDto {

    private final String name;

    private final int amount;

//    public HelloResponseDto(String name, int amount){
//        this.name = name;
//        this.amount = amount;
//    }
//
//    public String getName(){
//        return this.name;
//    }
//
//    public int getAmount(){
//        return this.amount;
//    }

}
