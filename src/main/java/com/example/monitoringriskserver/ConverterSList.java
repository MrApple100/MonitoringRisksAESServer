package com.example.monitoringriskserver;

import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;
import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.persistence.Converter;
import java.lang.reflect.Type;
import java.util.List;

public class ConverterSList {
    /*
    @WritingConverter
    public String from(List list){
        Gson gson = new Gson();

        return gson.toJson(list);
    }
    @ReadingConverter
    public List to(String str){
        Gson gson = new Gson();
        Type type = new TypeToken<List>() {
        }.getType();
        return gson.fromJson(str,type);
    }

     */
}