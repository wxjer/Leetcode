package common;

public class LazyInstance {
    public static LazyInstance instance;

    private LazyInstance() {

    }

    public static LazyInstance getInstance() {
        if (instance == null) {
            synchronized (LazyInstance.class) {
                if (instance == null)
                    instance = new LazyInstance();
            }
        }
        return instance;
    }


    public LazyInstance getInstance2() {
        if (instance == null) {
            instance = new LazyInstance();
        }
        return instance;
    }
}
