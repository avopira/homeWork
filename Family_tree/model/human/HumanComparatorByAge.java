package Family_tree.model.human;

import java.util.Comparator;

import Family_tree.model.family_tree.ItemFamilyTree;

public class HumanComparatorByAge<T extends ItemFamilyTree> implements Comparator<T> {
    public int compare(T human1, T human2){
        return human1.getAge() - human2.getAge();
    }

}
