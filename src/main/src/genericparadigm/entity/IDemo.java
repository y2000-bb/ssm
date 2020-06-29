package genericparadigm.entity;

/**
 * 此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
 * 在实例化泛型类时，必须指定T的具体类型
 * @param <T>
 */
public class IDemo<T> {

    private T key;



    public IDemo(T key){
        this.key  = key;
    }

    public IDemo() {

    }


    public T getKey(){
        return key;
    }
}
