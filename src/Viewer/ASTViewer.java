package Viewer;

import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTViewer {

    public static void showAST(Object astRoot) {
        DefaultMutableTreeNode rootNode = ASTSwingTreeBuilder.buildTree((ParseTree) astRoot);
        JTree tree = new JTree(rootNode);
        JScrollPane scrollPane = new JScrollPane(tree);

        JFrame frame = new JFrame("AST Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
