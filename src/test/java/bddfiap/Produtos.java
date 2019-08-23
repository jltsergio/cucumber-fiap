
package bddfiap;

import java.util.HashMap;

class Produtos {
    private HashMap<String, Integer> inventario = new HashMap<String, Integer>();
    public Produtos() {
        inventario.put("Prod 1", 3);
        inventario.put("Prod 2", 5);
        inventario.put("Prod 3", 2);
        inventario.put("Prod 4", 6);
    }
    String pesquisar (String prod) {
        if (inventario.get(prod) != null) {
            return "Produto disponivel";
        } else {
            return "Produto não disponivel";
        }
    }
    Integer estoque(String prod) {
        Integer estoque = inventario.get(prod);
        if (estoque != null) {
            return estoque;
        } else {
            return 0;
        }
    }
}
