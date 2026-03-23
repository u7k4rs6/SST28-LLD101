public class JsonWriter {
    public String generateJson(Document doc) {
        String output = "{ \"title\": \"" + doc.title + "\", \"content\": \"" + doc.content + "\" }";
        return output;
    }
}