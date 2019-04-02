/**
 * @ClassName TopK
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/4/1 19:09
 */
package sword2offer;

import java.util.*;

//public class TopK<E extends Comparable> {
//    private PriorityQueue<E> queue;
//    private int maxSize; //堆的最大容量
//
//    public TopK(int maxSize) {
//        if (maxSize <= 0) {
//            throw new IllegalStateException();
//        }
//        this.maxSize = maxSize;
//        this.queue = new PriorityQueue<>(maxSize, new Comparator<E>() {
//            @Override
//            public int compare(E o1, E o2) {
//                // 最大堆用o2 - o1，最小堆用o1 - o2
//                return (o1.compareTo(o2));
//            }
//        });
//    }
//
//    public void add(E e) {
//        if (queue.size() < maxSize) {
//            queue.add(e);
//        } else {
//            E peek = queue.peek();
//            if (e.compareTo(peek) > 0) {
//                queue.poll();
//                queue.add(e);
//            }
//        }
//
//    }
//
//    public List<E> get() {
//        List<E> list = new ArrayList<>(queue);
//        //Collections.sort(list);
//        return list;
//    }
//
//    public static void main(String[] args) {
//        int[] array = {4, 5, 1, 6, 2, 7, 3, 8,10};
//        TopK pq = new TopK(4);
//        PriorityQueue res=new PriorityQueue(4);
//        for (int n : array) {
//            pq.add(n);
//        }
//        System.out.println(pq.get());
//
//
//    }
//}


public class TopK {
    private int k;
    private PriorityQueue<Integer> queue;

    public TopK(int k){
        this.k=k;
        //this.queue=new PriorityQueue<Integer>(k);
        this.queue=new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o2-o1);
            }
        });


    }
    public void add(Integer num){
        if(queue.size()<k){
            queue.add(num);
        }else{
            Integer e=queue.peek();
            if(e>num){
                queue.poll();
                queue.offer(num);

            }
        }
    }
    public List get(){
        ArrayList list = new ArrayList(queue);
        return list;
    }
    public static void main(String[] args) {
        int[] array = {4,5,1,6,2,7,3,8,10};
        TopK pq = new TopK(4);
        for (int n : array) {
            pq.add(n);
        }
        System.out.println(pq.get());
    }
}