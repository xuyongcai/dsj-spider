package com.xiaochai.dsjspider.util;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 匹配工具类
 *
 */
public class MatchUtil {
	public static String getTopDomain(String url){
		String topDomain = null ;
		try {
			String host = new URL(url).getHost().toLowerCase();
			Pattern pattern = Pattern.compile("[^\\.]+(\\.com\\.cn|\\.net\\.cn|\\.org\\.cn|\\.gov\\.cn|\\.com|\\.net|\\.cn|\\.org|\\.cc|\\.me|\\.tel|\\.mobi|\\.asia|\\.biz|\\.info|\\.name|\\.tv|\\.hk)");
			Matcher matcher = pattern.matcher(host);
			while (matcher.find()) {
				topDomain = matcher.group();
				return topDomain;
			}
		} catch (MalformedURLException e) {
			System.out.println("url="+url);
			e.printStackTrace();
		}
		return topDomain;
	}
}
