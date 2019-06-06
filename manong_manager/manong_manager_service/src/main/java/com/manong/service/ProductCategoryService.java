package com.manong.service;

import pojo.EasyUITree;
import pojo.ResponseJsonResult;

import java.util.List;

/**
 * @Author: Topy
 * @Date: 2019/5/7 21:45
 */

public interface ProductCategoryService {

    List<EasyUITree> findProductCategoryListByParentId(Short parentid);

    ResponseJsonResult addCategory(Short parentid, String name);

    ResponseJsonResult deleteCateory(Short parentid,Short id);


}
