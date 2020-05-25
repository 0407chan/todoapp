package com.chris.todoapp.springboot.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void lombok_test(){
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);

        // 책에서 준 예제는 lombok이 4.8버전이라 intlliJ 최신버전은 gradle을 6버전을 써서 서로 설정법이 다른가보다.
        // 그래서 오류가 나니까 4.10.2버전으로 gradle을 downgrade 해줘야 진행 된다. ㅋ
    }


}
