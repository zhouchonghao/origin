package com.example.demo.requestModel;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by bill on 2016/12/18.
 */
@Data
public class PageResponse {
    private BigDecimal numPrice;
    private long total;
    private Object list;
}
