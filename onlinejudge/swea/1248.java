public class SWEA_1248 {

    static final Scanner scan = new Scanner(System.in);

    static int N;
    static int V;
    static int E;
    static List<List<Integer>> adjacencyList;
    static Integer[] parents;
    static boolean[] visited;
    static int depth;
    static int trial = 1;

    public static void main(String[] args) {
        N = scan.nextInt();

        for (int i = 0; i < N; i += 1) {
            initialize();

            int childNode1 = scan.nextInt();
            int childNode2 = scan.nextInt();

            parseParentsNode();

            int commonAncestor = findLowestCommonAncestor(childNode1, childNode2);

            dfs(commonAncestor);

            printAnswer(commonAncestor);
            reset();
        }
    }

    private static void initialize() {
        V = scan.nextInt();
        visited = new boolean[V + 1];

        adjacencyList = new ArrayList<>();
        for (int j = 0; j < V + 1; j += 1) {
            adjacencyList.add(new LinkedList<>());
        }

        E = scan.nextInt();
    }

    private static void reset() {
        trial += 1;
        depth = 0;
    }

    private static void printAnswer(int rootNode) {
        System.out.print("#");
        System.out.print(trial);
        System.out.print(" ");
        System.out.print(rootNode);
        System.out.print(" ");
        System.out.println(depth);
    }

    private static int findLowestCommonAncestor(int childNode1, int childeNode2) {
        List<Integer> parents1 = new ArrayList<>();
        while (parents[childNode1] != null) {
            parents1.add(parents[childNode1]);
            childNode1 = parents[childNode1];
        }

        List<Integer> parents2 = new ArrayList<>();
        while (parents[childeNode2] != null) {
            parents2.add(parents[childeNode2]);
            childeNode2 = parents[childeNode2];
        }

        int index1 = parents1.size() - 1;
        int index2 = parents2.size() - 1;

        int rootNode = 1;
        while (index1 >= 0 && index2 >= 0) {
            if (parents1.get(index1).equals(parents2.get(index2))) {
                rootNode = parents1.get(index1);
            }
            index1 -= 1;
            index2 -= 1;
        }
        return rootNode;
    }

    private static void parseParentsNode() {
        parents = new Integer[V + 1];
        parents[0] = -1;
        for (int j = 0; j < E; j += 1) {
            int parent = scan.nextInt();
            int child = scan.nextInt();

            adjacencyList.get(parent).add(child);

            parents[child] = parent;
        }
    }

    private static void dfs(int node) {
        List<Integer> childNodes = adjacencyList.get(node);
        if (childNodes.isEmpty()) {
            return;
        }

        depth++;

        for (int childNode : childNodes) {
            dfs(childNode);
        }
    }
}