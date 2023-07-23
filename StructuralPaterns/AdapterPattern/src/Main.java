public class Main {
    public static void main(String[] args) {

        /*
        With the Adapter Patternt we can use the Printer class in the client code
        through the PrinterAdapter by converting the interface of the Printer into
        the ModernPrinter interface that the client code expects
         */


        Printer printer = new Printer();
        ModernPrinter modernPrinter = new PrinterAdapter(printer);

        modernPrinter.print("Hello");
    }
}