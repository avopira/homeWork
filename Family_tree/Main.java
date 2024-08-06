package Family_tree;

import Family_tree.view.ConsoleUI;
import Family_tree.view.View;

public class Main {
    public static void main(String[] args){
        View view = new ConsoleUI();
        view.start();

        // Service service = new Service();

        // Human dad = service.addToTree("Aibek", Gender.Male, LocalDate.of(1970, 9, 4));
        // Human mom = service.addToTree("Nurila", Gender.Female, LocalDate.of(1970,11,18), null, dad, null, null);
        // Human bro = service.addToTree("Askar", Gender.Male, LocalDate.of(1994,4,10), null, null, dad, null);
        // Human me = service.addToTree("Kamila", Gender.Female, LocalDate.of(1999,4,7), null, null, null, null);
        // Human grandma1 = service.addToTree("Aliya", Gender.Female, LocalDate.of(1948,9,2),null, null, null, null);
        // Human grandpa2 = service.addToTree("Pernebek", Gender.Male, LocalDate.of(1936,11,26), LocalDate.of(2022,12,31),null, null, null);
        // Human grandma2 = service.addToTree("Patima", Gender.Female, LocalDate.of(1941,11,20), null, null, null, null);
        
        // dad.getMarried(mom);
        // dad.addChild(bro);
        // mom.addChild(me);     
        // dad.addMother(grandma1);
        // grandpa2.getMarried(grandma2);
        // grandma2.addChild(mom);

        // System.out.println(service.getHumanListInfo());
        // service.sortByAge();
        // System.out.println(service.getHumanListInfo());
        // service.sortByName();
        // System.out.println(service.getHumanListInfo());
        
        // // FamilyTree tree = testTree();
        // // FamilyTree tree = readTree();

        // saveTree(service.tree);
    }

    // private static FamilyTree readTree(){
    //     FileHandler fh = new FileHandler();
    //     return (FamilyTree) fh.read();
    // }
    
    // private static void saveTree(FamilyTree tree) {
    //     FileHandler fh = new FileHandler();
    //     fh.save(tree);
    // }



    // private static FamilyTree testTree(){
    //     FamilyTree familyTree = new FamilyTree();
        
        // Human dad = new Human("Aibek", Gender.Male, LocalDate.of(1970, 9, 4), null, null, null, null);
        // Human mom = new Human("Nurila", Gender.Female, LocalDate.of(1970,11,18), null, null, null, null);
        
        // familyTree.addHuman(dad);
        // familyTree.addHuman(mom);
        
        // familyTree.getMarried(dad, mom);


        // Human bro = new Human("Askar", Gender.Male, LocalDate.of(1994,4,10), null, null, dad, mom);
        // Human me = new Human("Kamila", Gender.Female, LocalDate.of(1999,4,7), null, null, null, null);
        
        // familyTree.addHuman(bro);
        // familyTree.addHuman(me);

        // mom.addChild(me);     
        
        
        // Human grandpa1 = new Human("Aspan", Gender.Male, LocalDate.of(1943,2,9), LocalDate.of(2013,4,8), null, null, null);
        // Human grandma1 = new Human("Aliya", Gender.Female, LocalDate.of(1948,9,2),null, null, null, null);
        
        // familyTree.addHuman(grandpa1);
        // familyTree.addHuman(grandma1);

        // familyTree.getMarried(grandma1, grandpa1);
        // dad.addMother(grandma1);
        
        // grandpa1.addChild(dad);
        // familyTree.getDivorsed(grandma1, grandpa1);
        
       
        // Human grandpa2 = new Human("Pernebek", Gender.Male, LocalDate.of(1936,11,26), LocalDate.of(2022,12,31),null, null, null);
        // Human grandma2 = new Human("Patima", Gender.Female, LocalDate.of(1941,11,20), null, null, null, null);

        // familyTree.addHuman(grandpa2);
        // familyTree.addHuman(grandma2); 

        // familyTree.getMarried(grandpa2,grandma2);
        
        // mom.addMother(grandpa2);
        

        // Human hubby = new Human("Yerke", Gender.Male, LocalDate.of(1991, 11, 15));
        
        // familyTree.addHuman(hubby);
        // familyTree.getMarried(me, hubby);

        // Human SIL = new Human("Bota", Gender.Female, LocalDate.of(1999, 4, 16));
        
        // familyTree.addHuman(SIL);
        // familyTree.getMarried(bro, SIL);
        
        // System.out.println(familyTree);

    //     return familyTree;

    // }
}
