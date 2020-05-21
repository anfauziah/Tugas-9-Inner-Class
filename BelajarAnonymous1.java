public class BelajarAnonymous1 {
public static void main(String[] args) {
A a = new A() {
void lakukanSesuatu() {
i++;
System.out.println("i = " + i);
}

//Di bawah ini adalah method yang tidak ada di class A

void newMethod() {
System.out.println("Hallo, nama saya Anton");
}
};

a.lakukanSesuatu(); //Tidak error

}
}