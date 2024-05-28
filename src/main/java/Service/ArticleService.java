package Service;

import Domain.Article;
import Domain.Book;

import java.time.LocalTime;

public class ArticleService {
    Article[] articles;
    private int lastIndex;
    private int maxNoOfArticles;

    public ArticleService(int maxNoOfArticles) {
        this.articles = new Article[maxNoOfArticles];
        this.lastIndex = 0;
        this.maxNoOfArticles = maxNoOfArticles;
        CSVFile.addDataToArray(new String[]{"Created article service", LocalTime.now().toString()});
    }

    public void addArticle(Article article) {
        if(lastIndex < articles.length) {
            articles[lastIndex] = article;
            System.out.println("Added article at index " + lastIndex);
            System.out.println(article);
            lastIndex++;
            AddToDB.addArticleToDB(article);
            CSVFile.addDataToArray(new String[]{"Added article " + article.getArticleName() + " in article service", LocalTime.now().toString()});
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Maximum number of articles reached");
        }
    }
}
