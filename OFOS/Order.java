package OFOS;

public class Order {
    int qty = 1;
    MenuItem[] item = new MenuItem[5];
    public void addItem(MenuItem item, int qty){
        this.item = new MenuItem[]{item};
    this.qty = qty;
    }

    void printBill() {
        for (int i = 0; i < 5; i++) {
            


        }
        System.out.println();
    }

        }

