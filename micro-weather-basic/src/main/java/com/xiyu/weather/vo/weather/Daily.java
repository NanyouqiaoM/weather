package com.xiyu.weather.vo.weather;

import com.xiyu.weather.base.BaseBean;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Daily extends BaseBean {

    static final long serialVersionUID = 1L;
    Date fxDate;
    String sunrise;
    String sunset;
    String moonrise;
    String moonset;
    String tempMax;
    String tempMin;
    String iconDay;
    String textDay;
    String iconNight;
    String textNight;
    String wind360Day;
    String windDirDay;
    Date windScaleDay;
    String windSpeedDay;
    String wind360Night;
    String windDirNight;
    Date windScaleNight;
    String windSpeedNight;
    String humidity;
    String precip;
    String pressure;
    String vis;
    String uvIndex;
}
