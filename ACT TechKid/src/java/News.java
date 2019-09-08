/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HUONG XINH GAI
 */
public class News {
    private int id;
    private String title;
    private String content;
    private int author;
    private String summary;

    public News() {
    }

    public News(int id, String title, String content, int author, String summary) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.summary = summary;
    }
    
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getAuthor() {
        return author;
    }

    public String getSummary() {
        return summary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    
}
