public class TestSingelton {
    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstace();
        SingletonClass singletonClass2 = SingletonClass.getInstace();

        if(singletonClass2==singletonClass2){
            System.out.println("Both Object Are Same ");
        }else{
            System.out.println("Both Object Are Different");
        }
    }
}
