package br.ufrn.imd.almoxorifado.dominio;

import java.math.BigDecimal;

/**
 * Classe que representa item da requisicao
 * @author joicy
 *
 */
public class ItemRequisicao {

		private Material material;
		private BigDecimal qtdRequisitada;
		private BigDecimal qtdAtendida;
		private UnidadeMedida unidadeMedida;
		
		public ItemRequisicao() {}

		public ItemRequisicao(Material material, BigDecimal qtdRequisitada, BigDecimal qtdAtendida,
				UnidadeMedida unidadeMedida) {
		
			this.material = material;
			this.qtdRequisitada = qtdRequisitada;
			this.qtdAtendida = qtdAtendida;
			this.unidadeMedida = unidadeMedida;
		}

		public Material getMaterial() {
			return material;
		}

		public void setMaterial(Material material) {
			this.material = material;
		}

		public BigDecimal getQtdRequisitada() {
			return qtdRequisitada;
		}

		public void setQtdRequisitada(BigDecimal qtdRequisitada) {
			this.qtdRequisitada = qtdRequisitada;
		}

		public BigDecimal getQtdAtendida() {
			return qtdAtendida;
		}

		public void setQtdAtendida(BigDecimal qtdAtendida) {
			this.qtdAtendida = qtdAtendida;
		}

		public UnidadeMedida getUnidadeMedida() {
			return unidadeMedida;
		}

		public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
			this.unidadeMedida = unidadeMedida;
		}

		@Override
		public String toString() {
			return "ItemRequisicao [material=" + material + ", qtdRequisitada=" + qtdRequisitada + ", qtdAtendida="
					+ qtdAtendida + ", unidadeMedida=" + unidadeMedida + "]";
		}
		
		
		
		
}
