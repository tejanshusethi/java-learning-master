// class Solution {
//     class Node{
//         String node;
//         double weight;
//         Node(String node,double weight){
//             this.node=node;
//             this.weight=weight;
//         }
//     }
//     private double findpath( Map<String,List<Node>>graph,String current,String target,Set<String>visited,double currentProduct){
//         //  if we have already visited the nodes,return 0 to avoid cycles
//         if(visited.contains(current))return -1.0;
//         // If we reached the target, return the current product (final result)
//         if(current.equals(target))return currentProduct;
//         visited.add(current);// Mark the current node as visited
//         // explore all neighbours of current node
//         for(Node neighbour:graph.get(current)){
//         double result=findpath(graph,neighbour.node,target,visited,     currentProduct*neighbour.weight);
//             if(result !=-1.0){
//                 return result;
//             }

//         }
//         return -1.0;
//     }
//     public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
//         // Step 1: Build the graph (adjacency list) - a map of variables and their relationships
//         Map<String,List<Node>>graph=new HashMap<>();
//         // build the graph from equations and values
//         for(int i=0;i<equations.size();i++){
//             String var1=equations.get(i).get(0);//numerator
//             String var2=equations.get(i).get(1);//denominator
//             double value=values[i];
//             // add the equation in both the graph in both directions(var1 -> var2 and var2 -> var1)
//             graph.putIfAbsent(var1,new ArrayList<>());
//             graph.putIfAbsent(var2,new ArrayList<>());
//             /*We add the corresponding edges (or relationships) to the graph:
// var1 -> var2 with weight value.
// var2 -> var1 with weight 1.0 / value. */
//             // var1/var2= value
//             graph.get(var1).add(new Node(var2,value));
//             // var2/var1=1/value
//             graph.get(var2).add(new Node(var1,1.0/value));
//         }
//         // process each query
//         double result[]=new double[queries.size()];
//         // loop over each query to find out the result
//         for(int i=0;i<queries.size();i++){
//             String start=queries.get(i).get(0);
//             String end=queries.get(i).get(1);
//             if(!graph.containsKey(start)||!graph.containsKey(end)){
//                 result[i]=-1.0;
//             }else{
//                 Set<String>visited=new HashSet<>();
//                 result[i]=findpath(graph,start,end,visited,1.0);
//             }
//         }
//         return result;

//     }
// }