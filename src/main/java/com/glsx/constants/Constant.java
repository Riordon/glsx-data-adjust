package com.glsx.constants;

import com.glsx.utils.ConfigUtil;

/**
 * Created by Administrator on 2018/9/13.
 */
public class Constant {
    // MYSQL config
    public static final String MYSQL_JDBC_DRIVER =  ConfigUtil.getConfigUtil().getString("mysql.jdbc.driver");
}
