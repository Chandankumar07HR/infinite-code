import java.util.Scanner;
class ItemType {
    private String name;
    private String costPerDay;
    private String deposit;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(String costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "ItemType{" +
                "name='" + name + '\'' +
                ", costPerDay=" + costPerDay +
                ", deposit=" + deposit +
                '}';
    }

    static class Test{
        public static void main(String[] args) {
            Test test = new Test();
            ItemType I = new ItemType();
            test.fun(I);
        }
        void fun(ItemType IT){
            setItem(IT);
            display(IT);
        }
        void setItem( ItemType IT){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the item type name - ");
            String name = sc.next();
            System.out.println("Enter the cost per day - ");
            String de = sc.next();
            System.out.println("Enter the deposit - ");
            String cpd = sc.next();
            IT.setName(name);
            IT.setDeposit(de);
            IT.setCostPerDay(cpd);
        }
        void display(ItemType IT){
            System.out.println("Item type details are ");
            System.out.println("Name : "+IT.getName()+"\n"+"Cost per day : "+IT.getCostPerDay()+"\n"+"Deposit : "+IT.getDeposit());
        }
    }
}
