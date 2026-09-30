import java.util.HashMap;

public class LFUCache {

    private int capacity;
    private int minFreq;
    HashMap<Integer, Node> nodeMap;
    HashMap<Integer , DLL> freqMap;


    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        this.nodeMap = new HashMap<>();
        this.freqMap = new HashMap<>();
    }

    public int get(int key) {
        Node node = nodeMap.get(key);

        if(node == null){
            return -1;
        }
        moveFreqBucket(node);
        return node.val;
    }

    public void put(int key, int value) {
        Node node = nodeMap.get(key);

        if(node == null){
            //node doesn't exist so we need to put it , but before that we need to check capacity

            if(nodeMap.size() == capacity){
                DLL dll = freqMap.get(minFreq);
                Node evictedNode = dll.removeNodeFromBack();
                nodeMap.remove(evictedNode.key);

                if(dll.size==0){
                    freqMap.remove(minFreq);
                }
            }
            // new element wih freq as 1;
            node = new Node(key , value);
            node.freq = 1;
            DLL freq1DLL = freqMap.get(1);

            if(freq1DLL == null){
                freq1DLL = new DLL();
            }
            freq1DLL.addToFront(node);
            freqMap.put(1 , freq1DLL);
            minFreq = 1;

        } else {
            node.val = value;
            moveFreqBucket(node);
        }
    }


    public void moveFreqBucket(Node node){
        int oldFreq = node.freq;
        DLL oldDLL = freqMap.get(oldFreq);
        DLL newDLL = freqMap.get(oldFreq+1);
        if(newDLL == null){
            //create new bucket and add node to it
            newDLL = new DLL();
            freqMap.put(oldFreq +1, newDLL);
        }

        // add the node to the front of bucket and remove it from its current bucket
        oldDLL.removeNode(node);
        if(oldDLL.size == 0){

            freqMap.remove(oldFreq);
            if (minFreq == oldFreq) {
                minFreq++;
            }
        }
        node.freq +=1; //update the node's freq field before adding it to the front of DLL;
        newDLL.addToFront(node);
    }


}
