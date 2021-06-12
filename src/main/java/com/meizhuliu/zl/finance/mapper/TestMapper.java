package com.meizhuliu.zl.finance.mapper;

import com.meizhuliu.zl.finance.domian.UserAccountsDO;
import org.apache.ibatis.annotations.Param;

/**
 * @author chxy
 * @date 2021/6/12 16:39
 */
public interface TestMapper {

    UserAccountsDO listById(@Param("id") Long id);
}
