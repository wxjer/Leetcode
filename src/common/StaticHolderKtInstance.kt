package common

class StaticHolderKtInstance {
    companion object {
        val instance: StaticHolderKtInstance = StaticHolder.Instance;
    }

    private object StaticHolder {
        val Instance: StaticHolderKtInstance = StaticHolderKtInstance()
    }
}