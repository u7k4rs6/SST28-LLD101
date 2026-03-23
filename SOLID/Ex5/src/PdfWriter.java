public class PdfWriter {
    public String generatePdf(Document doc) {
        String output = "============== PDF ==============\n";
        output = output + "       " + doc.title + "       \n";
        output = output + "---------------------------------\n";
        output = output + doc.content + "\n";
        output = output + "=================================\n";
        return output;
    }
}