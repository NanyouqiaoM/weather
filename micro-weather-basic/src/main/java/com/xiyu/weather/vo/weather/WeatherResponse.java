package com.xiyu.weather.vo.weather;

import com.xiyu.weather.base.BaseBean;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class WeatherResponse extends BaseBean {
    static final long serialVersionUID = 1L;
    private String code;
    private Date updateTime;
    private String fxLink;
    private List<Daily> daily;
    private Refer refer;
}
