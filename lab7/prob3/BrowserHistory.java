package lab7.prob3;

import java.util.Stack;

public class BrowserHistory {
    private final Stack<String> backStack;
    private final Stack<String> forwardStack;
    private String currentUrl;

    public BrowserHistory(String homePage) {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentUrl = homePage;
    }

    public void visit(String url) {
        backStack.push(currentUrl);
        forwardStack.clear();
        currentUrl = url;
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("No history to go back to.");
            return;
        }

        forwardStack.push(currentUrl);
        currentUrl = backStack.pop();
        System.out.println("Back to: " + currentUrl);
    }
    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No forward history.");
            return;
        }

        backStack.push(currentUrl);
        currentUrl = forwardStack.pop();
        System.out.println("Forward to: " + currentUrl);
    }

    public String getCurrentUrl() {
        return currentUrl;
    }
}
