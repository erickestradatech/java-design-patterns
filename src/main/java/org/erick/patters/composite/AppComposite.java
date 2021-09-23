package org.erick.patters.composite;

public class AppComposite {
    public static void main(String[] args) {

        Directory doc = new Directory("Documents");
        Directory java = new Directory("Java");

        java.addComponent(new File("composite-pattern.docx"));
        Directory stream = new Directory("API Stream");
        stream.addComponent(new File("stream-map.docx"));

        java.addComponent(stream);

        doc.addComponent(java);
        doc.addComponent(new File("cv.docx"));
        doc.addComponent(new File("log.jpeg"));
//        System.out.println(doc.toShow(0));

        boolean found = doc.search("composite-pattern.docx");
        System.out.println("Found \"composite-pattern\"" + found);

        found = doc.search("cv.docx");
        System.out.println("Found cv.docx: "  + found);
    }
}
