//This is the adapter class that implements the ModernPrinter interface
//and internally uses the Printer
public class PrinterAdapter implements ModernPrinter{

    private Printer printer;

    public PrinterAdapter(Printer printer){
        this.printer = printer;
    }


    //Adapts the implemented print method to be used
    //on the Printer class reference
    @Override
    public void print(String message) {
        printer.printMessage("Printer: " + message);
    }
}
