package IVT05.PP;

public class Hello {

    private final long id;
    private final String content;

    public Hello(long id, String content) {
        this.id = id;
        this.content = content;
    }
    public Hello() {
        this.id = 0;
        this.content = "example";
    }
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }


}
