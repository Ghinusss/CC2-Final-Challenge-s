//Ambales, Geneses L.
//CITCS - 1N 
//Final Challenge No. 4: Linked Lists Application

class Node {
    String url;
    Node prev, next;

    public Node(String url) {
        this.url = url;
    }
}

class BrowserHistory {
    private Node head, tail, current;

    public void visit(String url) {
        Node newNode = new Node(url);

        // Clear forward history if any
        if (current != null && current.next != null) {
            current.next = null;
        }

        // Add the new node
        if (current == null) {
            head = tail = newNode;
        } else {
            current.next = newNode;
            newNode.prev = current;
        }

        current = tail = newNode; // Update current and tail
        System.out.println("Visited: " + url);
    }

    public void goBack() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Went back to: " + current.url);
        } else {
            System.out.println("No previous page!");
        }
    }

    public void goForward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Went forward to: " + current.url);
        } else {
            System.out.println("No next page!");
        }
    }

    public void printHistory() {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print((temp == current ? "[" + temp.url + "] " : temp.url + " "));
        }
        System.out.println();
    }
}

public class FinalChall4 {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visit("google.com");
        browser.visit("stackoverflow.com");
        browser.visit("github.com");

        browser.goBack();
        browser.goBack(); m
        browser.goForward(); 

        browser.visit("youtube.com"); 

        browser.printHistory(); 
    }
}