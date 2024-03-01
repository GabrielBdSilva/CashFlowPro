package br.com.fiap.cashflowpro.model;
// os valores de record n podem ser mudados o objeto categoria durante a passagem de uma passem pra outra ninguem pode mudar categoria
public record Categoria(Long id, String nome, String icone) {

}
//isso é equivalente a todo o codigo que tinha os getters e setters
