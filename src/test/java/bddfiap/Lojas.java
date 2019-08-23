
package bddfiap;

import java.util.HashMap;
import java.util.Map;

class Lojas {
    private HashMap<String, Map> lojas = new HashMap<String, Map>();
    public Lojas() {
        HashMap<String, Integer> loja1 = new HashMap<String, Integer>();
        loja1.put("Prod 1", 3);
        loja1.put("Prod 2", 5);

        HashMap<String, Integer> loja2 = new HashMap<String, Integer>();
        loja2.put("Prod 3", 2);
        loja2.put("Prod 4", 6);

        // Inserindo inventário das lojas
        lojas.put("Loja 1", loja1);
        lojas.put("Loja 2", loja2);
    }
    String pesquisar (String prod) {
        String retorno = "";
        for (Map.Entry<String, Map> x : lojas.entrySet()) {
            String loja = x.getKey();
            Map produtos = x.getValue();
            Integer qtd = (Integer) produtos.get(prod);
            if (qtd != null) {
                retorno += loja+" tem "+qtd+" unidades do "+prod;
            }
        }
        if (retorno == "") { retorno = "Produto não disponível"; }
        return retorno;
    }
}
