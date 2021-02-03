package com.clive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clive.bean.Items;
import com.clive.mapper.ItemsMapper;
import com.clive.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemsMapper itemsMapper;
	@Override
	public List<Items> findItemsAll() {
		List<Items> list = itemsMapper.findItemsAll();
		return list;
	}

}
