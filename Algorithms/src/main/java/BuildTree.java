import java.util.Scanner;

public class BuildTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] strings = scanner.nextLine().split(",");
            TreeNode[] treeNodes = new TreeNode[strings.length];
            TreeNode root = null;
            for (int i = 0; i < strings.length; i++) {
                TreeNode cur = null;
                if (!strings[i].equals("null")) cur = new TreeNode(Integer.parseInt(strings[i]));
                treeNodes[i] = cur;
                if (i == 0) root = treeNodes[i];
            }
            // 到这里才是真正的给值阶段
            for (int i = 0; i * 2 + 2 < treeNodes.length; i++) {
                if (treeNodes[i] != null){
                    treeNodes[i].left = treeNodes[i*2+1];
                    treeNodes[i].right = treeNodes[i*2+2];
                }
            }
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
