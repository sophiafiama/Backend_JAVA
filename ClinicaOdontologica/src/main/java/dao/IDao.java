package dao;

public interface IDao <T> {

//    CRUD
    public T save(T t);
    public T search(Integer id);
    public void delete(T t); // Ainda verificando a possibilidade de ser um Integer id ao invés de um objeto
    public T update(T t); //
}
