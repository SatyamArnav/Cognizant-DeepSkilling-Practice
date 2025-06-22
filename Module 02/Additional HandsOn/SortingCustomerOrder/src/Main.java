class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int id, String name, double price) {
        this.orderId = id;
        this.customerName = name;
        this.totalPrice = price;
    }

    public String toString() {
        return "Order ID: " + orderId + ", Customer: " + customerName + ", Total: ₹" + totalPrice;
    }

void bubbleSort(Order[] orders) {
    for (int i = 0; i < orders.length - 1; i++) {
        for (int j = 0; j < orders.length - i - 1; j++) {
            if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                Order temp = orders[j];
                orders[j] = orders[j + 1];
                orders[j + 1] = temp;
            }
        }
    }
}
void quickSort(Order[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

int partition(Order[] arr, int low, int high) {
    double pivot = arr[high].totalPrice;
    int i = low - 1;
    for (int j = low; j < high; j++) {
        if (arr[j].totalPrice <= pivot) {
            i++;
            Order temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    Order temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order[] orders = new Order[] {
	            new Order(101, "Ravi", 2500.50),
	            new Order(102, "Neha", 1499.99),
	            new Order(103, "Amit", 3200.00),
	            new Order(104, "Priya", 1999.75),
	            new Order(105, "Rahul", 1800.00)
	        };
	        System.out.println("Original Orders:");
	        for (Order o : orders) {
	            System.out.println(o);
	        }
	        Order sorter = new Order(0, "", 0); 
	        sorter.bubbleSort(orders);

	        System.out.println("\nOrders after Bubble Sort (by Total Price):");
	        for (Order o : orders) {
	            System.out.println(o);
	        }
	        orders = new Order[] {
	            new Order(101, "Ravi", 2500.50),
	            new Order(102, "Neha", 1499.99),
	            new Order(103, "Amit", 3200.00),
	            new Order(104, "Priya", 1999.75),
	            new Order(105, "Rahul", 1800.00)
	        };
	        sorter.quickSort(orders, 0, orders.length - 1);

	        System.out.println("\nOrders after Quick Sort (by Total Price):");
	        for (Order o : orders) {
	            System.out.println(o);
	        }

	}

}
