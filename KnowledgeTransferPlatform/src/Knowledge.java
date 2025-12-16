public class Knowledge {
    private String title;
    private String description;
    private String author;

    public Knowledge(String title, String description, String author) {
        this.title = title;
        this.description = description;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getAuthor() { return author; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setAuthor(String author) { this.author = author; }

    @Override
    public String toString() {
        return "Title: " + title + " | Description: " + description + " | Author: " + author;
    }
}
