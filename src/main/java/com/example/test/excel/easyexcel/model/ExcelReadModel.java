package com.example.test.excel.easyexcel.model;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description： excel 导入对应当前sheet列对象
 * @author：王帅
 * @date：2022-07-19
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExcelReadModel {
    // @ExcelProperty：指定当前字段对应excel中的那一列
    @ExcelProperty("订单编号")
    private String orderNumber;

    @ExcelProperty("商品名称")
    private String name;

    @ExcelProperty("价格")
    private BigDecimal price;

    @ExcelProperty("amount")
    private Integer amount;

    @ExcelProperty("生产日期")
    private Date dateInProduced;

    /**
     * 导入时忽略此字段
     */
    @ExcelIgnore
    private String ignored;
}