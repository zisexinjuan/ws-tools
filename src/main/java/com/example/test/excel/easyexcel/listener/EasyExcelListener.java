package com.example.test.excel.easyexcel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @description：
 * @author：王帅
 * @date：2022-07-19
 **/
public abstract class EasyExcelListener<T> extends AnalysisEventListener<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(EasyExcelListener.class);

    @Override
    public void invoke(T model, AnalysisContext analysisContext) {
        LOGGER.info("");
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        LOGGER.info("");
    }
}