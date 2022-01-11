package common;

public class StaticHolderInstance {
    public StaticHolderInstance() {
    }

    public static StaticHolderInstance getInstance() {
        return StaticHolder.Instance;
    }

    private static class StaticHolder {
        public static StaticHolderInstance Instance = new StaticHolderInstance();
    }
}
