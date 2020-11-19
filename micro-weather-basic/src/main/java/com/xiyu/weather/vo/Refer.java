package com.xiyu.weather.vo;

import com.xiyu.weather.base.BaseBean;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Refer extends BaseBean {
    List<String> sources;
    List<String> license;
}
