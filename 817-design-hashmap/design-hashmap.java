class MyHashMap {
    private int size = 1000;
    private LinkedList<Node>[] map;

    private class Node {
        int key, value;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        map = new LinkedList[size];
    }

    private int hash(int key) {
        return key % size;
    }

    public void put(int key, int value) {
        int index = hash(key);
        if (map[index] == null) map[index] = new LinkedList<>();
        for (Node node : map[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        map[index].add(new Node(key, value));
    }

    public int get(int key) {
        int index = hash(key);
        if (map[index] == null) return -1;
        for (Node node : map[index]) {
            if (node.key == key) return node.value;
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        if (map[index] == null) return;
        Node toRemove = null;
        for (Node node : map[index]) {
            if (node.key == key) {
                toRemove = node;
                break;
            }
        }
        if (toRemove != null) map[index].remove(toRemove);
    }
}
