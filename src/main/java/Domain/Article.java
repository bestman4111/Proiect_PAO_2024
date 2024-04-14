package Domain;

public class Article {
    protected static int articleId = 0;
    protected String articleName;

    public Article(String articleName) {
        this.articleName = articleName;
        articleId++;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId = " + articleId +
                ", articleName = '" + articleName + '\'' +
                '}';
    }
}
