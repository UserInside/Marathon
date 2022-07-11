package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        newNode(14, root);
        newNode(11, root);
        newNode(5, root);
        newNode(8, root);
        newNode(16, root);
        newNode(15, root);
        newNode(18, root);
        newNode(23, root);
        newNode(22, root);
        newNode(27, root);
        newNode(24, root);
        newNode(150, root);
        dfs(root);

    }

    public static void newNode(int newNodeValue, Node root) {
        if (newNodeValue < root.getValue()) {
            if (root.getLeftSon() == null) {
                Node newNode = new Node(newNodeValue, root);
                root.setLeftSon(newNode);
                System.out.println("создан левый сын --> " + newNode.getValue());
            } else {
                newNode(newNodeValue, root.getLeftSon());
            }
        } else if (newNodeValue >= root.getValue()) {
            if (root.getRightSon() == null) {
                Node newNode = new Node(newNodeValue, root);
                root.setRightSon(newNode);
                System.out.println("создан правый сын --> " + newNode.getValue());
            } else {
                newNode(newNodeValue, root.getRightSon());
            }
        }
    }

    public static void dfs(Node root) {
        if (root.isOutputed()) {
            if (root.getParent() == null)
                return;
            dfs(root.getParent());

        } else {
            if (root.getLeftSon() != null && !root.getLeftSon().isOutputed()) {
                dfs(root.getLeftSon());
            } else if (root.getLeftSon() == null || (root.getLeftSon() != null && root.getLeftSon().isOutputed())) {
                System.out.print(root.getValue() + " ");
                root.setOutputed(true);
                if (root.getRightSon() != null) {
                    dfs(root.getRightSon());
                } else if (root.getRightSon() == null || root.getRightSon().isOutputed()) {
                    dfs(root.getParent());
                }

            }
        }
    }
}
