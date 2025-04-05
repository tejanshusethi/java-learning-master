// /*
// // Definition for a Node.
// class Node {
//     public int val;
//     public List<Node> neighbors;
//     public Node() {
//         val = 0;
//         neighbors = new ArrayList<Node>();
//     }
//     public Node(int _val) {
//         val = _val;
//         neighbors = new ArrayList<Node>();
//     }
//     public Node(int _val, ArrayList<Node> _neighbors) {
//         val = _val;
//         neighbors = _neighbors;
//     }
// }
// */

// class Solution {
//     private Map<Node, Node> map = new HashMap<>();
// // private void dfs(Node node,Node clone_node){
// //     // go through all the neighbours of the node
// //     for(Node n:node.neighbors){
// //         if(!mp.containsKey(n)){
// //             // if the neighbour hasnot been cloned yet,clone it and add it to the map
// //             Node clone=new Node(n.val);
// //             mp.put(n,clone);//add to the map to keep track of cloned nodes
// //             clone_node.neighbors.add(clone);//addd the cloned neibour to clone_node's neighbour       
// //             dfs(n,clone);

// //         }else{
// //             // if the neighbour is already cloned,just link it
// //             clone_node.neighbors.add(mp.get(n));//add the cloned neighbour to the cloned_node's neighbour
// //         }
// //     }
// // }
// public Node cloneGraph(Node node) {
//      if (node == null) {
//         return null; // Handle empty graph
//     }

//     if (map.containsKey(node)) {
//         return map.get(node); // Return the cloned node if already processed
//     }

//     // Clone the current node
//     Node cloneNode = new Node(node.val);
//     map.put(node, cloneNode);

//     // Recursively clone all the neighbors
//     for (Node neighbor : node.neighbors) {
//         cloneNode.neighbors.add(cloneGraph(neighbor));
//     }

//     // 2nd method jo mujhe smjh aa rha hain 
//     // clear the map to ensure that its clean before cloning
//     // mp.clear();
//     // // create the clone for the given node
//     // Node clone_node=new Node(node.val);
//     // mp.put(node,clone_node);//add the original node to the map
//     // // dfs to clone the entire graph
//     // dfs(node,clone_node);


//     return cloneNode; // Return the cloned graph
    
// }
// }