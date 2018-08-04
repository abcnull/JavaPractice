import java.util.*;

/**
 * Created by 石磊 on 2018/8/4.
 */
public class Exam4 {
    private int n;

    public Exam4(int n) {
        this.n = n;
    }

    public void conduct(){
        Random random = new Random();
        List list = new ArrayList();
        Map<Integer,List<Integer>> map = new HashMap<Integer, List<Integer>>();
        System.out.print("随机生成50个小于100的数,分别为:");
        //随机生成50个数并且加入到list中
        for (int i = 0; i <50 ; i++) {
            int j = random.nextInt(100);
            list.add(j);
            System.out.print(j+",");
        }
        System.out.println();
        for (int i = 0; i <list.size() ; i++) {
            Integer j = Integer.parseInt(list.get(i).toString());
            if (map.get(j/10)==null){
                List<Integer> l = new LinkedList<Integer>();
                list.add(j);
                map.put(j/10,l);
            }else {
                map.get(j/10).add(j);
            }
        }
        System.out.print("Map中的数据为:{");
        for(Object key:map.keySet())
        {
            System.out.print(key+"=>"+map.get(key)+",");
            Collections.sort(map.get(key));
        }
        System.out.println("}");
        System.out.print("排序后的Map为:{");
        for(Object key:map.keySet())
        {
            System.out.print(key+"=>"+map.get(key)+",");
        }
        System.out.println("}");
    }
}
