package edu.adse2501.sess08_design_patterns_and_other_features;

/**
 * Java program that demonstrates delegation using a DocumentPrinter that
 * delegates printing work to specific PrintService implementations
 * @author a.nyanjui
 */
public class DelegationDemo 
{
    public static void main(String[] args)
    {
        // Declare and instantiate a DocumentPrinter object
        
        
        // Print a PDF Document
        
        
        // Print a Text Docuement
        
    }
}

class DocumentPrinter
{
    private final PDFPrinter pdfPrinter;
    private final TextPrinter textPrinter;
    
    public DocumentPrinter()
    {
        this.pdfPrinter = new PDFPrinter();
        this.textPrinter = new TextPrinter();
    }
    
    public void printDocument(String content, String type)
    {
        if("pdf".equalsIgnoreCase(type))
            pdfPrinter.print(content);
        else if("text".equalsIgnoreCase(type))
            textPrinter.print(content);
        else
            System.err.println("Sorry, you gave us an unsupported type: " + type);
    }
}

interface PrintService
{
    void print(String document);
}

class PDFPrinter implements PrintService
{
    @Override
    public void print(String content)
    {
        System.out.println("Printing PDF Document: " + content);
    }
}

/**
 * TextPrinter class is a specific implementation of the PrintService interface
 * for Text Documents. 
 */
class TextPrinter implements PrintService
{
    @Override
    public void print(String content)
    {
        System.out.println("Printing Text Document: " + content);
    }
}