package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class WebCrawling {
    public static void main(String[] args) {
        try {
            // 네이버 웹툰 크롤링
            Document doc = Jsoup.connect("https://comic.naver.com/webtoon/weekday.nhn").get();
            // System.out.println(doc.html());
            Elements result = doc.select("[id=realTimeRankFavorite]").select("li").select("a");
            // id 라는 속성 중 realTimeRankFavorite이라는 이름 찾기 id는 [], 태그는 그냥 쓰면 됨
            // class="rank" -> .select(".rank")
            List<String> list = result.eachText();
            int i = 0;
            for(String title : list) {
                System.out.printf("%d위 : %s\n", ++i, title);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}