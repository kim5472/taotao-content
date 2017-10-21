package com.taotao.content.service;

import java.util.List;

import com.taotao.common.utils.TaotaoResult;
import com.taotao.pojo.TbContent;

public interface ContentService {
	
	TaotaoResult addContent(TbContent tbContent);
	List<TbContent> getContentByCid(Long cid);
}
