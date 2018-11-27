package com.xiaochai.dsjspider.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 正则表达式匹配工具
 *
 */
public class RegexUtil {

	public static String getPageInfoByRegex(String content,Pattern pattern,int groupNo){
		  Matcher matcher = pattern.matcher(content);
		 if(matcher.find()){
			 return matcher.group(groupNo).trim();
		 }
		return "0";
	}
}
