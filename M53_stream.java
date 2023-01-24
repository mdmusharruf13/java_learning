import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class M53_stream{
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(4,5,7,3,2,6);
        
        Stream<Integer> s1 = num.stream();
        Stream<Integer> s2 = s1.filter(n->n%2==0);
        Stream<Integer> s3 = s2.map(n->n+2);
        int result = s3.reduce(0, (c,e)->c+e);

        // s3.forEach(n->System.out.print(n+" "));
        // System.out.println();

        System.out.println(result);
    }
}