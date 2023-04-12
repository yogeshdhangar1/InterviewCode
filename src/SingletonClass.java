
// Cognizant Problem
public class SingletonClass {
    // singleton class We Have Only One Instance Variable That Globally Acces By Outside
    // After I Have Create Variable At Private  And Static And Retrun Instace Variable
    private  static SingletonClass instace;
    private SingletonClass(){

    }
    // Create A Method To Return This Class
    public static SingletonClass getInstace(){
        if(instace==null){
            // if instace alreadry created then return to class & instace not created Then Created instace and retrun it this
            // pattern is called as double chain blocking pattern

            synchronized (SingletonClass.class){
                if(instace==null){
                    instace = new SingletonClass();
                }
            }
        }
        return instace;
    }
}
