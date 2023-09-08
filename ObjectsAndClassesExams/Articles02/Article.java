package Articles02;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
    // ALT + Insert - правим конструктор, после селектираме кои елементи да включва
        this.title = title;
        this.content = content;
        this.author = author;
    }
    // пак с ALT + Insert избираме гетър и после селектираме исканите елементи
    // или с десен клавиш и Generate
    public String getTitle() {
        return this.title;
    }
    public String getContent() {
        return this.content;
    }
    public String getAuthor() {
        return this.author;
    }
    public void edit (String newContent){
        this.content = newContent;
        //избираме void за метода, защото ще променяме елемент
        // и пъблик, за да имат достъп всички
    }
    public void changeAuthor (String newAuthor){
        this.author = newAuthor;
    }
    public void rename (String newTitle){
        this.title = newTitle;
    }
    @Override
    public String toString (){
        // метод, който ми показва как да изглежда обекта под формата на текст
        // по default той е "{package}.{class}@{address};
        //искаме да го пренапишем на "{title} - {content}: {author}",
        // затова избираме @override
        return this.title + " - " + this.content + ": " + this.author;
    }
}
