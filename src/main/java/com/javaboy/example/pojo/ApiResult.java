package com.javaboy.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResult {
    /** 代码 */
    private String code;

    /** 结果 */
    private String msg;
}
