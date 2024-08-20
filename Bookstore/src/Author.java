public class Author {
    private int authorId;
    private String authorName;
    private String authorNationality;

    public Author(int authorId, String authorName, String authorNationality) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorNationality = authorNationality;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorNationality() {
        return authorNationality;
    }

    public void setAuthorNationality(String authorNationality) {
        this.authorNationality = authorNationality;
    }
}
