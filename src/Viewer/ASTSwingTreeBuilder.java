package Viewer;

import org.antlr.v4.runtime.tree.ParseTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTSwingTreeBuilder {

    public static DefaultMutableTreeNode buildTree(ParseTree parseTree) {
        if (parseTree == null) return null;

        // Create node with rule name or token text
        String label = getNodeLabel(parseTree);
        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode(label);

        // Recursively add children
        for (int i = 0; i < parseTree.getChildCount(); i++) {
            ParseTree child = parseTree.getChild(i);
            DefaultMutableTreeNode childNode = buildTree(child);
            if (childNode != null) treeNode.add(childNode);
        }

        return treeNode;
    }

    private static String getNodeLabel(ParseTree node) {
        String className = node.getClass().getSimpleName();
        String text = node.getText();

        // Clean up class name for readability
        if (className.endsWith("Context")) {
            className = className.substring(0, className.length() - "Context".length());
        }

        return className + " : \"" + text + "\"";
    }
}