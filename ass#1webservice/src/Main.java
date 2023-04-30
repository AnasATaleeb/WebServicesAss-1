import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
public class Main {
	
    public static void main(String[] args) {
    	HashMap<String,Book> books= new HashMap<>();
        try {
            File input = new File("data.txt");
            DocumentBuilderFactory factoury = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factoury.newDocumentBuilder();
            Document doc = builder.parse(input);
            doc.getDocumentElement().normalize();
//            System.out.println("=========================================================================");
//            System.out.printf("| Root element : %-55s|\n",doc.getDocumentElement().getNodeName());
            NodeList node = doc.getElementsByTagName("book");
            System.out.println("=========================================================================");

            for (int curr = 0; curr < node.getLength(); curr++) {
            	
                Node newNode = node.item(curr);
//                System.out.printf("| Current Element  | %-51s|\n", newNode.getNodeName());

                if (newNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) newNode;
                    Book b = new Book(element.getAttribute("id"),element.getElementsByTagName("author").item(0).getTextContent(),element
                            .getElementsByTagName("title")
                            .item(0)
                            .getTextContent(),element
                            .getElementsByTagName("genre")
                            .item(0)
                            .getTextContent(),Double.parseDouble(element
                            .getElementsByTagName("price")
                            .item(0)
                            .getTextContent()),element
                            .getElementsByTagName("publish_date")
                            .item(0)
                            .getTextContent(),element
                            .getElementsByTagName("description")
                            .item(0)
                            .getTextContent());
                    books.put(b.getBookId(), b);
                    
                }
                
            }
            System.out.print("Enter id of the book to print informations : ");
            Scanner sc = new Scanner(System.in);
            
            String id = sc.nextLine();
            System.out.println("=========================================================================");
            try{
            	books.get(id).printBook();
            }catch (Exception e) {
				System.out.println("Book does not found");
			}
            
			sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}