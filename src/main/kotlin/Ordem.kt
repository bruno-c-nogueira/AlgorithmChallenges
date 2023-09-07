data class Ordem(val id: Int, var tipo: String, val items: List<Item>)

data class Item(val id: Int, val modelo: String, val idOrdem: Int?)

data class OrdemSemiinsumos(val id: Int, val quantidade: Int, val ordem: Ordem, val item: Item)
