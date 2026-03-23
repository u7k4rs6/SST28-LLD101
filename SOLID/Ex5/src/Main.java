public class Main {
    public static void main(String[] args) {
        System.out.println("=== Basic Export System ===");

        Document myDoc = new Document("My Report", "This is the simple content.");

        CsvWriter csv = new CsvWriter();
        System.out.println("--- CSV ---");
        System.out.println(csv.generateCsv(myDoc));

        JsonWriter json = new JsonWriter();
        System.out.println("--- JSON ---");
        System.out.println(json.generateJson(myDoc));

        PdfWriter pdf = new PdfWriter();
        System.out.println("--- PDF ---");
        System.out.println(pdf.generatePdf(myDoc));
    }
}