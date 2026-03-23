public class CsvWriter {
    public String generateCsv(Document doc) {
        String output = "Title,Content\n";
        output = output + doc.title + "," + doc.content + "\n";
        return output;
    }
}