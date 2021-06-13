package org.airms.airlinemanagementsystem.core.utilities.results;

public class DataResult<T> extends Result{

    private T data;
    public DataResult(T date, boolean success) {
        super(success);
        this.data = date;
    }

    public DataResult(T date, boolean success, String message) {
        super(success, message);
        this.data = date;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
