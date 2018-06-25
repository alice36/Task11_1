import java.util.ArrayList;

public class ArrayMethods {
    public static ArrayList revert(ArrayList<Integer> a){
        ArrayList<Integer> names = new ArrayList<>();
        for (int i = a.size() -1 ; i>=0; i--) names.add(a.get(i));
        return names;
    }

    public static String sumP(ArrayList<Integer> a){
        int sum=0;
        String finalStr;
        for (int i = 0 ; i< a.size(); i++) sum = sum + a.get(i);
        finalStr= format(a) + " = " + sum;
        return finalStr;
    }

    public static int max(ArrayList<Integer> a){
        int max=0;
        for (int i = 0 ; i< a.size(); i++) if (a.get(i)>max)  max=a.get(i);
        return max;
    }

    public static int min(ArrayList<Integer> a){
        int min=a.get(0);
        for (int i = 0 ; i< a.size(); i++) if (a.get(i)<min)  min=a.get(i);
        return min;
    }

    private static String format(ArrayList<Integer> a){
        String finalStr = "";
        for (int i = 0 ; i< a.size(); i++) {
            finalStr = finalStr + a.get(i)  ;
            if (i<a.size()-1) finalStr = finalStr + " + ";
        }
        return finalStr;
    }
}
