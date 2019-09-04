package com.dcc.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.dcc.po.News;
import com.dcc.po.NewsType;
import com.dcc.service.inter.ServiceNewsInter;

@Controller
public class NewsHandler {
	@Autowired
	private ServiceNewsInter newsInter;
	
	
	@RequestMapping(value="/selectType.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String selectType() throws Exception {
		String types = newsInter.selectNewsType();
		return types;
	}
	
	
	@RequestMapping("/updateImgs.do")
	@ResponseBody
	public String updateImgs(MultipartFile imgsg) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
			String yimg  = imgsg.getOriginalFilename();//获取图片原始名字
			if(imgsg!=null && yimg!=null && yimg.length()>0) {
				String path = "E:\\apache-tomcat-9.0.11\\webapps\\test\\";
				File file = new File(path+yimg);
				imgsg.transferTo(file);//写入磁盘
				map.put("state", "1");
				map.put("names", yimg);
			}
		return JSON.toJSONString(map);
	}
	
	@RequestMapping("/addNews.do")
	public String addNews(News news) throws Exception {
		newsInter.addNews(news);
		return "redirect:/html/news.html";
	}
	
	@RequestMapping("/counts.do")
	@ResponseBody
	public String counts() throws Exception {
		String cc = newsInter.countNews();
		return cc;
	}
	
	@RequestMapping(value="/findPage.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String findPage(Integer Fenye) throws Exception {
		String fy = newsInter.fenyeNews(Fenye);
		return fy;
	}
	
	@RequestMapping(value="/delnews.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String delnews(Integer result) throws Exception {
		String del = newsInter.deleteNews(result);
		return del;
	}
	
	@RequestMapping(value="/delsn.do")
	@ResponseBody
	public String delsn(String result) throws Exception {
		String del = newsInter.delsNews(result);
		return del;
	}
	
	@RequestMapping(value="/findIdNew.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String findIdNew(Integer id) throws Exception {
	String news = newsInter.findIdN(id);
		return  news;
	}
	
	@RequestMapping("/updatenew.do")
	public String updatenew(News news) throws Exception {
		newsInter.updateNew(news);
		return "redirect:/html/news.html";
	}
	
	@RequestMapping("/addType.do")
	public String addType(NewsType type) throws Exception {
		newsInter.addNewsType(type);
		return "redirect:/html/news_add.html";
	}
	
	@RequestMapping(value="/searchnews.do",produces="text/html;charset=UTF-8;")
	@ResponseBody
	public String searchnews(String title) throws Exception {
		String search = newsInter.searchNew(title);
		return  search;
	}

}
