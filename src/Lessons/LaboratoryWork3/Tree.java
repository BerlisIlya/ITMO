package Lessons.LaboratoryWork3;

public class Tree {
    private Integer age;
    private Boolean conditionTree;
    private String nameTree;

    public Tree(Integer age, String nameTree) {
        this.age = age;
        this.nameTree = nameTree;
    }

    public Tree(Integer age, Boolean conditionTree, String nameTree) {
        this.age = age;
        this.conditionTree = conditionTree;
        this.nameTree = nameTree;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getConditionTree() {
        return conditionTree;
    }

    public void setConditionTree(Boolean conditionTree) {
        this.conditionTree = conditionTree;
    }

    public String getNameTree() {
        return nameTree;
    }

    public void setNameTree(String nameTree) {
        this.nameTree = nameTree;
    }

    public String toString() {
        return "Tree{" +
                "age: " + age + ", " +
                "conditionTree: " + conditionTree + ", " +
                "nameTree: " + nameTree + ", " +
                "}";
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        Tree tree1 = new Tree(125, "Дуб");
        Tree tree2 = new Tree(20, true, "Тополь");

        System.out.println(tree);
        System.out.println(tree1);
        System.out.println(tree2);
    }
}

