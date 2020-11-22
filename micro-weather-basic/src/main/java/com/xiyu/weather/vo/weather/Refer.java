package com.xiyu.weather.vo.weather;

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
    static final long serialVersionUID = 1L;
    List<String> sources;
    List<String> license;
}
