public class SystematicStatistics {
    private String NameMethod;
    private int QtdOperation;
    private long currentTimeMillis;
    private String ordination;

    public SystematicStatistics(String nameMethod, int qtdOperation, long currentTimeMillis, String ordination) {
        NameMethod = nameMethod;
        QtdOperation = qtdOperation;
        this.currentTimeMillis = currentTimeMillis;
        this.ordination = ordination;
    }

    public String getOrdination() {
        return ordination;
    }

    public void setOrdination(String ordination) {
        this.ordination = ordination;
    }

    public String getNameMethod() {
        return NameMethod;
    }

    public void setNameMethod(String nameMethod) {
        NameMethod = nameMethod;
    }

    public int getQtdOperation() {
        return QtdOperation;
    }

    public void setCurrentTimeMillis(int currentTimeMillis) {
        this.currentTimeMillis = currentTimeMillis;
    }

    public void setQtdOperation(int qtdOperation) {
        QtdOperation = qtdOperation;
    }

    public long getCurrentTimeMillis() {
        return currentTimeMillis;
    }

    public void setCurrentTimeMillis(long currentTimeMillis) {
        this.currentTimeMillis = currentTimeMillis;
    }
}
