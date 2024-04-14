package Service;

import Domain.Article;
import Domain.Book;

public class ArticleService {
    Article[] articles;
    private int lastIndex;
    private int maxNoOfArticles;

    public ArticleService(int maxNoOfArticles) {
        this.articles = new Article[maxNoOfArticles];
        this.lastIndex = 0;
        this.maxNoOfArticles = maxNoOfArticles;
    }

    public void addArticle(Article article) {
        if(lastIndex < articles.length) {
            articles[lastIndex] = article;
            System.out.println("Added article at index " + lastIndex);
            System.out.println(article);
            lastIndex++;
        }
        else {
            throw new ArrayIndexOutOfBoundsException("Maximum number of articles reached");
        }
    }
}
