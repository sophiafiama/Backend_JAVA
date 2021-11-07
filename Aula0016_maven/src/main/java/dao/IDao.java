package dao;

public interface IDao <T> {

    public T salvar(T t);
    public T buscar(Integer id);
    public void deletar(T t);
    public T atualizar(T t);
}
