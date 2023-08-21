import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Recipe {
    private String name;
    private int price;
    protected ArrayList<Ingredient> resourceArrayList;

    Recipe(){
        resourceArrayList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPrice(){
        return price;
    }

    public ArrayList<Ingredient> getResources() {
        return resourceArrayList;
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setPrice(int price){
        this.price = price;
    }

    public void addResource(Ingredient res) {
        this.resourceArrayList.add(res);
    }

    public String makeCoffee() {


        StringBuilder str = new StringBuilder();
        str.append(this.name);
        str.append(" seçtiniz. Bu içeceğimiz ");

        Map<Ingredient, Integer> itemCounts = new HashMap<>();

        for (Ingredient resource : getResources()) {
            itemCounts.put(resource, itemCounts.getOrDefault(resource, 0) + 1);
        }

        int i = 0;
        int size = itemCounts.size();
        for (Map.Entry<Ingredient, Integer> entry : itemCounts.entrySet()) {
            String resourceName = entry.getKey().toString();
            int count = entry.getValue();
            boolean isLast = (++i) == size;

            if (isLast && size != 1) {
                str.delete(str.length() - 2, str.length());
                str.append(" ve ");
            }

            str.append(count) ;
            str.append(" doz ");
            str.append(resourceName.toLowerCase());

            if (!isLast && size != 1) str.append(", ");

        }

        str.append(" içermektedir. Afiyet olsun.");

        return str.toString();
    }
}
