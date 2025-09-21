package Viewer;

import javax.swing.tree.DefaultMutableTreeNode;

public class ASTTreeBuilder {
    public static DefaultMutableTreeNode buildTree(Object astNode) {
        if (astNode == null) return null;
        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode(astNode.toString());

        // Use reflection to find child fields (for demonstration; you can improve this)
        for (java.lang.reflect.Field field : astNode.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                Object value = field.get(astNode);
                if (value == null) continue;
                if (value instanceof java.util.List) {
                    for (Object item : (java.util.List<?>) value) {
                        DefaultMutableTreeNode child = buildTree(item);
                        if (child != null) treeNode.add(child);
                    }
                } else if (!isPrimitiveOrString(value)) {
                    DefaultMutableTreeNode child = buildTree(value);
                    if (child != null) treeNode.add(child);
                } else {
                    // For primitives/strings, show as leaf
                    treeNode.add(new DefaultMutableTreeNode(field.getName() + " = " + value));
                }
            } catch (IllegalAccessException e) {
                // ignore
            }
        }
        return treeNode;
    }

    private static boolean isPrimitiveOrString(Object obj) {
        Class<?> c = obj.getClass();
        return c.isPrimitive() || c == String.class || Number.class.isAssignableFrom(c) || c == Boolean.class || c.isEnum();
    }
}
