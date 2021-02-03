package com.clive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.sql.ast.expr.SQLCaseExpr.Item;
import com.clive.bean.Items;
import com.clive.service.ItemService;

@Controller
public class ItemsController {
  @Autowired
  private ItemService itemService;
  @RequestMapping("/item")
  public ModelAndView showIndex() {
	  List<Items> list = itemService.findItemsAll();
      ModelAndView andView = new ModelAndView();
      andView.addObject("itemList", list);
      andView.setViewName("itemList");
      return andView;
  }
}
